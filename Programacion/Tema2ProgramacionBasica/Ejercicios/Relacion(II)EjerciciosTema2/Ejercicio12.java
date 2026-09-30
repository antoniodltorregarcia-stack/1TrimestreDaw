import java.util.Scanner;

/**
 * El DNI consta de un entero de 8 dígitos seguido de una letra
 * que se obtiene a partir del número de la siguiente forma: Letra = número DNI módulo 22.
 * 
 * @author (Tony) 
 * @version (2.12)
 */
public class Ejercicio12 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce los 8 digitos de tu dni y te dire la letra");
        
        String longitud = sc.nextLine().trim(); 
        
        /*
         * Primero lo recibimos como String para comprobar que el numero mida 8 digitos
         */

        
        if (longitud.length() != 8) { //Arreglar las restricciones 
            System.out.println("El dni no tiene 8 digitos");
            return;
        }
        
        int n = Integer.parseInt(longitud); //Aqui lo transformamos de nuevo a int para poder trabajar con el
        
        
        int nletra = n % 23;
        
        /*
         * Hay un fallo en el enunciado ya que el uso correcto del calculo del dni seria
         * con un modulo 23, ya que contamos el 0, sino nunca se llegaría al case 22
         */
        
        char letra;
        
        switch (nletra) {
            case 0: 
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2: 
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4: 
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6: 
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8: 
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10: 
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12: 
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14: 
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16: 
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18: 
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20: 
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;   
            case 22:
                letra = 'E';
                break;
            default: 
                letra = '?';
        }
        
        System.out.println("Tu dni completo es: " + n + letra);
        
        
    }
}