import java.util.Scanner;

/**
 * Write a description of class EjemploDibujar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjemploDibujar {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int anchura = leerEntero(sc, "Dame la anchura");
        int altura = leerEntero(sc, "Dame la altura");
        String texto = leerTexto (sc, "Dame el texto a dibujar");
        
        String rectangulo = dibujaRectangulo(altura,anchura,texto);
        
    }
    
    public static int leerEntero (Scanner sc, String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
    
    public static String leerTexto (Scanner sc, String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }
    
    public static String dibujaRectangulo (int alto, int ancho, String texto) {
        String rect = "";
        String linea = "";
        for (int i = 0; i < alto; i++) {
            linea = dibujaLinea (ancho, texto);
            rect = rect + "\n" + linea;
        }
        return rect;
    }
    
    public static String dibujaLinea (int ancho, String texto) {
        String linea = "";
        for (int i = 0; i < ancho; i++) {
            linea += texto;
        }
        return linea;
    }
}