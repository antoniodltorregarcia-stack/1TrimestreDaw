
/**
 * Diseñar un programa que muestre la suma de los 10 primeros impares.
 * 
 * @author (Tony) 
 * @version (3.10)
 */
public class Ejercicio10 {
    public static void main (String[]args) {
        System.out.println("Primeros diez impares");
        
        int n = 0;
        int total = 0;
        
        for (int i = 1; n != 10; i++) {
            if (i % 2 != 0) {
                System.out.println( i );
                n++;
            }
            
            total += i;
        }
        
        System.out.println("Suma total = " + total);
    }
}