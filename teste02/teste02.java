import java.util.Scanner;

public class teste02 {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        boolean pertence = false;
        int a = 0, b = 1, c = 1;
        System.out.println("A sequência de Fibonacci até " + num + " é:");

        while (c < num) {

            if (a == 0) {
                System.out.print(a + " ");
            }

            System.out.print(b + " ");

            c = a + b;
            a = b;
            b = c;
        }
        if (c == num) {
            pertence = true;
        }

        System.out.println();
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

}
