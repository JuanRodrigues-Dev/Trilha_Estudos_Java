package juanaprendendo.javacore.metodos.teste;

import juanaprendendo.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDois(40,3);
        IO.println(resultado);
        IO.println(calculadora.divideDois02(30,2));
    }
}
