package juanaprendendo.javacore.metodos.dominio;

public class Calculadora {
    public void somaDois(){
        IO.println(10+10);
    }

    public void subDois(){
        IO.println(30-17);
    }
    public void multDois(int num1, int num2 ){
        IO.println(num1*num2);
    }
    public double divideDois (double n1 , double n2){
        if (n2==0){
            return 0;
        }
        return n1/n2;
    }
    public double divideDois02 (double n1 , double n2){
        if (n2!=0){
            return n1/n2;
        }
        else{
            return 0;
        }
    }
    public void alterDois(int n1, int n2){
        n1=99;
        n2=33;
        IO.println("Dentro do altera dois numeros: ");
        IO.println("n1 " + n1);
        IO.println("n2 " + n2);
    }
    public void somaArray( int [] numeros){
        int soma=0;
        for (int num: numeros){
            soma +=num;
        }
        IO.println(soma);
    }
    public void somaArrayVarArgs(int ... numeros){
        int soma=0;
        for (int num: numeros){
            soma +=num;
        }
        IO.println(soma);
    }
}
