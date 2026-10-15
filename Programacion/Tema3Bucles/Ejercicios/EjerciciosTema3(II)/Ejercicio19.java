import java.util.Scanner;

/**
 * Calcula la raíz cuadrada de un número natural mediante aproximaciones. En el caso de que no sea exacta,muestra el resto.
 * Por ejemplo, para calcular la raíz cuadrada de 23. probamos 12 1, 22 4, 32 9, 42 16, 5225 (nos pasamos),
 * resultando 4 la raíz cuadrada de 23 con un resto (23 - 16) de 7.
 * 
 * @author (Tony) 
 * @version (3.19)
 */
public class Ejercicio19 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número y te dire su raiz cuadrado y su resto si existe");
        
        int n = sc.nextInt();
        
        int cuadrado = 0;

        int raiz = 1;
        
        while (cuadrado <= n) { 
            cuadrado = raiz * raiz; //Ej --> 2 * 2 = 4 (2 elevado al cuadrado)
            
            if (cuadrado > n) { //Si la solución del cuadrado se pasa, rompemos el bucle 
                break;
            }
            
            raiz++; //Va subiendo la raiz para sacarle el cuadrado a los numeros
        }
        
        raiz--; //Restamos uno ya que en el bucle siempre entra uno mas
        
        int resto = n - (raiz * raiz); // Sacamos el cuadrado de nuevo pero con uno menos

        System.out.println("La raiz de " + n + " es: " + raiz + " con un resto de " + resto);
    }
}