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

        c1.freiar(100);

        System.out.println(c1.vel);
        c1.buzinar();

        System.out.println(" ------------------------ ");
        // Segundo Carro.


        carros c2 = new carros();

        c2.ano = 2000;
        c2.nome = "Palio";
        c2.vel = 40;

        c2.acelerar(20);

        System.out.println(c2.nome);
        System.out.println( c2.vel);

    }
    
}
