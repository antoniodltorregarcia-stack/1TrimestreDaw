import java.util.Scanner;

/**
 * Aquí se incluyen funciones utiles para uso rápido
 * 
 * @author (Tony) 
 * @version (FuncionesUtilesParaCopiar)
 */
public class Funciones {
    
    // Único lector: compartido (static), seguro/interno (private) e inmutable (final)
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main (String[]args) {
        int opcion = 0;
        
        do {
            System.out.println("===========================================");
            System.out.println("Introduce la opción para usar las funciones");
            System.out.println("===========================================");
            System.out.println("(-1) Cerrar programa ");
            System.out.println("(1) Calcular si el número es Par ");
            System.out.println("(2) Calcular si el número es Primo ");
            System.out.println("(3) Calcular la media de varios números");
            System.out.println("(4) Calcular la potencia de un número");
            System.out.println("(5) Cantidad entre dos números, min & max");
            System.out.println("(6) Conversor de tiempo, hora -> min -> segundos");
            System.out.println("(7) Generar letra del dni");
            System.out.println("(8) Adivinar número secreto");
            System.out.println("(9) Área y Perimetro de un cuadrado");
            System.out.println("(10) Área y Perimetro de un triangulo");
            System.out.println("===========================================");
            System.out.println("(11) Pintar triangulo");
            System.out.println("(12) Calcular factorial de un número");
            System.out.println("(13) Máximo común divisor");
            System.out.println("(14) Mínimo común múltiplo");
            System.out.println("(15) Mostrar una longitud concreta de la serie de Fibonacci");
            System.out.println("(16) Comprobar si 2 números son amigos"); //funciones 4.17
            System.out.println("()");
            
            
            opcion = sc.nextInt();
            switch (opcion) {
                case -1:
                    refrescarPantalla();
                    System.out.println("Programa finalizado...");
                    break;
                default:
                    refrescarPantalla();
                    System.out.println("Opción no válida");
                    break;
                case 1:
                    refrescarPantalla();
                    System.out.println("¿Es par? = " + esPar());
                    break;
                case 2:
                    refrescarPantalla();
                    System.out.println("¿Es primo? = " + esPrimo());
                    break;
                case 3:
                    refrescarPantalla();
                    System.out.println("La media de los números es = " + calcularMedia());
                    break;
                case 4:
                    refrescarPantalla();
                    System.out.println("El resultado es = " + calcularPotencia());
                    break;
                case 5:
                    refrescarPantalla();
                    System.out.println("La diferencia entre ambos numeros es de = " + cantidadEntreN());
                    break;
                case 6:
                    refrescarPantalla();
                    conversorTiempo();
                    break;
                case 7:
                    refrescarPantalla();
                    System.out.println("La letra de tu dni es = " + letraDNI());
                    break;
            }
        
        } while (opcion != -1);
    }
    
    public static void refrescarPantalla() {
        System.out.print("\f");
        System.out.flush();
    }

    public static boolean esPar () {
        System.out.println("Introduce el número");
        
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            return true;
        } else return false;
    }
    
    public static boolean esPrimo () {
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
    
    public static int cantidadEntreN () {
        System.out.println("Introduce un número");
        
        int n1 = sc.nextInt();
        
        System.out.println("Introduce otro número");
        
        int n2 = sc.nextInt();
        
        int cantidad = 0;
        
        if (n1 > n2) {
           System.out.println(n1 + " > " + n2); 
           return cantidad = n1 - n2;
        } else if (n1 == n2) {
            System.out.println(n1 + " y " + n2 + " son iguales");
            return cantidad = n1 - n2;
        } else {
            System.out.println(n2 + " > " + n1);
            return cantidad = n2 - n1;
        } 
    }
    
    public static void conversorTiempo () {
        int opcion = 0;
        do {
            System.out.println("Elige la opcion que deseas realizar");
            
            System.out.println("(1) Convertir a segundos");
            System.out.println("(2) Convertir a minutos");
            System.out.println("(3) Convertir a horas");
            System.out.println("(-1) Cerrar función");
            
            opcion = sc.nextInt();
            
            if (opcion != -1) {
                System.out.println("Introduce las horas");
                double hora = sc.nextDouble();
                System.out.println("Introduce los minutos");
                double minuto = sc.nextDouble();
                System.out.println("Introduce los segundos");
                double segundo = sc.nextDouble();
                
                switch (opcion) {
                    case 1:
                        minuto += (hora * 60);
                        segundo += (minuto * 60);
                        System.out.println("Total de segundos = " + segundo);
                        break;
                    case 2:
                        minuto += (hora * 60);
                        minuto += (segundo / 60);
                        System.out.println("Total de minutos = " + minuto);
                        break;
                    case 3:
                        hora += (segundo / 3600);
                        hora += (minuto / 60);
                        System.out.println("Total de horas = " + hora);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                    case -1:
                        System.out.println("Cerrando función...");
                    break;
                }
            } else {
                System.out.println("Cerrando función...");
                refrescarPantalla();
            }
        } while (opcion != -1);
    }
    
    public static char letraDNI() {
        System.out.println("Introduce tu dni");
        
        int n = sc.nextInt();
        
        int nletra = n % 23;
        
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            
        if (nletra >= 0 && nletra < 23) {
            return letras[nletra]; 
        } else {
            return '?';
        }
    }
}