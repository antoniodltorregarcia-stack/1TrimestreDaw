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
            System.out.println("===========================================");
            System.out.println("Introduce la opción para usar las funciones");
            System.out.println("===========================================");
            System.out.println("Cerrar programa (-1)");
            System.out.println("Calcular si el número es Par (1)");
            System.out.println("Calcular si el número es Primo (2)");
            System.out.println("Calcular la media de varios números(3)");
            System.out.println("Calcular la potencia de un número(4)");
            System.out.println("Cantidad entre dos números, min & max(5)");
            System.out.println("Conversor de tiempo, hora -> min -> segundos(6)");
            System.out.println("Generar letra del dni(7)");
            System.out.println("Adivinar número secreto(8)");
            System.out.println("Área y Perimetro de un triangulo(9)");
            System.out.println("Área y Perimetro de un cuadrado(10)");
            System.out.println("Pintar triangulo(11)");
            System.out.println("Calcular factorial de un número(12)");
            System.out.println("Máximo común divisor(13)");
            System.out.println("Mínimo común múltiplo(14)");
            System.out.println("Mostrar una longitud concreta de la serie de Fibonacci(15)");
            System.out.println("Comprobar si 2 números son amigos(16)"); //funciones 4.17
            System.out.println("()");
            
            
            opcion = sc.nextInt();
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
                    break;
                case 4:
                    System.out.println("El resultado es = " + calcularPotencia());
                    break;
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
    
    public static int calcularPotencia() {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el número que quieres elevar");
        
        int n = sc.nextInt();
        
        System.out.println("Introduce las veces que quieres elevarlo");
        
        int potencia = sc.nextInt();
        
        int resultado = 1;
        
        System.out.println("Operación a realizar: " + n + "^" + potencia);
        
        for (int i = 1; i <= potencia; i++) {
            resultado *= n;
        }
        
        return resultado;
    }
    
}