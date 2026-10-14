import java.util.Scanner;

/**
 * para dos números dadas, a y b, es posible buscar el máximo común divisor (el número más grande que divide a ambos
 * mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente,
 * el primer número que divide a ambos simultáneamente. Realiza un programa que calcule elmáximo común divisor de dos números

 * 
 * @author (Tony) 
 * @version (3.17)
 */
public class Ejercicio17 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número a");
        
        int a = sc.nextInt();
        
        System.out.println("Introduce el número b");
        
        int b = sc.nextInt();
        
        int mayor = b;
        
        int cont = 1;
        
        int divisor = 0;
        if (a > b) {
            mayor = a;
        }
        
        do {
            if (a % cont == 0 && b % cont == 0) {
                divisor = cont;
            }
            cont++;
        } while (cont != mayor);
        
        System.out.println("El máximo común divisor es --> " + divisor);
    }
}