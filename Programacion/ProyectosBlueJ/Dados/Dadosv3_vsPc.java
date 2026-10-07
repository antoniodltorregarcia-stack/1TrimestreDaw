import java.util.Scanner;

/**
 * Version funcional con bucles contra ia, en esta version personalizamos la sálida para 
 * hacerlo mas dinámico
 * 
 * @author (Tony) 
 * @version (2.4)
 */
public class Dadosv3_vsPc {
    public static void main (String[]args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
        int turnos = 0;
        int seises1 = 0;
        int seises2 = 0;
        int puntosJ1 = 0;
        int puntosJ2 = 0;
        
  
        do {
            System.out.println("Jugador 1, Tirar dado()");
            sc.nextLine();
            int dado1 = (int)(Math.random() * 6) + 1;
            
            System.out.println("Lanzando dado...");
            for(int i = 0; i < 10; i++) {
                System.out.print((int)(Math.random()*6)+1 + " ");
                Thread.sleep(200);
            }
            System.out.println();
            
            System.out.println("Jugador 1, Dado = " + dado1);
            
            System.out.println("");
            
            if (dado1 == 6) {
                seises1++;
            }
            
            puntosJ1 += dado1;
            
            Thread.sleep(1000);
            
            System.out.println("");
            System.out.println("El ordenador tira el dado()");
            
            System.out.println("Lanzando dado...");
            for(int i = 0; i < 10; i++) {
                System.out.print((int)(Math.random()*6)+1 + " ");
                Thread.sleep(200);
            }
            System.out.println();
            
            int dado2 = (int)(Math.random( ) * 6) + 1;
            System.out.println("Ordenador, Dado = " + dado2);
            System.out.println("");
            
            if (dado2 == 6) {
                seises2++;
            }

            puntosJ2 += dado2;
            
            turnos++;
        } while (turnos != 3);
        
        Thread.sleep(1000);
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
