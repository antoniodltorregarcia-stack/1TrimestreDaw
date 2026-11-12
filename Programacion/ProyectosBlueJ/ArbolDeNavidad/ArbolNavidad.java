import java.util.Scanner;

public class ArbolNavidad {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del árbol: ");
        int tam = sc.nextInt();
        
        dibujarArbol(tam);
    }
    
    
    public static void dibujarArbol(int tam) {
        int filasCopa = (tam * 2) + 1;
        int espaciosIniciales = tam * 2;
        
        //Dibujamo la copa del arbol
        for (int i = 1; i <= filasCopa; i++) {
            // Imprimir espacios a la izquierda
            for (int e = 0; e < espaciosIniciales - (i - 1); e++) {
                System.out.print(" ");
            }
            
            // Elegir entre --> (* o #)
            char simbolo = '*';
            if (i == filasCopa || i == filasCopa - 2) {
                simbolo = '#';
            }
            
            // Imprimir los símbolos de la fila (1, 3, 5, 7...)
            int cantidadSimbolos = (2 * i) - 1;
            for (int s = 0; s < cantidadSimbolos; s++) {
                System.out.print(simbolo);
            }
            
            System.out.println(); // Salto de línea
        }
        
        //Dibujamos el tronco (siempre van a ser 2 filas de |||)
        for (int t = 0; t < 2; t++) {
            for (int e = 0; e < espaciosIniciales - 1; e++) {
                System.out.print(" ");
            }
            System.out.println("|||");
        }
        
    }
}

    
