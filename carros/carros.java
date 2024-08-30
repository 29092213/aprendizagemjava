package carros;

public class carros {

    //Atributos
    String marca;
    String nome;
    int ano;
    int vel;

    private String dono;

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getDono (){
        return this.dono;
    }

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
