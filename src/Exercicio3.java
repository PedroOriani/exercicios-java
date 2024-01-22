public class Exercicio3 {
    public static void main(String[] args) {
        int num = 7; 

        System.out.println("Tabela de multiplicação por " + num);

        printTable(num);
    }

    static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
}
