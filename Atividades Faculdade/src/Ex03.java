import java.util.Scanner;

public class Ex03 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = input.nextInt();

        System.out.println("Números primos entre 2 e " + n + ":");

        // Percorre cada número de 2 até N
        for (int i = 2; i <= n; i++) {
            boolean ehPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        input.close();
    }
}
