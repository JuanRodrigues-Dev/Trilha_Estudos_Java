package juanaprendendo.intoducao;

public class Aula005EstruturasCondicionais02 {
    static void main() {
        int idade =15;
        if(idade<15){
            IO.println("Categoria Infantil");
        }else if(idade>=15 && idade < 18){
            IO.println("Categoria Juvenil");
        }else{
            IO.println("Categoria Adulta");
        }
    }
}
