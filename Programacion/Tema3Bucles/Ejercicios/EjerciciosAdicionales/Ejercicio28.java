import java.util.Scanner;

/**
 *  Crea un programa equivalente al del ejercicio 27 pero teniendo en cuenta que ahora
 *  el cuadrado dibujado en pantalla tiene que quedar hueco:
 *  Introduzca longitud del lado: 6
 *  
 * 
 * @author (Tony) 
 * @version (Adicional28)
 */
public class Ejercicio28 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
                for (int e = 0; e < n; e++) {
                    if (i == 0 || i == (n - 1)) {
                        System.out.print("*");
                    } else if (e == 0 || e == (n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}