import java.util.Scanner;

/**
 * Idear un programa que solicite al usuario un número
 * comprendido entre 1 y 7, correspondiente a un día 
 * de la semana. Se debe mostrar el nombre del día de la
 * semana al que corresponde. Por ejemplo, el número 1 
 * corresponde al “lunes” y el 6 al “sábado”. 
 * 
 * @author (Tony) 
 * @version (2.11)
 */
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número entre el 1 y el 7");
        
        int n = sc.nextInt();
        
        if (n < 1 || n > 7) {
            System.out.println("Número no valido");
            return;
        }
        
        String dia;
        
        if (n == 1) {
            dia = "Lunes";
        } else if (n == 2) {
            dia = "Martes";
        } else if (n == 3) {
            dia = "Miercoles";
        } else if (n == 4) {
            dia = "Jueves";
        } else if (n == 5) {
            dia = "Viernes";
        } else if (n == 6) {
            dia = "Sábado";
        } else dia = "Domingo";
        
        //Hacer con switch
        System.out.println("El número " + n + " corresponde al " + dia);
        
    }
}