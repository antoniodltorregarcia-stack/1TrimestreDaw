import java.util.Scanner;

/**
 * Write a description of class Arrays here.
 *
 * @author (Tony)
 * @version (a version number or a date)
 */
public class EjercicioClase {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        //Declaracion de arrays
        long[] padelJugadores = new long[4];  //se de antemano el tamaño
        int[] listaNumeros;
        double[] listaDecimales;
        String[] jugadores;
       
        //solicito tamaño
        System.out.println("ejemplos con arrays");
        //int sizeInts = Funcion.leerEntero(sc, "Dame el tamaño del array de int");
        //listaNumeros = new int[sizeInts];
       
        int tamanioArray = 0;
        System.out.println("Introduce el tamaño del Array Entero (secuencia = +3)");
        tamanioArray = sc.nextInt();
        
        listaNumeros = new int[tamanioArray];
        
       
        //Relleno de arrays
        
        //1. Relleno Entero
        for(int i=0;i<listaNumeros.length;i++) {
            listaNumeros[i] = i*3+1;
        }
        
        //2. Relleno de double con los numeros pares +0.1: 0.1, 2.1, 4.1, ...
        System.out.println("Introduce el tamaño del Array Double (secuencia = 0.1, 2.1, 4.1)");
        tamanioArray = sc.nextInt();
        
        listaDecimales = new double [tamanioArray];
        
        for (int i = 0; i < listaDecimales.length; i++) {
            listaDecimales[i] = (i * 2) + 0.1;
        }
        
        
        //3. Relleno de jugadores desde teclado con nextLine
        jugadores = new String [4]; //4 jugadores maximo
        
        sc.nextLine(); //Hay que limpiar el bufer sino ignora el primero
        for(int i = 0; i < jugadores.length; i++) {
            System.out.println("Introduce el nombre del jugador " + (i + 1));
            jugadores [i] = sc.nextLine();
        }
    
        //algoritmia de recorridos
        //sacar por pantalla todos los elementos de cada array
           
        //1.
        System.out.println("Listado enteros: ");
        for(int i=0;i<listaNumeros.length;i++) {
            System.out.print(listaNumeros[i] + " ");
        }
        System.out.println();
        
        //2.
        System.out.println("Listado decimales: ");
        for (int i = 0; i < listaDecimales.length; i++) {
            System.out.print(listaDecimales[i] + " ");
        }
        System.out.println();
        
        //3.
        
        System.out.println("Listado de jugadores");
        for(int i = 0; i < jugadores.length; i++) {
            System.out.println((i + 1) + ". " + jugadores [i]);
        }
        System.out.println();
        
        
        //acumulacion - sumas
        //sacar la suma de los dos arrays numericos (por separado)
        
        //1. Array de enteros
        
        int sumaEnteros = 0;
        
        for (int i = 0; i < listaNumeros.length; i++) {
            sumaEnteros += listaNumeros [i];
        }
        
        System.out.println("Suma total del Array de enteros: " + sumaEnteros);
        
        //1. Array de enteros
        
        double sumaDecimales = 0;
        
        for (int i = 0; i < listaDecimales.length; i++) {
            sumaDecimales += listaDecimales [i];
        }
        
        System.out.println("Suma total del Array de decimales: " + sumaDecimales);
       
        //resumen - media
        //sacar la media de cada array numerico
        
        System.out.println("Media del Array de enteros: " + (double) sumaEnteros / (double) listaNumeros.length);
        System.out.println("Media del Array de decimales: " +  sumaDecimales / (double) listaNumeros.length);
        
        //filtrado
        
        //sacar los numeros positivos de cada array
        
        System.out.println("Listado enteros positivos: ");
        for(int i=0;i<listaNumeros.length;i++) {
            if (listaNumeros[i] > 0) {
                System.out.print(listaNumeros[i] + " ");
            }
        }
        System.out.println();
        
        //2.
        System.out.println("Listado decimales positivos: ");
        for (int i = 0; i < listaDecimales.length; i++) {
            if (listaDecimales[i] > 0) {
                System.out.print(listaDecimales[i] + " ");
            }
        }
        System.out.println();
        
        //buscar si "Lamine" esta en el array de strings
        
        boolean estaLamine = false;
        
        for(int i= 0; i < jugadores.length; i++) {
            if (jugadores[i].equalsIgnoreCase("Lamine")) {
                estaLamine = true;
            }
        }
        
        if (estaLamine == true) {
            System.out.println("Si esta Lamine");
        } else System.out.println("No esta Lamine");
    }
}