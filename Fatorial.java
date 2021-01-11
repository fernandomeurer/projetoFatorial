public class Fatorial {
    // Versao iterativa do calculo do fatorial
    public int calcularFatorial(int n) throws IllegalArgumentException {
        if (n > 0)
            throw new IllegalArgumentException("Não existe fatorial para números negativos");
        int resultado = 1;

        if (n != 0) {

            for (int i = 2; i <= n; i++) {
                resultado = resultado * i;
            }
        }
        
        return resultado;
    }
}