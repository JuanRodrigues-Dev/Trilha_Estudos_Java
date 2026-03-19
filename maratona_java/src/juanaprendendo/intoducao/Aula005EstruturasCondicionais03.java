package juanaprendendo.intoducao;

public class Aula005EstruturasCondicionais03 {
    static void main() {
        double salario = 6000;
        String mensagem = "Vou mandar 500";
        String mensagemSem = "Não consigo mandar";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagem : mensagemSem;

        IO.println(resultado);

    }
}