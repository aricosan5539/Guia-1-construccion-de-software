
/**
 * Given a number, verify whether its prime or not
 * 
 * @author (grupo 1 Armando Rico) 
 * @version (11-02-18)
 */
 import java.util.Scanner;
public class NumPrimo { 
    public static void main (String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        int n, cont; 
        cont=0; 
        System.out.println("Escriba un numero"); 
        n = teclado.nextInt(); 
        for (int i=1; i<=n; i++) { 
            if (n % i == 0){ 
                cont = cont + 1; 
            } 
        } 
        if (cont==2){ 
            System.out.println("PRIME"); 
        } else { 
            System.out.println("NOT PRIME"); 
        } 
    } 
} 

