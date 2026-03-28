package juanaprendendo.javacore.metodos.teste;

import juanaprendendo.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int n1 = 1;
        int n2 = 2;
        calculadora.alterDois(n1,n2);
        IO.println("Dentro do teste dois numeros: ");
        IO.println("n1 " + n1);
        IO.println("n2 " + n2);
    }
}
