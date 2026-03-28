package juanaprendendo.javacore.metodos.teste;

import juanaprendendo.javacore.metodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main() {
        Pessoa pessoa01 = new Pessoa();

        pessoa01.setNome("Juan");
        pessoa01.setIdade(20);
        //pessoa01.imprime();
        IO.println(pessoa01.getNome());
        IO.println(pessoa01.getIdade());
    }
}
