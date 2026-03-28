package juanaprendendo.javacore.metodos.dominio;

public class ImprimirEstudante {
    public void imprime(Estudante estudante){
        IO.println("Aluno: ");
        IO.println(estudante.nome);
        IO.println(estudante.idade);
        IO.println(estudante.sexo);
    }
}
