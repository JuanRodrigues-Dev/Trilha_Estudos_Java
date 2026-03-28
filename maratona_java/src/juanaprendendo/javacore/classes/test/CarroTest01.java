package juanaprendendo.javacore.classes.test;

import juanaprendendo.javacore.classes.dominio.Carro;

public class CarroTest01 {
    static void main() {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        carro01.nome = "Fusca";
        carro01.modelo = "Sport";
        carro01.ano = 2000;

        carro02.nome = "Mustang";
        carro02.modelo = "Sport";
        carro02.ano = 2000;

        IO.println("Carro 1: ");
        IO.println(carro01.nome);
        IO.println(carro01.modelo);
        IO.println(carro01.ano);
        IO.println();
        IO.println("Carro 2: ");
        IO.println(carro02.nome);
        IO.println(carro02.modelo);
        IO.println(carro02.ano);


    }
}
