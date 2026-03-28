package juanaprendendo.javacore.metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario [];

    public void imprime(){
        IO.println(this.nome);
        IO.println(this.idade);
        IO.println("Salarios: ");
        for (double num: salario ){
            IO.println(num + " ");
        }
        imprimeMedia();
    }
    public void imprimeMedia(){
        double media;
        double soma =0;
        for (double num: salario){
            soma+=num;
        }
        media = soma/salario.length;
        IO.println("A media di Salario e " + media);
    }
}
