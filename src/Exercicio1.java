public class Exercicio1 {
    public static void main(String[] args) {
        numberType(-12);
    }

    static void numberType(int numero) {
        String parImpar = (numero % 2 == 0) ? "par" : "ímpar";

        String positivoNegativo = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "zero";

        System.out.println(numero + " é " + parImpar + " e " + positivoNegativo + ".");
    }
}

