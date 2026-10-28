import java.util.Scanner;

/**
 * Diseña y prueba una función que devuelva el número mayor de dos parametros.
 * 
 * @author (Tony) 
 * @version (Ejercicio4)
 */
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        
        int a = sc.nextInt();
        
        System.out.println("Introduce otro número");
        
        int b = sc.nextInt();
        
        if (a == b) {
            System.out.println("Los números son iguales");
        } else System.out.println("El número mayor es --> " + mayor(a,b) );
    }
    
    public static int mayor (int a, int b) {
        int nMayor = 0;
        
        if (a > b) {
            nMayor = a;
        } else nMayor = b;
        
        return nMayor;
    }
}