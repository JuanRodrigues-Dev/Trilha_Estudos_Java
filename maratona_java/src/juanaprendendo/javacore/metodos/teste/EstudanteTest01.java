package juanaprendendo.javacore.metodos.teste;

import juanaprendendo.javacore.metodos.dominio.Estudante;
import juanaprendendo.javacore.metodos.dominio.ImprimirEstudante;

public class EstudanteTest01 {
    static void main() {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimirEstudante impressora = new ImprimirEstudante();

        estudante.nome = "Midoria";
        estudante.idade = 18;
        estudante.sexo = 'M';


        estudante02.nome = "Juan";
        estudante02.idade = 20;
        estudante02.sexo = 'M';

        impressora.imprime(estudante);
        impressora.imprime(estudante02);

    }
}
