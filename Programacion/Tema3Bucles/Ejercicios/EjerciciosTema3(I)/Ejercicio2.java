import java.util.Scanner;

/**
 *  Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo.
 *  se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
 *  la media, el número de alumnos y cuántos son mayores de edad.
 * 
 * @author (Tony) 
 * @version (3.2)
 */
public class Ejercicio2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        int cantidad = 0;
        int adulto = 0;
        int sumaEdades = 0;
        System.out.println("Un número negativo cerrara el programa");
        
        do {
            System.out.println("Dame la edad del alumno");
            
            n = sc.nextInt();
            
            if (n < 0) {
                break;
            }
            
            sumaEdades += n;
            
            if (n >= 18) {
                adulto++;
            }
            
            cantidad++;
        } while (n >= 0);
        
        double media = (double)sumaEdades / cantidad;
        
        System.out.println("Suma de las edades: " + sumaEdades);
        System.out.println("Media de las edades: " + media);
        System.out.println("Cantidad de alumnos: " + cantidad);
        System.out.println("Cantidad de mayores de edad: " + adulto);
        System.out.println("Programa finalizado...");
    }
}