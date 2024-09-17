import java.util.Scanner;

public class calculadora {

    public static int soma(int primeiroValor, int segundoValor) {
        int resultado = primeiroValor + segundoValor;
        return resultado;
    }
    
    public static String leituraTeclado() {
        Scanner teclado = new Scanner(System.in);
        String valorDigitado = teclado.next();
        //removido o close do teclado aqui pois nao leria mais nada
        return valorDigitado;
    }

    public static void subtracao() {
        try {
            System.out.print("Digite o primeiro valor: ");
            int primeiroValor = Integer.parseInt(leituraTeclado());
            
            System.out.print("Digite o segundo valor: ");
            int segundoValor = Integer.parseInt(leituraTeclado());
            
            int resultado = primeiroValor - segundoValor;
            System.out.println("Resultado da subtracao: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        }
    }

    public static void multiplicacao(int primeiroValor, int segundoValor) {
        int resultado = primeiroValor * segundoValor;
        System.out.println("Resultado da multiplicacao: " + resultado);
    }

    public static int divisao() {
        try {
            System.out.print("Digite o primeiro valor: ");
            int primeiroValor = Integer.parseInt(leituraTeclado());
            
            System.out.print("Digite o segundo valor: ");
            int segundoValor = Integer.parseInt(leituraTeclado());
            
            int resultado = primeiroValor / segundoValor;
            return resultado;
        } catch (Exception e) {
            System.out.println("Erro: Operação inválida.");
            return 0;//o codigo pediu pra retornar algum inteiro
        }
    }
    
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) { //loop infinito ate que digite S
            try {// tenta executar em caso de erro cai no catch
                int primeiroValor, segundoValor, resultado;

                System.out.println("Calculadora");
                System.out.println("---------------------------");
                System.out.println("(+) Adicao");
                System.out.println("(-) Subtracao");
                System.out.println("(*) Multiplicacao");
                System.out.println("(/) Divisao");
                System.out.println("(s) Sair");
                System.out.println("---------------------------");
                System.out.print("Opcao: ");
                String opcaoDigitada = leituraTeclado();
                
                switch(opcaoDigitada) {
                    case "+":
                        System.out.println("Opcao selecionada: soma");
                        
                        System.out.print("Digite o primeiro valor: ");
                        primeiroValor = Integer.parseInt(leituraTeclado());
                        
                        System.out.print("Digite o segundo valor: ");
                        segundoValor = Integer.parseInt(leituraTeclado());
                        
                        // Implementar
                        resultado = soma(primeiroValor, segundoValor);
                        System.out.println("Resultado da soma: " + resultado);
                        break;
                    
                    case "-":
                        System.out.println("Opcao selecionada: subtracao");
                        // Implementar
                        subtracao();
                        break;
                    
                    // A subtracao deve ser realizada através de um método
                    // sem retorno e sem parâmetros
                    case "*":
                        System.out.println("Opcao selecionada: multiplicacao");
        
                        System.out.print("Digite o primeiro valor: ");
                        primeiroValor = Integer.parseInt(leituraTeclado());
                        
                        System.out.print("Digite o segundo valor: ");
                        segundoValor = Integer.parseInt(leituraTeclado());
                        
                        // Implementar
                        multiplicacao(primeiroValor, segundoValor);
                        
                        break;
                    case "/":
                        System.out.println("Opcao selecionada: divisao");
                        
                        // Implementar
                        resultado = divisao();
                        System.out.println("Resultado da divisao: " + resultado);
                        
                        break;
                    case "s":
                        continuar = false;
                        System.out.println("Saindo da calculadora...");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                }
            } catch (Exception e) { //caso de erro
                System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
            }
        }
    }
}
