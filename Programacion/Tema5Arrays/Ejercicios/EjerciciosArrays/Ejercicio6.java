import java.util.Scanner;

/**
 * En un juego de rol el mapa puede implementarse como una matriz donde las filas y las columnas representan lugares
 * (lugar 0, lugar 1, lugar 2, etc.) que estarán conectados. Si desde el lugar X podemos ir hacia el lugar Y, entonces
 * la matriz en la posición [x][y] valdrá cierto; en caso contrario, valdrá falso. Escribe una función que, dada una matriz
 * que representa el mapa y dos lugares, indique si es posible viajar desde el primer lugar al segundo (directamente
 * o pasando por lugares intermedios).
 * 
 * @author (Tony) 
 * @version (5.16)
 */
public class Ejercicio6 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int lugar [] = new int [5];
        
        System.out.println("¿Es posible viajar?: " + viaje(lugar,sc));
    }
    
    public static boolean viaje (int lugar[], Scanner sc) {
        System.out.println("Introduce el punto x");
        int x = sc.nextInt();
        System.out.println("Introduce el punto y");
        int y = sc.nextInt();
        
        int cont = 0;
        boolean posible = false;
        for (int i = x; i < lugar.length; i++) {
            if (i == y) {
                posible = true;
                System.out.println("Numero de saltos: " + cont);
                break;
            } else {
               cont++;
               posible = false;
            }
        }
        
        return posible;
    }
    
    
}