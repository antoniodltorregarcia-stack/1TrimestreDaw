import java.util.Scanner;

/**
 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4), 
 * suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
 * 
 * @author (Tony) 
 * @version (2.10)
 */
public class Ejercicio10 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime cual ha sido tu nota");
        
        int n = sc.nextInt();
        
        String nota;
        
        
        if (n >= 0 && n <= 4) { //Establecemos un mínimo para la excepciones a los datos pedidos
            nota = "Suspenso";
        } else if (n == 5) {
            nota = "Suficiente";
        } else if (n == 6) { //Valor único
            nota = "Bien";
        } else if (n <= 8) { //No es necesario un valor mínimo porque si fuera 6 el programa finalizaría en la anterior linea
            nota = "Notable";
        } else if (n <= 10) { //Lo mismo con el 8
            nota = "Sobresaliente";
        } else { //Todo numero < 0 && > 10
            System.out.println("Calificación no valida");
            return; //Termina aquí
        }
        
        System.out.println("Tu nota es un: " + nota);
    }
}