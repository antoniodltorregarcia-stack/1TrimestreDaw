import java.util.Scanner;

/**
 * Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. La aplicación debe decidir si la matriz
 * introducida corresponde a una matriz mágica, que es aquella donde la suma de los elementos de cualquier fila o 
 * de cualquier columna valen lo mismo.
 * 
 * @author (Tony) 
 * @version (5.18)
 */
public class Ejercicio8 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int nFila = 0;
        
        int fila1 [] = new int [4];
        int fila2 [] = new int [4];
        int fila3 [] = new int [4];
        int fila4 [] = new int [4];
        
        int sumaF1 = 0;
        int sumaF2 = 0;
        int sumaF3 = 0;
        int sumaF4 = 0;
        
        System.out.println("Introduce los datos de la fila 1");
        for (int i = 0; i < fila1.length; i++) {
            System.out.println("Introduce el numero nº " + (i+1));
            fila1[i] = sc.nextInt();
            sumaF1 += fila1[i];
        }
        
        System.out.println("Introduce los datos de la fila 2");
        for (int i = 0; i < fila2.length; i++) {
            System.out.println("Introduce el numero nº " + (i+1));
            fila2[i] = sc.nextInt();
            sumaF2 += fila2[i];
        }
        
        System.out.println("Introduce los datos de la fila 3");
        for (int i = 0; i < fila3.length; i++) {
            System.out.println("Introduce el numero nº " + (i+1));
            fila3[i] = sc.nextInt();
            sumaF3 += fila3[i];
        }
        
        System.out.println("Introduce los datos de la fila 4");
        for (int i = 0; i < fila4.length; i++) {
            System.out.println("Introduce el numero nº " + (i+1));
            fila4[i] = sc.nextInt();
            sumaF4 += fila4[i];
        }
        
        int sumaC1 = (fila1[0] + fila2[0] + fila3[0] + fila4[0]);
        int sumaC2 = (fila1[1] + fila2[1] + fila3[1] + fila4[1]);
        int sumaC3 = (fila1[2] + fila2[2] + fila3[2] + fila4[2]);
        int sumaC4 = (fila1[3] + fila2[3] + fila3[3] + fila4[3]);
        
        pintarMatriz(fila1,fila2,fila3,fila4);
        
        if (sumaF1 == sumaC1 && sumaF2 == sumaC2 && sumaF3 == sumaC3 && sumaF4 == sumaC4) {
            System.out.println("Tu matriz es mágica");
        } else System.out.println("Tu matriz es normal y corriente");
    }
    
    public static void pintarMatriz (int fila1[], int fila2[], int fila3[], int fila4[]) {
        for(int i = 0; i < fila1.length; i++) {
            System.out.print(fila1[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < fila2.length; i++) {
            System.out.print(fila2[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < fila3.length; i++) {
            System.out.print(fila3[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < fila4.length; i++) {
            System.out.print(fila1[i] + " ");
        }
        System.out.println();
    }
}