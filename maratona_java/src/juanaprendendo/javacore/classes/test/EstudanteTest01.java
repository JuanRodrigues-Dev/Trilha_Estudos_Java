package juanaprendendo.javacore.classes.test;

import juanaprendendo.javacore.classes.dominio.Estudante;

public class EstudanteTest01 {
    static void main() {
        Estudante estudante = new Estudante();
        estudante.nome = "Juan";
        estudante.idade = 19;
        estudante.sexo = 'M';
        IO.println(estudante.nome);
        IO.println(estudante.idade);
        IO.println(estudante.sexo);
    }
}
