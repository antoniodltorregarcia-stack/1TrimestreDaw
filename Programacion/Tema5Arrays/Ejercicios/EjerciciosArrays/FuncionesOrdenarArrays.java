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
        
        int opcion = 0;
        int op = 0;
        
        do {
            System.out.println("¿Que deseas hacer con el Array?");
            System.out.println("0. Cerrar Programa");
            System.out.println("1. Crear un nuevo Array");
            System.out.println("2. Ordenar Array de menor a mayor");
            System.out.println("3. Ordenar Array de mayor a menor");
            System.out.println("4. Eliminar elementos del Array");
            System.out.println("5. Agregar elementos al Array");
            System.out.println("6. Desordenar Array");
            System.out.println("7. Mandar un elemento al final");
            System.out.println("8. Adelantar un puesto si cumplen una condicion (Ej: menores de 18)");
            
            
            opcion = sc.nextInt();
            refrescarPantalla();
            switch (opcion) {
                default:
                    System.out.println("Opcion no valida");
                    break;
                case 0:
                    break;
                case 1:
                    System.out.println("Como quieres rellenar el Array");
                    System.out.println("(1) Random");
                    System.out.println("(2) Manual");
                    
                    int tipo = sc.nextInt();
                    System.out.println("Array generado");
                    if (tipo == 2) {
                        rellenarArrayManual(t,sc);
                    } else rellenarArrayRandom(t);
                    break;
                case 2:
                    System.out.println("Array ordenado de menor a mayor");
                    ordenarDeMenorAMayor(t);
                    break;
                case 3:
                    System.out.println("Array ordenado de mayor a menor");
                    ordenarDeMayorAMenor(t);
                    break;
                case 4:
                    do {
                        System.out.println("Deseas eliminar algun elemento del Array? Escribelo sino (0) para continuar");
                        pintarArray(t);
                        op = sc.nextInt();
                        
                        if (op != 0) {
                            t = eliminarElementoDeArray(t,op);
                            pintarArray(t);
                        }
                    } while (op != 0);
                    break;
                case 5:
                    do {
                        System.out.println("Deseas agregar algun elemento del Array? Escribelo sino (0) para continuar");
                        pintarArray(t);
                        op = sc.nextInt();
                        
                        if (op != 0) {
                            t = agregarNumerosAlArray(t,op); //Importante guardar en t la funcion de eliminar para modificarlo
                            pintarArray(t);
                        }
                    } while (op != 0);
                    break;
                case 6:
                    System.out.println("Array desordenado");
                    desordenarArray(t);
                    break;
            }
            
            if (opcion != 0) {
                pintarArray(t);
                System.out.println("");
                System.out.println("");  
            }
            
        } while (opcion != 0);
        
    }
    
    public static void refrescarPantalla() {
        System.out.print("\f");
        System.out.flush();
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
    
    public static int [] eliminarElementoDeArray(int t[], int op) {
        
        
        
int aux = 0;
        int elemento = op;
        int posicion = -1;
        for(int i = 0; i < t.length; i++) {
            if (t[i] == elemento) {
                posicion = i;
            }
        }
        
         if (posicion == -1) {
            System.out.println("El elemento no existe en el array.");
            return t;
        }
        
        int t2 [] = new int [t.length - 1];
        int cont = 0;
        for(int i = 0; i < t.length; i++) {
            if (i != posicion) {
                t2[cont] = t[i];
                cont++; //El segundo Array solo avanza si no esta la posicion del elemento a eliminar, no siempre
            }
        }
        
        return t2;
    }
    
    public static int [] agregarNumerosAlArray (int t [], int op) {
        int aux = 0;
        int elemento = op;
        
        int t2 [] = new int [t.length + 1];
        
        for (int i = 0; i < t.length; i++) {
            t2[i] = t[i];
        }
        
        t2[t2.length - 1] = elemento;
        
        return t2;
    }
    
    public static int [] desordenarArray(int t []) {
        int aux = 0;
        
        for (int i = t.length - 1; i > 0; i--) { 
            int nuevaPosicion = (int)(Math.random() * (i+1)); 
            
            aux = t[i];
            t[i] = t[nuevaPosicion];
            t[nuevaPosicion] = aux;
        }
        
        return t;
    }
}