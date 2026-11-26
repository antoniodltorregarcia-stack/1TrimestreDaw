import java.util.Scanner;

/**
 * Aqui tenemos funciones básicas para el uso en ejercicios o programas simples
 * 
 * @author (Tony) 
 * @version (FuncionesTema1,2,3)
 */
public class Funcion {
    
    
    //FUNCIONES DE LECTURA
    
    public static int leerInt(Scanner sc,String msg) {
        System.out.println(msg);
        int n = sc.nextInt();
        return n;
    }
    
    public static double leerDouble(Scanner sc, String msg) {
        System.out.println(msg);
        double n = sc.nextDouble();
        return n;
    }
    
    public static String leerString(Scanner sc, String msg) {
        System.out.println(msg);
        String texto = sc.nextLine();
        return texto;
    }
    
    public static float leerFloat(Scanner sc, String msg) {
        System.out.println(msg);
        float n = sc.nextFloat();
        return n;
    }
    
    
    //FUNCIONES DE CALCULO SENCILLAS
    
    
    public static int sumarDosEnteros(Scanner sc) {
        int a = leerInt(sc,"Dime el numero a");
        int b = leerInt(sc,"Dime el numero b");
        
        return a + b;
    }
    
    public static double sumarDosDobles(Scanner sc) {
        double a = leerDouble(sc,"Dime el numero a");
        double b = leerDouble(sc,"Dime el numero b");
        
        return a + b;
    }
    
    public static int restarDosEnteros(Scanner sc) {
        int a = leerInt(sc,"Dime el numero a");
        int b = leerInt(sc,"Dime el numero b");
        
        return a - b;
    }
    
    public static double restarDosDobles(Scanner sc) {
        double a = leerDouble(sc,"Dime el numero a");
        double b = leerDouble(sc,"Dime el numero b");
        
        return a - b;
    }
    
    public static int multiplicarDosEnteros(Scanner sc) {
        int a = leerInt(sc,"Dime el numero a");
        int b = leerInt(sc,"Dime el numero b");
        
        return a * b;
    }
    
    public static double multiplicarDosDobles(Scanner sc) {
        double a = leerDouble(sc,"Dime el numero a");
        double b = leerDouble(sc,"Dime el numero b");
        
        return a * b;
    }
    
    public static int dividirDosEnteros(Scanner sc) {
        int a = leerInt(sc,"Dime el numero a");
        int b = leerInt(sc,"Dime el numero b");
        
        if (b == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        
        return a / b;
    }
    
    public static double dividirDosDobles(Scanner sc) {
        double a = leerDouble(sc,"Dime el numero a");
        double b = leerDouble(sc,"Dime el numero b");
        
        return a / b;
    }
    
    public static int moduloDosEnteros(Scanner sc) {
        int a = leerInt(sc,"Dime el numero a");
        int b = leerInt(sc,"Dime el numero b");
        
        return a % b;
    }
    
    public static int potenciaDosEnteros(Scanner sc) {
        int a = leerInt(sc,"Dime el numero a elevar");
        int b = leerInt(sc,"Dime las veces que lo quieres elevar");
        int resultado = 1;
        
        for(int i = 1; i <= b; i++) {
            resultado *= a;
        }
        
        return resultado;
    }
    
    public static double moduloDosDobles(Scanner sc) {
        double a = leerDouble(sc,"Dime el numero a");
        double b = leerDouble(sc,"Dime el numero b");
        
        return a % b;
    }
    
    public static boolean esPar(Scanner sc) {
        int n = leerInt(sc, "Introduce el número");
        
        if (n % 2 == 0) {
            return true;
        } else return false;
    }
    
    public static boolean esPrimo(Scanner sc) {
        int n = leerInt(sc, "Introduce el número");
        int cont = 0;
        
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        
        if (cont > 2) {
            return false;
        } else return true;
    }
    
    
    //FUNCIONES DE CALCULO
    
    
    public static int calcularMedia(Scanner sc) {
        int n = 0, suma = 0, cont = 0;
        
        do {
            n = leerInt(sc,"Introduce el valor (-1 finaliza el ingreso de datos)");
            if (n != -1) {
                suma += n;
                cont++;
            }
        } while (n != -1);
        
        int media = suma / cont;
        return media;
    }
    
    public static int minimoComunMultiploDosNumeros(Scanner sc) {
        int a = leerInt(sc,"Dime el numero a");
        int b = leerInt(sc,"Dime el numero b");
        
        int mayor = a, mcm = 0, cont = 1;
        
        if (b > a) {
            mayor = b;
        }
        
        do {
            mcm = mayor * cont;
            cont++;
        } while (mcm % a != 0 || mcm % b != 0);
        
        return mcm;
    }
    
    public static int maximoComunDivisorDosNumeros(Scanner sc) {
        int a = leerInt(sc,"Dime el numero a");
        int b = leerInt(sc,"Dime el numero b");
        
        int mayor = a, divisor = 0, cont = 1;
        
        if (b > a) {
            mayor = b;
        }
        
        do {
            if (a % cont == 0 && b % cont == 0) {
                divisor = cont;
            }
            
            cont++;
        } while (cont != mayor);
        
        return divisor;
    }
    
    
    //FUNCIONES PARA USO DE ARRAYS
    
    
    public static int [] rellenarArray (Scanner sc) {
        int longitud = leerInt(sc, "Dime la longitud del Array");
        int opcion = leerInt(sc, "¿Quieres rellenar el Array a mano (1) o random (2)?");
        int t [] = new int [longitud];
        
        if (opcion == 1) {
            for(int i = 0; i < t.length; i++) {
                t[i] = leerInt(sc, "Introduce el valor "+ i);
            }
        } else if (opcion == 2) {
            for(int i = 0; i < t.length; i++) {
                t[i] = (int) (Math.random() * 101);
            }
        } else System.out.println("Opción no valida"); 
        
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
    
    public static int [] eliminarElementoDeArray(int t[], int n) {
        
        int aux = 0;
        int elemento = n;
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
    
    public static int [] agregarNumerosAlArray (int t [], int n) {
        int aux = 0;
        int elemento = n;
        
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
    
    public static int [] adelantarElementos(int t [], int n) {
        int aux = 0;
        
        for(int i = 1; i < t.length; i++) {
            
            if (t[i] == n) {
                aux = t[i - 1];
                t[i - 1] = t[i]; 
                t[i] = aux;
            }
        }
        
        return t;
    }
    
    public static int [] atrasarElementos(int t [], int n) {
        int aux = 0;
        
        for(int i = 0; i < t.length - 1; i++) {
            
            if (t[i] == n) {
                aux = t[i + 1];
                t[i + 1] = t[i]; 
                t[i] = aux;
            }
        }
        
        return t;
    }
}