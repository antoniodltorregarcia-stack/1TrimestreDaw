import java.util.Scanner;

/**
 *  Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 (generado aleatoriamente).
 *  Para ellos se introduce por teclado una serie de números, para los que se indica: “mayor” o “menor”,
 *  según sea mayor o menor con respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se rinde
 *  (introduciendo un -1).
 * 
 * @author (Tony) 
 * @version (3.3)
 */
public class Ejercicio3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        int Random = (int)(Math.random() * 101);
        
        do {
            System.out.println("Numero: ");
            
            n = sc.nextInt();
            
            if (n == Random) {
                break;
            }
            
            if (n > Random) {
                System.out.println("El número secreto es mas pequeño ;)");
            } else System.out.println("El número secreto es mas grande :O");
        } while (n != -1);
        
        if (n == -1) {
            System.out.println("Te rendiste? el número secreto era: " + Random);
        } else System.out.println("¡Acertaste!");
    }
}