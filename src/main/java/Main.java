import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os valores de n e r para combinação
        System.out.print("Digite o valor de n para combinação: ");
        int nComb = scanner.nextInt();
        System.out.print("Digite o valor de r para combinação: ");
        int rComb = scanner.nextInt();

        // Calcula e exibe C(n, r)
        long resultadoComb = Combinatoria.combinacao(nComb, rComb);
        System.out.println("C(" + nComb + "," + rComb + ") = " + resultadoComb);

        // Solicita ao usuário os valores de n e p para permutação
        System.out.print("Digite o valor de n para permutação: ");
        int nPerm = scanner.nextInt();
        System.out.print("Digite o valor de p para permutação: ");
        int pPerm = scanner.nextInt();

        // Calcula e exibe P(n, p)
        long resultadoPerm = Permutacao.permutacao(nPerm, pPerm);
        System.out.println("P(" + nPerm + "," + pPerm + ") = " + resultadoPerm);

        scanner.close();
    }
}
