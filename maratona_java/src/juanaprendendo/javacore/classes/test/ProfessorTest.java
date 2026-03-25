package juanaprendendo.javacore.classes.test;

import juanaprendendo.javacore.classes.dominio.Professor;

public class ProfessorTest {
    static void main() {
        Professor professor = new Professor();
        professor.nome = "Naruto";
        professor.idade = 30;
        professor.sexo = 'M';
        IO.print(professor.nome +" "+ professor.idade + " " +professor.sexo);
    }
}
