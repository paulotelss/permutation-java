public class Combinatoria {
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

    // Método para calcular C(n, r) usando a fórmula de combinação
    public static long combinacao(int n, int r) {
        if (r < 0 || r > n) {
            throw new IllegalArgumentException("r deve estar entre 0 e n");
        }
        long numerador = fatorial(n);
        long fatorialR = fatorial(r);
        long fatorialNMenosR = fatorial(n - r);
        long denominador = fatorialR * fatorialNMenosR;
        return numerador / denominador;
    }
}
