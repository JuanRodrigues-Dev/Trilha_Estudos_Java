package juanaprendendo.intoducao;

public class Aula004Operadores {
    static void main() {
        // + - / *
        int n1 = 10;
        int n2 = 20;
        double resultado = n1/ (double)n2;
        IO.println(n1-n2);
        //%
        int resto = 21%7;
        IO.println(resto);
        // <> <= >= == !=
        boolean isDezMaiorQueVinte= 10>20;
        IO.println(isDezMaiorQueVinte);

        // && || !
        int idade = 10;
        float salario = 3500F;
        boolean idDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean idDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;

        IO.println(idDentroDaLeiMenorQueTrinta);
        IO.println(idDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlay = 5000;
        boolean isPlayStationCompravel = valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;
        IO.println("Compravel: " + isPlayStationCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        IO.println(bonus);

        // ++ --
        int contador = 0 ;
        contador++;
        contador++;
        contador--;
        ++contador;
        --contador;
        IO.println(contador); // 1

    }

}
