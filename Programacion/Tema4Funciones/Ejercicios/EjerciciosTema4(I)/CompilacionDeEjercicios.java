import java.util.Scanner;

/**
 * Aqui encontramos todos los ejercicios del pdf en un solo programa utilizando funciones para ello
 * 
 * @author (Tony) 
 * @version (PDFCompleto)
 */
public class CompilacionDeEjercicios{
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ejercicio 1. Crea una aplicación que mediante una funcion eco() imprima por");
        System.out.println("consola un número n de ecos, donde n es introducido por el usuario.");
        System.out.println("");
        System.out.println("Ejercicio 2. Crea un programa que imprima los numeros comprendidos entre a");
        System.out.println("y b. Los parámetros a y b son introducidos por usuario previamente.");
        System.out.println("");
        
        //Menu
        byte opcion;
        
        do {
            System.out.println("================================================================");
            System.out.println("Introduce el ejercicio que quieres ejecutar, (0) cierra programa");
            System.out.println("================================================================");
            opcion = sc.nextByte();
            
            switch (opcion) {
                case 0:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
            }
            
            System.out.println("");
        } while (opcion != 0);
    }
    
    public static void Ejercicio1 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de (ecos) ");
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". eco");
        }
    }
    
    public static void Ejercicio2() {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un número mínimo");
        
        int a = sc.nextInt();
        
        System.out.println("Introduce un número máximo");
        
        int b = sc.nextInt();
        
        if (a > b) {
            System.out.println("El número máximo no puede ser menor que el mínimo");
        } else if (a == b) {
            System.out.println("El número máximo no puede ser igual que el mínimo");
        } else {
            System.out.println("Resultado:");
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}