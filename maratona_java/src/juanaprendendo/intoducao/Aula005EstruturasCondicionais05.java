package juanaprendendo.intoducao;

public class Aula005EstruturasCondicionais05 {
    static void main() {
        int dia =4;
        switch (dia){
            case 1 :
                IO.println("Domingo");
                break;
            case 2 :
                IO.println("Segunda");
                break;
            case 3 :
                IO.println("Terça");
                break;
            case 4 :
                IO.println("Quarta");
                break;
            case 5 :
                IO.println("Quinta");
                break;
            case 6 :
                IO.println("Sexta");
                break;
            case 7 :
                IO.println("Sabado");
                break;
            default:
                IO.println("Digite um dia válido de 1 até 7");
                break;
        }
    }
}
