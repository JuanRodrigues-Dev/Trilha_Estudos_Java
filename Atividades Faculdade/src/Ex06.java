import java.util.Scanner;

/*
import java.util.Scanner;

public class Contador {
    public static void main(String args) { => falta do []
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador) => Falta de Atualização no contador(o while vai rodar infinito).
                                                            Falta de ;
        }
        => Falta de fechar o Scanner
    }
}

 */
public class Ex06 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int contador = 0;

            while (contador <= 5) {
                System.out.println("Contador: " + contador);

                contador++;
            }

            sc.close();
        }
}
