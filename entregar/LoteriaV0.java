package entregar;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LoteriaV0 {

    public static double sorteio(List<Integer> numerosApostados, double valorAposta) {
        List<Integer> numerosValidos = validarNumeros(numerosApostados);

        if (numerosValidos.size() >= 6 && numerosValidos.size() <= 15) {
            List<Integer> numerosSorteados = sortearNumeros();

            System.out.println("Números Sorteados: " + numerosSorteados);
            System.out.println("Números Apostados: " + numerosApostados);

            int totalAcertos = contarAcertos(numerosApostados, numerosSorteados);
            if (totalAcertos == 6) {
                return valorAposta; // 100%
            } else if (totalAcertos == 5) {
                return valorAposta * 0.2; // 20%
            } else if (totalAcertos == 4) {
                return valorAposta * 0.05; // 5%
            }
        }
        return 0.0; // 0.0%
    }

    public static List<Integer> validarNumeros(List<Integer> numerosApostados) {
        List<Integer> numerosValidos = new ArrayList<>();

        for (Integer numero : numerosApostados) {
            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido: " + numero);
            }
            if (numerosValidos.contains(numero)) {
                System.out.println("Número repetido: " + numero);
            }
            numerosValidos.add(numero);
        }

        return numerosValidos;
    }

    public static List<Integer> sortearNumeros() {
        List<Integer> numerosSorteados = new ArrayList<>();
        int numeroSorteado;
        while (numerosSorteados.size() < 6) {
            numeroSorteado = new Random().nextInt(59) + 1;
            if (!numerosSorteados.contains(numeroSorteado)) {
                numerosSorteados.add(numeroSorteado);
            }
        }
        return numerosSorteados;
    }

    public static int contarAcertos(List<Integer> numerosApostados, List<Integer> numerosSorteados) {
        int totalAcertos = 0;
        for (Integer apostado : numerosApostados) {
            if (numerosSorteados.contains(apostado)) {
                totalAcertos++;
            }
        }
        return totalAcertos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numerosApostados = new ArrayList<>();

        while (numerosApostados.size() < 6 || numerosApostados.size() > 15) {
            numerosApostados.clear();
            System.out.println("Quantidade de Números Apostados: ");
            int quantidadeNumeros = scanner.nextInt();



            if (quantidadeNumeros >= 6 && quantidadeNumeros <= 15) {
                System.out.println("Insira seus " + quantidadeNumeros + " números: ");
                for (int i = 0; i < quantidadeNumeros; i++) {
                    numerosApostados.add(scanner.nextInt());
                }

            System.out.println("Valor da Aposta: ");
            double valorAposta = scanner.nextDouble();

            double premio = LoteriaV0.sorteio(numerosApostados, valorAposta);
            System.out.println("Prêmio: " + premio);
        }else {
            System.out.println("Quantidade de Números Inválida");
        }

        scanner.close();
    }
}

}
