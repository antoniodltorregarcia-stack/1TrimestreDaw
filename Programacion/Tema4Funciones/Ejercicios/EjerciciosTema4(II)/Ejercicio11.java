import java.util.Scanner;

/**
 * Diseña una función que calcule y muestre la superficie y el volumen de una esfera  
 * 
 * @author (Tony) 
 * @version (4.11)
 */
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int opcion = 0;
        
        while (opcion != -1) {
            System.out.println("Introduce el radio de la esfera, (-1) finaliza el programa");
            
            int radio = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Introduce la medida (cm, m , km...) ");
            
            String medida = sc.nextLine();
            
            System.out.println("Introduce la opcion");
            System.out.println("(1) Superficie de la esfera");
            System.out.println("(2) Volumen de la esfera");
            System.out.println("(-1) Finaliza el programa");
            
            opcion = sc.nextInt();
            
            if (opcion == 1) {
                System.out.println("La superficie de la esfera es de " + superficie(radio) + medida);
            } else if (opcion == 2) {
                System.out.println("El volumen de la esfera es de " + volumen(radio) + medida);
            } else if (opcion == -1) {
                System.out.println("Programa finalizado...");
            } else System.out.println("Opción no valida");
                
            
        }
    }
    
    public static double superficie (int radio) {
        double total = (4 * Math.PI) * (radio * radio);
        
        return total;
    }
    
    public static double volumen (int radio) {
        double total = ((4 * Math.PI) / 3) * (radio * radio * radio);
        
        return total;
    }
}