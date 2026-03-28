package juanaprendendo.javacore.metodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        IO.println(this.nome);
        IO.println(this.idade);
        IO.println(this.sexo);
    }
}
