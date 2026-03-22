package juanaprendendo.intoducao;

public class Aula008ArraysMultidimensionais01 {
    static void main() {
        int dias [] []= new int [3] [3];
        dias[0][0]= 21;
        dias[0][1]= 33;
        dias[0][2]= 34;

        dias[1][0]= 21;
        dias[1][1]= 33;
        dias[1][2]= 34;

        dias[2][0]= 21;
        dias[2][1]= 33;
        dias[2][2]= 34;
        for (int i = 0; i < 3; i++) {
            for(int c = 0; c < 3; c++){
                IO.println(dias[i][c]);
            }
        }
        IO.println("--------------------------------------");
        for (int numarray[]:dias){
            for(int num : numarray){
                IO.println(num);
            }
        }
    }
}
