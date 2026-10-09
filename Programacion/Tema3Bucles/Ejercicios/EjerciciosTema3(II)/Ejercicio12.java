import java.util.Scanner;

/**
 * Modifica la Actividad de aplicación 3.11 para que el usuario pueda introducir un número en binario 
 * y el programa muestre su conversión a decimal.
 * 
 * @author (Tony) 
 * @version (a version number or a date)
 */
public class Ejercicio12 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número binario: ");
        
        int binario = sc.nextInt();

        int decimal = 0;
        int valor = 1;

        while (binario > 0) {
            
            int digito = binario % 10; //Nos quedamos con el último digito

            decimal = decimal + digito * valor; //Lo vamos sumando al resultado para obtener el numero decimal

            valor = valor * 2; // Vamos en cada vuelta poniendo la siguiente potencia de 2
            
            binario = binario / 10; //Con esto eliminamos el último digito permitiendo que en la siguiente vuelta cojamos el siguiente
        }

        System.out.println("Decimal: " + decimal);
        
        /*
         * Para convertir un número binario a decimal, se toma cada dígito del 
         * binario y se multiplica por una potencia de 2.
         * La potencia empieza en 0 por la derecha y aumenta de uno en uno hacia la izquierda.
         * Finalmente, se suman todos los resultados obtenidos.
         */
    }
}
    