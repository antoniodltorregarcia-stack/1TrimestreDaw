import java.util.Scanner;

/**
 *  Realiza una variación a partir del ejercicio 28.
 *  En este casoqueremos convertir el cuadrado hueco en una O digital:
 *  Introduzca tamaño del lado: 6
 *  
 * 
 * @author (Tony) 
 * @version (Adicional20)
 */
public class Ejercicio29 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        
        int n = sc.nextInt();
        
        for (int i = -2; i < n; i++) {
            if (i == -2 || i == n - 1) {
                for (int u = -2; u < n; u++) {
                    if (u == -2 || u == n - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*"); 
                    }
                }
            } else {
                for (int e = -2; e < n; e++) {
                    if (e == -2 || e == (n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            }
    }
}
