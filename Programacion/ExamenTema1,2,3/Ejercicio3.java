import java.util.Scanner;

/**
 * Write a description of class Ejercicio3 here.
 * 
 * @author (Antonio Jesús De La Torre García) 
 * @version (Ejercicio3)
 */
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora");
        System.out.println("Introduce el valor (a) ");
        int a = sc.nextInt();
        System.out.println("Introduce el valor (b) ");
        int b = sc.nextInt();
        
        System.out.println("Opciones");
        System.out.println("Opcion (1) potencia a^b");
        System.out.println("Opcion (2) modulo a de b");
        System.out.println("Opcion (3) porcentaje a% de b"); //a * b / 100
        System.out.println("Opcion (4) dividir a entre b");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                int resultado1 = 1;
                for (int i = 1; i <= b; i++) {
                    resultado1 *= a;
                }
                
                System.out.println(resultado1);
                break;
            case 2:
                if (b == 0) {
                    System.out.println("Error: no se puede dividir entre cero");
                } else {
                    int resultado2 = a % b;
                    System.out.println(resultado2);
                }
                
                break;
            case 3:
                double resultado3 = (double) (a * b) / 100;
                System.out.println(resultado3);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error: no se puede dividir entre cero");
                } else {
                    double resultado4 = (double) a / b;
                    System.out.println(resultado4);
                }
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }
}