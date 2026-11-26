import java.util.Scanner;

/**
 * Write a description of class Pruebas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pruebas
{
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int t [] = Funcion.rellenarArray(sc);
        Funcion.pintarArray(t);
        int n = Funcion.leerInt(sc, "Deseas adelantar algun elemento del Array");
        t = Funcion.atrasarElementos(t,n);
        Funcion.pintarArray(t);
    }
}