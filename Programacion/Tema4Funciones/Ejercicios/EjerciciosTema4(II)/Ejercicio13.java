import java.util.Scanner;

/**
 * Crea la función muestraPares (int intNum) que muestre por consola los primeros n números pares. 
 * 
 * @author (Tony) 
 * @version (4.13)
 */
public class Ejercicio13 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero de numeros pares que quieres ver");
        
        int intNum = sc.nextInt();
        
        System.out.println("Hay " + muestraPares(intNum) + " numeros pares");
        
    }
    
    public static int muestraPares(int intNum) {
        int cont = 0;
        
        for (int i = 1; i <= intNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                cont++;
            }
        }
        
        System.out.println("");
        return cont;
    }
}