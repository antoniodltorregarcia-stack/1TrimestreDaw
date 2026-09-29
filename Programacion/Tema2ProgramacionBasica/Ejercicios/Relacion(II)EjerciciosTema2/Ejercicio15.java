import java.util.Scanner;

/**
 * Escribe una aplicación que solicite por consola dos números reales que corresponden a la base 
 * y la altura de un triángulo. Deberá mostrarse su área. comprobando que los números introducidos
 * por el usuario no son negativos. algo que no tendría sentido. 
 * 
 * @author (Tony) 
 * @version (2.15)
 */
public class Ejercicio15 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("base:");
        
        int base = sc.nextInt();
        
        System.out.println("altura:");
        
        int alt = sc.nextInt();
        
        if (base < 0 || alt < 0) {
            System.out.println("No es lógico usar número negativos");
            return;
        }
        
        System.out.println("El area del triangulo es " + base * alt / 2);
    }
}