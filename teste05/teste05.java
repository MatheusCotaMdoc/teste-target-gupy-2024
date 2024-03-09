import java.util.Scanner;

public class teste05 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma String: ");
        String str = scanner.nextLine();

        String invertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }

        System.out.println("String invertida: " + invertida);

    }

}

