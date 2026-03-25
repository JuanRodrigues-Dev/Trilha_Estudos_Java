import java.util.Scanner;

public class Ex02 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        // A verificação de "ambos" deve vir primeiro
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Múltiplo de ambos");
        }
        else if (numero % 3 == 0) {
            System.out.println("Múltiplo de 3");
        }
        else if (numero % 5 == 0) {
            System.out.println("Múltiplo de 5");
        }
        else {
            System.out.println("Não é múltiplo de 3 nem de 5");
        }

        input.close();
    }
}
