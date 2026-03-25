import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    static void main() {
                Scanner input = new Scanner(System.in).useLocale(Locale.US);

                System.out.print("Digite o nome do aluno: ");
                String nome = input.nextLine();

                System.out.print("Digite a primeira nota: ");
                double n1 = input.nextDouble();

                System.out.print("Digite a segunda nota: ");
                double n2 = input.nextDouble();

                System.out.print("Digite a terceira nota (peso 2): ");
                double n3 = input.nextDouble();

                // Cálculo da média ponderada
                double media = (n1 + n2 + (n3 * 2)) / 4;

                // Exibição dos resultados
                System.out.println("\n--- Resultado Final ---");
                System.out.println("Aluno: " + nome);
                System.out.printf("Média Final: %.2f%n", media);

                // Verificação de aprovação
                if (media >= 7.0) {
                    System.out.println("Situação: Aprovado");
                } else {
                    System.out.println("Situação: Reprovado");
                }

                input.close();

    }
}
