import java.util.Scanner;

public class MatrizFormateada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();
        
        // Calculamos el límite superior directamente
        int limite = n * n;
        
        // Calculamos cuántos dígitos tiene el límite usando un bucle
        int digitos = 0;
        int temp = limite;
        
        while (temp > 0) {
            digitos++;
            temp /= 10;
        }
        
        // Construimos el formato dinámico (ej: "%02d ")
        String formato = "%0" + digitos + "d ";
        
        int contador = 1;
        
        // Imprimimos la matriz de nxn
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(formato, contador);
                contador++;
            }
            System.out.println(); // Salto de línea por cada fila
        }
        
        scanner.close();
    }
}
