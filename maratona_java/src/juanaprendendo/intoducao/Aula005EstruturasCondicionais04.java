package juanaprendendo.intoducao;

public class Aula005EstruturasCondicionais04 {

    static void main() {
        double salarioAnual = 7000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa= 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto ;
        if(salarioAnual<34712){
            salarioAnual= salarioAnual*primeiraFaixa;
        }else if(salarioAnual>=34713 && salarioAnual<=68507){
            salarioAnual = salarioAnual*segundaFaixa;
        }else {
            salarioAnual=salarioAnual*terceiraFaixa;
        }
        IO.println(String.format("%.2f", salarioAnual));
    }
}
