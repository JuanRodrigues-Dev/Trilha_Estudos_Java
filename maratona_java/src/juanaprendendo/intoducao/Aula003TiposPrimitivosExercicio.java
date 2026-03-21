package juanaprendendo.intoducao;

public class Aula003TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Juan Rodrigues Gomes";
        String endereco = "SÃ£o JosÃ© de Piranhas";
        double salario = 2089.48;
        String data = "15 de marÃ§o de 2026";

        IO.println(String.format(
                "Eu, %s morando no endereÃ§o %s confirmo que recebi o salÃ¡rio de %.2f, na data %s",
                nome, endereco, salario, data));
    }
}
