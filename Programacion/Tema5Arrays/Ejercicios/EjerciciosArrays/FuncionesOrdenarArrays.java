import java.util.Scanner;

/**
 * Aqui se crean y se utilizan funciones para reorganizar tablas, de menor a mayor, adelantando puestos...
 * 
 * @author (Tony) 
 * @version (FuncionesDeOrdenación)
 */
public class FuncionesOrdenarArrays {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int t [] = new int [10];
        
        System.out.println("Como quieres rellenar el Array");
        System.out.println("(1) Random");
        System.out.println("(2) Manual");
        
        int opcion = sc.nextInt();
        
        if (opcion == 2) {
            rellenarArrayManual(t,sc);
        } else rellenarArrayRandom(t);
        
        System.out.println("Array generado");
        pintarArray(t);
        
        System.out.println("Array ordenado de menor a mayor");
        ordenarDeMenorAMayor(t);
        pintarArray(t);
        
        System.out.println("Array ordenado de mayor a menor");
        ordenarDeMayorAMenor(t);
        pintarArray(t);
    }
    
    public static int [] rellenarArrayRandom(int t[]) {
        for(int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * 101);
        }
        
        return t;
    }
    
    public static int [] rellenarArrayManual(int t[], Scanner sc) {
        for(int i = 0; i < t.length; i++) {
            System.out.println("Introduce el valor de la posición " + i);
            t[i] = sc.nextInt();
        }
        
        return t;
    }
    
    public static void pintarArray (int t[]) {
        for(int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
    
    public static int [] ordenarDeMenorAMayor(int t[]) {
        int aux = 0;
        
        for (int i = 0; i < t.length; i++) {
            for(int j = 0; j < t.length - 1 - i; j++) {
                if (t[j] > t[j+1]) {
                    aux = t[j];
                    t[j] = t[j+1];
                    t[j+1] = aux;
                }
            }
        }
        
        return t;
    }
    
    public static int [] ordenarDeMayorAMenor(int t[]) {
        int aux = 0;
        
        for (int i = 0; i < t.length; i++) {
            for(int j = 0; j < t.length - 1 - i; j++) {
                if (t[j] < t[j+1]) {
                    aux = t[j];
                    t[j] = t[j+1];
                    t[j+1] = aux;
                }
            }
        }
        
        return t;
    }
}