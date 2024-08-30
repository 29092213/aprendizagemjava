package carros;

import java.util.Scanner;

public class repeticoesTeste {

  public static void main(String[] args) {
    
    Scanner sc =  new Scanner(System.in);

        int numeroSorte;
        System.out.println("Digite um numero: ");
        numeroSorte = sc.nextInt();
        while ( numeroSorte != 12) {
            numeroSorte = sc.nextInt();
        }
    sc.close();
  }
    
}
