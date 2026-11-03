import java.util.Scanner;

/**
 * Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo.
 * con el siguiente prototipo: static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
 * La función devolverá la  cantidad de minutos que existen de diferencia entre los dos instantes utilizados.
 * 
 * @author (Tony) 
 * @version (4.15)
 */
public class Ejercicio15 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce hora 1");
        
        int hora1 = sc.nextInt();
        
        System.out.println("Introduce minuto 1");
        
        int minuto1 = sc.nextInt();
        
        System.out.println("Introduce hora 2");
        
        int hora2 = sc.nextInt();
        
        System.out.println("Introduce minuto 2");
        
        int minuto2 = sc.nextInt();
        
        System.out.println("Diferencia de minutos = " + diferencia(hora1,minuto1,hora2,minuto2));
        
    }
    
    public static int diferencia (int hora1, int minuto1, int hora2, int minuto2) {
        int diferenciaMinutos = 0;
        
        minuto1 += (hora1 * 60);
        
        minuto2 += (hora2 * 60);
        
        if (minuto2 > minuto1) {
            diferenciaMinutos = minuto2 - minuto1;
        } else diferenciaMinutos = minuto1 + minuto2;
        
        return diferenciaMinutos;
    }
}