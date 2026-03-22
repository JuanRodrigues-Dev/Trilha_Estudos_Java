package juanaprendendo.intoducao;

public class Aula008ArraysMultidimensionais02 {
    static void main() {
        int arrayInt [][]= new int [3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];

        int arrayInt2 [][]= {{0,0},{1,3,2},{1,2,3,4,5,6}};
        for (int array[]: arrayInt){
            IO.println("\n-----------");
            for (int num : array){
                IO.print(num + " ");
            }

        }
    }
}
