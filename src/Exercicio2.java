
public class Exercicio2 {
    public static void main(String[] args) {
        int tamanho = 8; 

        System.out.println("Sequência de Fibonacci de tamanho " + tamanho + ":");
        printFibonacci(tamanho);
    }

    static void printFibonacci(int tamanho) {
        int first = 0, second = 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
