import java.util.Scanner;

/**
 * Crea una función para determinar si un carácter pasado por parámetro es una vocal
 * 
 * @author (Tony) 
 * @version (Ejercicio5)
 */
public class Ejercicio5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un caracter, te dire si es una vocal");
        
        char letra = sc.next().charAt(0);
        
        /*
         * • sc.next(): Lee lo que el usuario escriba en la consola como un String
         * (hasta el primer espacio).
         * 
         * • .charAt(0): Extrae el primer carácter (la posición 0) de ese texto.
         * Así, si el usuario escribe "a" o "ave", 
         * la variable vocal guardará únicamente la 'a'.
         */
        
        System.out.println(letra + letraVocal(letra) );
    }
    
    public static String letraVocal (char letra) {
        String resultado = "";
        
        switch (letra) {
            case 'a','e','i','o','u':
                resultado = " es una vocal";
                break;
            default:
                resultado = " es una consonante";
                break;
        }
        
        return resultado;
    }
}