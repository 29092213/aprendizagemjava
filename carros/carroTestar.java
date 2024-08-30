package carros;

public class carroTestar {

    public static void main(String[] args) {
        
        carros c1 = new carros();

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 100;

        c1.acelerar(10);

        System.out.println(c1.vel);

    }
    
}
