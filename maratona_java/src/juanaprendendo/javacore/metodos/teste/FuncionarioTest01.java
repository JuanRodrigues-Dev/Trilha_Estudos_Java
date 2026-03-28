package juanaprendendo.javacore.metodos.teste;

import juanaprendendo.javacore.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main() {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Juan");
        funcionario01.setIdade(20);
        funcionario01.setSalario(new double []{1000,2000,2000});

        funcionario01.imprime();

    }
}
