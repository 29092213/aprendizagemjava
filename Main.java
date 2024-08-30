import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome; 
        System.out.print("Digite seu nome, por favor: ");
        nome = sc.nextLine(); 

        System.out.println("Seu nome é: " + nome);

        sc.close();
    }
}
