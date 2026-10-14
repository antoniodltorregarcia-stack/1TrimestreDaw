import java.util.Scanner;


/**
 * De forma similar a la Actividad de aplicación 3.17. implementa 1x1 algoritmo que calcule el mínimo común múltiplo de dos números dados.
 * 
 * @author (Tony) 
 * @version (3.18)
 */
public class Ejercicio18 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el número a");
        
        int a = sc.nextInt();
        
        System.out.println("Introduce el número b");
        
        int b = sc.nextInt();
        
        int mayor = b;
        
        int cont = 1;
        
        int multiploA = 1;
        int multiploB = 1;
        int mcm = 0;
        
        if (a > b) {
            mayor = a;
        }
        
        do {
            if (a % cont == 0) {
                multiploA *= cont;
            }
            
            if (b % cont == 0) {
                multiploB *= cont;
            }
            
            if (multiploA == multiploB) {
                mcm = multiploA;
            }
            cont++;
        } while (cont != mayor);
        
        System.out.println("Minimo comun múltiplo --> " + mcm);
        
        //POR ARREGLAR
    }
}