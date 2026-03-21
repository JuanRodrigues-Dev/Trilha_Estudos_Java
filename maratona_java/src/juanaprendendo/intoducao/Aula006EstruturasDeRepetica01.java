package juanaprendendo.intoducao;

public class Aula006EstruturasDeRepetica01 {
    static void main() {
        //while, do while, for
        int cont = 0;
        IO.println("Dentro do while:");
        while(cont<=10){
            IO.println(cont);
            cont++;
        }
        cont=0;
        IO.println("Dentro do do while:");
        do {
            IO.println(cont);
            cont++;
        }while(cont<=10);
        cont=0;
        IO.println("Dentro do for:");
        for (int i=0;i<=10;i++){
            IO.println(cont++);
        }
    }
}
