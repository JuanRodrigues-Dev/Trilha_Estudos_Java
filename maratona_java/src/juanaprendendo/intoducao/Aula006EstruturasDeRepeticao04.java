package juanaprendendo.intoducao;

public class Aula006EstruturasDeRepeticao04 {
    static void main() {
        double valorTotal=30000;
        for (int parcela = 1; parcela <=valorTotal; parcela++) {
            double valorParcela=valorTotal/parcela;
            if (valorParcela>=1000){
                IO.println("Parcela " + parcela + " R$ " + valorParcela);
            }else{
                break;
            }
        }
    }
}
