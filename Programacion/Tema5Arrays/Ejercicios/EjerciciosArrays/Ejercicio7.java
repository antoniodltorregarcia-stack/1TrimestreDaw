import java.util.Scanner;

/**
 * Implementa la funcion: int [] suma(int t[], int numElementos), que crea y devuelve una tabla con las
 * sumas de los numElementos elementos consecutivos de t. Veamos un ejemplo,
 * sea t = [10, 1, 5, 8, 9, 2]. Si los elementos de t se agrupan de 3 en 3,
 * se harán las sumas:
 * 
 * 10+1+5. Igual a 16.
 * 1+5+8. Igual a 14.
 * 5+8+49. Igual a 22.
 * 8+9+2. Igual a 19.
 * 
 * Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19].
 * 
 * @author (Tony) 
 * @version (5.17)
 */
public class Ejercicio7 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int numElementos = 0;
        int[] t = new int[] {10, 1, 5, 1, 5, 8, 5, 8, 49, 8, 9, 2};
        
        int longitudResultado = t.length / 3;
        int [] tSuma = new int [longitudResultado];
        
        suma(t,tSuma,numElementos);
        
        System.out.print("Resultados = ");
        for (int i = 0; i < tSuma.length; i++) {
            System.out.print(tSuma [i] + " ");
        }
        
    }
    
    public static int [] suma(int t[], int tSuma[], int numElementos) {
        
        int sumaNum = 0;
        int posicionTSuma = 0;

        for (int i = 0; i < t.length; i++) {
            numElementos ++;
            sumaNum += t[i];
            if (numElementos % 3 == 0) {
                tSuma [posicionTSuma] = sumaNum;
                posicionTSuma++;
                sumaNum = 0;
            }
        }
        
        return tSuma;
    }
}