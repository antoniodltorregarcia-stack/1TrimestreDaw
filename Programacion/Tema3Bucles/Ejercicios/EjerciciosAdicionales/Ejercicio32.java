import java.util.Scanner;

/**
 * Realiza un programa que realice la conversión de números ennotación decimal a su equivalente en notación hexadecimal,
 * sin utilizarfunciones o métodos de librerías, sólo con condicionales, bucles y sentenciasbásicas.
 * 
 * @author (Tony) 
 * @version (Adicional32)
 */
public class Ejercicio32 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número y te lo dire en hexadecimal");
        
        int n = sc.nextInt();
        
        int residuo = 67;
        while (residuo != 0) {
            residuo = n % 16;
            n /= 16;
            
            if (residuo > 9) {
                switch (residuo) {
                    case 10:
                        System.out.print("A");
                        break;
                    case 11:
                        System.out.print("B");
                        break;
                    case 12:
                        System.out.print("C");
                        break;
                    case 13:
                        System.out.print("D");
                        break;
                    case 14:
                        System.out.print("E");
                        break;
                    case 15:
                        System.out.print("F");
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } else {
                if (residuo == 0) {
                    System.out.print(" ");
                } else System.out.print(residuo);
            }
            
            
        }
    }
}