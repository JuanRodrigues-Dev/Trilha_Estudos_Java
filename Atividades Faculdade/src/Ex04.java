import java.util.Scanner;

public class Ex04 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite cinco números entre 1 e 30:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Número %d: ", i + 1);
            int leitura = input.nextInt();

            if (leitura >= 1 && leitura <= 30) {
                numeros[i] = leitura;
            } else {
                System.out.println("Número inválido! Digite um valor entre 1 e 30.");
                i--;
            }
        }

        System.out.println("\n--- Gráfico de Barras ---");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%2d: ", numeros[i]);

            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}
