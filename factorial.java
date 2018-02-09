
/**
 * Programa para hallar el factorial de un numero n.
 * 
 * @author (Armando Rico grupo 1) 
 * @version (11-02-2018)
 */
import java.util.Scanner;
public class factorial
{
    public static void main(String[] args) 
    {
     Scanner teclado = new Scanner(System.in); 
     int f=1,n;
     
     System.out.print("Introduce un número: ");
     n= teclado.nextInt();
     for (int i = 1; i<=n;++i) 
     {
       f=f * i; 
       }
       System.out.println("El factorial de " + n + "es" + f);
    }   
    } 
