import java.util.Scanner;

/**
 * Write a description of class Ejercicio6 here.
 * 
 * @author (Antonio Jesús De La Torre García) 
 * @version (Ejercicio6)
 */
public class Ejercicio6 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int opcion;
        
        do {
            System.out.println("---- MINI APLICACION ----");
            System.out.println("(1) Múltiplos de 3 y 5");
            System.out.println("(2) Caja registradora");
            System.out.println("(3) Análisis de número");
            System.out.println("(0) Salir");
            opcion = sc.nextInt();
            
            if (opcion != 0) {
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el límite");
                        int limite = sc.nextInt();
                        for (int i = 1; i <= limite; i++) {
                            if (i % 3 == 0 || i % 5 == 0) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 2:
                        int precio;
                        int total = 0;
                        int cantidad = 0;
                        do {
                            System.out.println("Introduce precio del producto (0) finaliza");
                            precio = sc.nextInt();
                            
                            if (precio != 0) {
                                total += precio;
                                cantidad++;
                            }
                            
                        } while (precio != 0);
                        
                        System.out.println("Cantidad de productos --> " + cantidad);
                        System.out.println("Precio total de los productos --> " + total);
                        if (total > 100) {
                            System.out.println("Envio gratis");
                        } else System.out.println("Envio no incluido");
                        break;
                    case 3:
                        System.out.println("Introduce un número");
                        int n = sc.nextInt();
                        
                        if (n != 0) {
                            boolean positivo = (n > 0) ? true : false;
                            
                            if (positivo == true) {
                                System.out.println("Es positivo");
                            } else  System.out.println("Es negativo");
                            
                        } else System.out.println("Es 0");
                        
                        boolean par = (n % 2 == 0) ? true : false;
                        if (par == true) {
                                System.out.println("Es par");
                        } else System.out.println("Es impar");
                        
                        break;
                    default: 
                        System.out.println("Opción no valida");
                        break;
                }
            } else System.out.println("Finalizando programa...");
        } while (opcion != 0);
    }
}