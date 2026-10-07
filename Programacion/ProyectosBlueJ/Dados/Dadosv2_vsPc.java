import java.util.Scanner;

/**
 * Version funcional con bucles para dos jugadores
 * 
 * @author (Tony) 
 * @version (2.4)
 */
public class Dadosv2_vsPc {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int turnos = 0;
        int seises1 = 0;
        int seises2 = 0;
        int puntosJ1 = 0;
        int puntosJ2 = 0;
        
        System.out.println("¿Cuantas rondas quieres jugar?");
        int partida = sc.nextInt();
        
        if (partida < 0) {
            System.out.println("No puedes jugar partidas negativas bobo");
            return;
        }
        System.out.println("");
        
        do {
            System.out.println("Jugador 1, Tirar dado()");
            sc.nextLine();
            int dado1 = (int)(Math.random() * 6) + 1;
            System.out.println("Jugador 1, Dado = " + dado1);
            System.out.println("");
            
            if (dado1 == 6) {
                seises1++;
            }
            
            puntosJ1 += dado1;
            
            System.out.println("");
            System.out.println("El ordenador tira el dado()");
            int dado2 = (int)(Math.random( ) * 6) + 1;
            System.out.println("Ordenador, Dado = " + dado2);
            System.out.println("");
            
            if (dado2 == 6) {
                seises2++;
            }

            puntosJ2 += dado2;
            
            turnos++;
        } while (turnos != partida);
        
        if (seises1 != seises2) {
            if (seises1 > seises2) {
                System.out.println("Jugador 1 Gana con " + seises1 + " seises contra los " + seises2 + " seises del Ordenador");
            } else {
                System.out.println("Ordenador Gana con " + seises2 + " seises contra los " + seises1 + " seises del Jugador 1");
            }
        } else if (puntosJ1 != puntosJ2) {
            if (puntosJ1 > puntosJ2) {
                System.out.println("Jugador 1 Gana, numero total de puntos = " + puntosJ1 + " contra los " + puntosJ2 + " puntos del Ordenador");
            } else {
                System.out.println("Ordenador Gana, numero total de puntos = " + puntosJ2 + " contra los " + puntosJ1 + " puntos del Jugador 1");
            }
        } else  System.out.println("Empate");
    }
}
