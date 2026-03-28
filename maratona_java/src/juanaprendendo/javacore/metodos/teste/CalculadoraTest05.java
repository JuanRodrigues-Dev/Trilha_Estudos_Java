package juanaprendendo.javacore.metodos.teste;

import juanaprendendo.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int num [] ={1,2,3,4,5};
        calculadora.somaArray(num);
        calculadora.somaArrayVarArgs(num);
        calculadora.somaArrayVarArgs(1,2,3,4,5,6,7,8,9,0);
    }
}
