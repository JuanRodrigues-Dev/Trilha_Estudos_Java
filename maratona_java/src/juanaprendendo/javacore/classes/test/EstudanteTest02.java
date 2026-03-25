package juanaprendendo.javacore.classes.test;

import juanaprendendo.javacore.classes.dominio.Estudante;

public class EstudanteTest02 {
    static void main() {
        Estudante estudante2 = new Estudante();
        IO.println(estudante2.nome);
        IO.println(estudante2.sexo);
        IO.println(estudante2.idade);
    }
}
