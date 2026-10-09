import java.util.Scanner;

/**
 * Versión básica del juego de los dados, con datos manuales...
 * 
 * @author (Tony) 
 * @version (1.2)
 */
public class Dadosv1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("JUEGO DE LOS DADOS V1");
        System.out.println("");
        
        System.out.println("Introduce el dado del jugador 1");
        
        int seises1 = 0;
        int seises2 = 0;
        
        
        int dado1 = sc.nextInt();
        
        if (dado1 < 1 || dado1 > 6) {
            System.out.println("Número no válido");
            return;
        } else if (dado1 == 6) {
            seises1++;
        }
        
        int puntosJ1 =+ dado1;
        
        System.out.println("Introduce el dado del jugador 2");
        
        int dado2 = sc.nextInt();
        
        if (dado2 < 1 || dado2 > 6) {
            System.out.println("Número no válido");
            return;
        } else if (dado2 == 6) {
            seises2++;
        }
        
        int puntosJ2 = dado2;
        
        System.out.println("Introduce el otro dado del jugador 1");
        
        dado1 = sc.nextInt();
        
        if (dado1 < 1 || dado1 > 6) {
            System.out.println("Número no válido");
            return;
        } else if (dado1 == 6) {
            seises1++;
        }
        
        puntosJ1 += dado1;
        
        System.out.println("Introduce el otro dado del jugador 2");
        
        dado2 = sc.nextInt();
        
        if (dado2 < 1 || dado2 > 6) {
            System.out.println("Número no válido");
            return;
        } else if (dado2 == 6) {
            seises2++;
        }
        
        puntosJ2 += dado2;
        
        if (seises1 != seises2) {
            if (seises1 > seises2) {
                System.out.println("Jugador 1 Gana");
            } else {
                System.out.println("Jugador 2 Gana");
            }
        } else if (puntosJ1 != puntosJ2) {
            if (puntosJ1 > puntosJ2) {
                System.out.println("Jugador 1 Gana, numero total de puntos = " + puntosJ1);
            } else {
                System.out.println("Jugador 2 Gana, numero total de puntos = " + puntosJ2);
            }
        } else System.out.println("Empate");
    }
}