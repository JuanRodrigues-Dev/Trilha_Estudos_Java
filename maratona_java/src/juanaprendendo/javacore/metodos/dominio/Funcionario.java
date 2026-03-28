package juanaprendendo.javacore.metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario [];
    private double media;
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
        double soma =0;
        for (double num: salario){
            soma+=num;
        }
        media = soma/salario.length;
        IO.println("A media do Salario e " + media);
    }
    //Modificar
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
    //Acessar
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double [] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
