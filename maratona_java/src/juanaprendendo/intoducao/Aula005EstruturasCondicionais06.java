package juanaprendendo.intoducao;

public class Aula005EstruturasCondicionais06 {
    static void main() {
        int dia =4;
        switch (dia){
            case 1 :
                IO.println("Final de Semana");
                break;
            case 2 :
                IO.println("Dia Útil");
                break;
            case 3 :
                IO.println("Dia Útil");
                break;
            case 4 :
                IO.println("Dia Útil");
                break;
            case 5 :
                IO.println("Dia Útil");
                break;
            case 6 :
                IO.println("Dia Útil");
                break;
            case 7 :
                IO.println("Final de Semana");
                break;
            default:
                IO.println("Digite um dia válido de 1 até 7");
                break;
        }
    }
}
