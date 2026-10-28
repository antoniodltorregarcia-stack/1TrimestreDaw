import java.util.Scanner;

/**
 * Crea una aplicación que mediante una funcion eco() imprima por consola un número n de ecos,
 * donde n es introducido por el usuario.
 * 
 * @author (Tony) 
 * @version (Ejercicio1)
 */
public class Ejercicio1 {
    public static void main (String[]args){ //Creamos clase main que ejecuta el programa
        Scanner sc = new Scanner(System.in); //Scanner como siempre
        
        System.out.println("Introduce el numero de (ecos) ");
        
        int n = sc.nextInt(); //Añadimos variabl
        
        eco(n); //llamamos a la función
    }
    
    public static void eco (int n) { //Aqui no es "main" , se usa el nombre que le queremos dar a la función
                        //Aqui no usamos (String[]args), aqui usamos la variable con la que trabajamos
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". eco");
        }
        
    }
}