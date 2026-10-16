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
        
        String dia = "Lunes";
    
        if (n >= 1 && n <= 7) {
            switch (n) {
                case 1:
                    dia = "Lunes";
                    break;
                case 2:
                    dia = "Martes";
                    break;
                case 3:
                    dia = "Miercoles";
                    break;
                case 4:
                    dia = "Jueves";
                    break;
                case 5:
                    dia = "Viernes";
                    break;
                case 6:
                    dia = "Sabado";
                    break;
                case 7:
                    dia = "Domingo";
                    break;
                default:
                    dia = "?";
                    break;
            }
            
            System.out.println("El número " + n + " corresponde al " + dia);
        } else System.out.println("Número no valido");
            
    }
}