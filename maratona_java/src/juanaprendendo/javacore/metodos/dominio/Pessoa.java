package juanaprendendo.javacore.metodos.dominio;

import javax.imageio.stream.IIOByteBuffer;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        IO.println(this.nome);
        IO.println(this.idade);
    }

    //Modificar Private
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade<0){
            IO.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }
    //Acessar Private

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
