import java.util.Scanner;

/**
 * Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es árbol más alto.
 * Para ello se introducirá por teclado la altura (en centímetros) de cada árbol
 * (terminando la introduciendo de datos cuando se utilice -1 como altura).
 * Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.
 * Diseñar una aplicación que resuelva el problema planteado.
 * 
 * @author (Tony) 
 * @version (3.4)
 */
public class Ejercicio4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int nArbol = -1;
        int MasAlto = 0;
        int cm;
        
        System.out.println("(-1) finaliza el programa");
        do {
            System.out.println("Medida del arbol (cm) : ");
            
            cm = sc.nextInt();
            
            if (cm == -1) {
                break;
            }
            
            if (cm > MasAlto) {
                MasAlto = cm;
            }
            
            nArbol++;
            
            System.out.println("Arbol " + nArbol + " mide: " + cm + "(cm)");
            System.out.println("");
        } while (cm != -1);
        
        System.out.println("El arbol más alto mide: " + MasAlto + "(cm)");
        System.out.println("Programa finalizado...");
        
    }
}