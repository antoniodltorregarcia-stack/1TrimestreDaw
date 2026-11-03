import java.util.Scanner;

/**
 * Realiza una función (dos veces) que calcule mediante recursividad y 
 * también mediante iteración, la potencia de una base elevada a un determinado exponente
 * 
 * @author (Tony) 
 * @version (Ejercicio9)
 */
public class Ejercicio9 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame la base");
        int n = sc.nextInt();
        System.out.println("Dame su exponente");
        int exp = sc.nextInt();
        
        System.out.println("Elige la opción a usar");
        System.out.println("(1) Recursividad");
        System.out.println("(2) Iteración");
        byte opcion = sc.nextByte();
        
        if (opcion == 1) {
            System.out.println("Resultado = " + recursivo(n,exp));
        } else {
            int resultado = 1;
        
            for (int i = 0; i < exp; i++) {
                resultado *= n;
            }   
            
            System.out.println("Resultado = " + resultado);
        }
        
    }
    
    public static int recursivo (int n, int exp) {
        int resultado = 1;
        
        for (int i = 0; i < exp; i++) {
            resultado *= n;
        }
        
        return resultado;
    }
}