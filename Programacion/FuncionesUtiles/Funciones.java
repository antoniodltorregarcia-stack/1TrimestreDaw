import java.util.Scanner;

/**
 * Aquí se incluyen funciones utiles para uso rápido
 * 
 * @author (Tony) 
 * @version (FuncionesUtilesParaCopiar)
 */
public class Funciones {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        
        int opcion = 0;
        do {
            System.out.println("Introduce la opción para usar las funciones");
            System.out.println("===========================================");
            System.out.println("Cerrar programa (-1)");
            System.out.println("Calcular si el número es Par (1)");
            System.out.println("Calcular si el número es Primo (2)");
            System.out.println("Calcular la media de varios números(3)");
            System.out.println("Calcular la potencia de un número(4)");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            
            
            opcion = sc.nextInt();
            System.out.println("===========================================");
            switch (opcion) {
                case -1:
                    System.out.println("Programa finalizado...");
                    break;
                default:
                    System.out.println("Opción no válida");
                case 1:
                    System.out.println("¿Es par? = " + esPar());
                    break;
                case 2:
                    System.out.println("¿Es primo? = " + esPrimo());
                    break;
                case 3:
                    System.out.println("La media de los números es = " + calcularMedia());
            }
            System.out.println("===========================================");
        } while (opcion != -1);
    }
    
    public static boolean esPar () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número");
        
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            return true;
        } else return false;
    }
    
    public static boolean esPrimo () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número");
        
        int n = sc.nextInt();
        
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        
        if (cont == 2) {
            return true;
        } else return false;
    }
    
    public static double calcularMedia() {
        Scanner sc = new Scanner(System.in);
        
        double n = 0;
        double suma = 0;
        int cont = 0;
        
        System.out.println("Introduce números y te dare la media de ellos (0) cierra el programa");
        do {
            System.out.println("Introduce ul número");
            n = sc.nextInt();
            if (n != 0) {
                suma += n;
                cont++;
            }
            
        } while (n != 0);
        
        double media = suma / (double) cont;
        
        return media;
    }
    
}