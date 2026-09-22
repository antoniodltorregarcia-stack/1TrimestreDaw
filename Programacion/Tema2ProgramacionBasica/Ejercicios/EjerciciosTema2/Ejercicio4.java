import java.util.Scanner;

/**
 * Implementar un programa que pida por teclado un número decimal e indique sei es un número
 * casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad,
 * aunque curiesamente el 0 no se considera un número casi-cero. Ejemplos de números casi-cero 
 * son: el 0`3, el -0`99 o el 0`123; algunos números que no se consideran casi-cero son:
 * el 12`3, el 0 o el -1. 
 * 
 * @author (Tony) 
 * @version (2.4)
 */
public class Ejercicio4 {
    public static void main (String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe tu número casi-cero");
        
        double n = sc.nextDouble(); //Importante en la pantalla escribir los decimales con "," no "."
        
        String resultado;
        
        if (n < 0 && n > -1 ) {
            resultado = "Es un número casi-cero";
        } else if (n > 0 && n < 1) {
            resultado = "Es un número casi-cero";
        }else {
            resultado = "No es considerado un número casi-cero";
        }
        
        System.out.println(n + " " + resultado);
        
    }
}