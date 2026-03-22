package juanaprendendo.intoducao;

public class Aula007Arrays02 {
    static void main() {
        String nome[] = new String[3];
        nome[0]="Goku";
        nome[1]="Kurosaki";
        nome[2]="Luffy";
        for (int i = 0; i < nome.length; i++) {
            IO.println(nome[i]);
        }
    }
}
