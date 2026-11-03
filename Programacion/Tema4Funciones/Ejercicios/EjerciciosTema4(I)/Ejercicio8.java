import java.util.Scanner;

/**
 *  Realiza una función calculadora que tenga tres parámetros, dosnúmeros para operar
 *  y un byte para codificar la operación a realizar. Lasoperaciones serán:
 *  1 suma, 2 resta, 3 multiplicación y 4 división. 
 *  Controla en elcaso de la división que el divisor no sea cero.
 * 
 * @author (Tony) 
 * @version (Ejercicio8)
 */
public class Ejercicio8 {
    public static void main (String[]args) {
        do {
            System.out.println("Resultado = " + calculadora());
            System.out.println("");
        } while (calculadora() != 0);
        
    }
    
    public static int calculadora () {
        Scanner sc = new Scanner(System.in);
        
        byte opcion = 0;
        
        do {
            System.out.println("Elige una opción");
            System.out.println("(1) Suma");
            System.out.println("(2) Resta");
            System.out.println("(3) Multiplación");
            System.out.println("(4) Division");
            System.out.println("(0) Cerrar");
            opcion = sc.nextByte();
            int a, b;
            
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer número");
                    a = sc.nextInt();
                    System.out.println("Introduce el segundo número");
                    b = sc.nextInt();
                    
                    return a + b;
                case 2:
                    System.out.println("Introduce el primer número");
                    a = sc.nextInt();
                    System.out.println("Introduce el segundo número");
                    b = sc.nextInt();
                    
                    return a - b;
                case 3:
                    System.out.println("Introduce el primer número");
                    a = sc.nextInt();
                    System.out.println("Introduce el segundo número");
                    b = sc.nextInt();
                    
                    return a * b;
                case 4:
                    System.out.println("Introduce el primer número");
                    a = sc.nextInt();
                    System.out.println("Introduce el segundo número");
                    b = sc.nextInt();
                    
                    if (a == 0) {
                        System.out.println("No se puede dividir entre 0");
                        return 0;
                    } else return a / b;
                    
                    
                case 0:
                    System.out.println("Cerrando programa...");
                    return 0;
                default:
                    System.out.println("Opción no válida");
                    return 0;
                    
            }
            
        } while (opcion != 0);
        
        
    }
}