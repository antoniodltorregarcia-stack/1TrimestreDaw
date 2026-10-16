import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que dispone.
 * Por ejemplo: lacantidad de dinero que tiene en el banco, en una hucha, en un cajón V en IOS bolsillos.
 * La aplicación mostrará lasuma total de dinero de la que dispone el usuario.La manera de especificar que no se desea
 * introducir más cantidades es mediante el cero
 * 
 * @author (Tony) 
 * @version (3.20)
 */
public class Ejercicio20 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 1;
        
        double cantidadTotal = 0;
        String texto = "uwu";
        
        while (!texto.equals("0")) {
            
            System.out.println("Introduce donde tienes el dinero, introduce (0) si quieres cerrar el programa...");
            texto = sc.next();
            
            if (!texto.equals("0")) {
                char ultimaLetra = texto.charAt(texto.length() - 1);
            
                if (ultimaLetra == 'a') {
                    System.out.println("Introduce cuanto dinero tienes en la " + texto);
                } else System.out.println("Introduce cuanto dinero tienes en el " + texto);
                
                double dinero = sc.nextDouble();
                
                
                cantidadTotal += dinero;
                System.out.println("");
            }
            
            
        }
        
        System.out.println("El usuario dispone de un total de " + cantidadTotal + " $");
        
    }
}