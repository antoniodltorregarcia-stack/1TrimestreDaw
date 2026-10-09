import java.util.Scanner;

/**
 * Realiza un programa que convierta un número decimal en su representación binaria.
 * Hay que tener en cuenta que desconocemos cuantas cifras tiene el número que introduce el usuario.
 * Por simplicidad, iremos mostrando el número binario con un dígito por línea.
 * 
 * @author (Tony) 
 * @version (3.11)
 */
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un número y lo escribire en binario");
        
        int n = sc.nextInt();
        
        int resto;
        
        System.out.println("Codigo en binario ⬆");
        
        while (n != 0) {
            resto = n % 2;
            
            n /= 2;
            
            System.out.println(resto);
        }
        
        
    }
}