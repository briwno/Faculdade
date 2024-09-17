package entregar;
import java.util.*;

public class atividade {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        int opcao;
        do{ 

        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Verifique se existe o nome");
        System.out.println("4 - Editar um Nome");
        System.out.println("5 - Remover um Nome");
        System.out.println("6 - Sair");

        opcao = scan.nextInt();
        scan.nextLine();
        
        switch(opcao){
            case 1:
                
                    System.out.println("Digite o nome: ");
                    String nomeCadastrar = scan.nextLine();

                    if(lista.contains(nomeCadastrar)){
                        System.out.println("Nome já cadastrado");
                    }else{
                        lista.add(nomeCadastrar);
                        System.out.println("Nome cadastrado com sucesso");

                    }
                
                break;
            case 2:
                System.out.println("Listando todos os nomes: ");
                for(int i = 0; i < lista.size(); i++){
                    System.out.println(lista.get(i));
                }
                break;
            case 3:
                System.out.println("Digite o nome que deseja verificar: ");
                String nome = scan.nextLine();
                if(lista.contains(nome)){
                    System.out.println("O nome " + nome + " está na lista");
                }else{
                    System.out.println("O nome " + nome + " não está na lista");
                }
                break;
            case 4:
                System.out.println("Digite o nome que deseja editar: ");
                String nomeEditar = scan.nextLine();
                if(lista.contains(nomeEditar)){
                    System.out.println("Digite o novo nome: ");
                    String novoNome = scan.nextLine();
                    lista.set(lista.indexOf(nomeEditar), novoNome);
                    System.out.println("Nome editado com sucesso");
                }else{
                    System.out.println("Nome não encontrado");
                }
                break;
            case 5:
                System.out.println("Digite o nome que deseja remover: ");
                String nomeRemover = scan.nextLine();
                if(lista.contains(nomeRemover)){
                    lista.remove(nomeRemover);
                    System.out.println("Nome removido com sucesso");
                }else{
                    System.out.println("Nome não encontrado");
                }
                break;
            case 6:
                System.out.println("saindiu de tudo");
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }
    }while(opcao != 6);
}
    
}
