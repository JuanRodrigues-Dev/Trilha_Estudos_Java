/*
A classe Scanner, que faz parte do pacote java.util, é como um "tradutor" que transforma o fluxo de bytes
que vem do teclado em tipos de dados que o Java entende (como int, double ou String).
Enquanto o println apenas exibe o texto e pula uma linha, o printf (print formatted) permite que você crie máscaras
de formatação. Isso é extremamente útil para alinhar tabelas ou limitar casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");

        double precoOriginal = sc.nextDouble();
        double precoComDesconto = precoOriginal * 0.90;
        System.out.printf("O valor com desconto é: R$ %.2f%n", precoComDesconto);

        sc.close();
    }
}
