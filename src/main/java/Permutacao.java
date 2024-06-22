public class Permutacao {
    // Método para calcular o fatorial de um número
    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para calcular P(n, p) usando a fórmula de permutação
    public static long permutacao(int n, int p) {
        if (p < 0 || p > n) {
            throw new IllegalArgumentException("p deve estar entre 0 e n");
        }
        long numerador = fatorial(n);
        long denominador = fatorial(n - p);
        return numerador / denominador;
    }
}
