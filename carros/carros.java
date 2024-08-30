package carros;

public class carros {

    //Atributos
    String marca;
    String nome;
    int ano;
    int vel;

    //Métodos

    void acelerar(int aceleracao){
        vel += aceleracao;
    }
    void freiar (int reduzir){
        vel -= reduzir;
    }
    void buzinar (){
        System.out.println("bibibi");
    }
    
}