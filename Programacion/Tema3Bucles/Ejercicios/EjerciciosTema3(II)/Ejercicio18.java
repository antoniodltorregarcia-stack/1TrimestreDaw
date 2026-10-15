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
        
        int mayor = a;
        
        if (b > a) {
            mayor = b;
        }
        
        int mcm = 0; //Valor para printear el mínimo común múltiplo
        
        int cont = 1; //Empezamos en 1 ya que en 0 siempre daria 0
        
        
        do {
            
            mcm = mayor * cont; //Calculamos el múltiplo actual
            
            cont++; //Vamos aumentando el múltiplo
        } while (mcm % a != 0 || mcm % b != 0); //El bucle termine cuando el múltiplo ¡SI! sea divisible entre a y b
        
        /*
         * La operación consiste en esto:
         *  
         *      1. Vamos multiplicando el número mayor, ya que nunca la solucíon sera un número mas pequeño que uno de los dos.
         *      2. Si este numero mayor divido entre los dos = 0, ya lo obtenemos, ese es nuestro mcm.
         *      3. Sino vamos a seguir multiplicando nuestro mcm, hasta que pueda % a y b y dar == 0.
         *      
         */
        
        System.out.println("El mínimo común múltiplo es " + mcm);
    }
}