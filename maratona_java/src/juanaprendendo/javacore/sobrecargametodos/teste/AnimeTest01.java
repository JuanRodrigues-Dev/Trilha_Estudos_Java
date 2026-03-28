package juanaprendendo.javacore.sobrecargametodos.teste;

import juanaprendendo.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main() {
        Anime anime01 = new Anime();
        anime01.init("Espada 01", "TV" , 12 , "Acão");
        anime01.imprime();

    }

}
