package juanaprendendo.intoducao;

public class Aula007Arrays03 {
    static void main() {
        int numeros []= new int[3];
        int numeros1[]= {1,2,3,4,5};
        int numreos2[]=new int[]{1,2,3,4,5,6};
        for (int i = 0; i < numeros1.length; i++) {
            IO.println(numeros1[i]);
        }
        IO.println("-------------------------------------");
        for (int num:numreos2){
            IO.println(num);
        }
    }
}
