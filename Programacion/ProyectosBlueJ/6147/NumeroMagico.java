import java.util.Scanner;

/**
 * Write a description of class NumeroMagico here.
 * 
 * @author (Tony) 
 * @version (6147)
 */
public class NumeroMagico {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número de 4 digitos diferentes, Ej: (3524) ");
        
        
        int n = sc.nextInt();
        int cont = 0;
        int M = 0;
        int m = 0;
        //Condición
        
        if (n < 1000 || n > 9999 || n % 1111 == 0) {
            System.out.println("El número introducido no cumple los parametros");
        } else {
            do {
                int unid = n % 10;
                int dec = (n/10) % 10;
                int cent = (n/100) % 10;
                int mill = n / 1000;
                
                int mayor1;
                int menor1;
                int mayor2;
                int menor2;
                
                if (mill > cent) {
                    mayor1 = mill;
                    menor1 = cent;
                } else {
                    mayor1 = cent;
                    menor1 = mill;
                }
                        
                if (dec > unid) {
                    mayor2 = dec;
                    menor2 = unid;
                } else {
                    mayor2 = unid;
                    menor2 = dec;
                }
                
                if (mayor1 >= mayor2) {
                    mill = mayor1; 
                    if (menor1 >= mayor2) {
                        cent = menor1;
                        dec = mayor2;
                        unid = menor2;
                    } else if (menor1 >= menor2) {
                        cent = mayor2;
                        dec = menor1;
                        unid = menor2;
                    } else {
                        cent = mayor2;
                        dec = menor2;
                        unid = menor1;
                    }
                } else {
                    mill = mayor2; 
                    if (menor2 >= mayor1) {
                        cent = menor2;
                        dec = mayor1;
                        unid = menor1;
                    } else if (menor2 >= menor1) {
                        cent = mayor1;
                        dec = menor2;
                        unid = menor1;
                    } else {
                        cent = mayor1;
                        dec = menor1;
                        unid = menor2;
                    }
                }
                
                M = (mill * 1000) + (cent * 100) + (dec * 10) + unid;
                m = (unid * 1000) + (dec * 100) + (cent * 10) + mill;
                    
                n = M - m;
                System.out.println(M + " - " + m + " = " + n);
                cont++;
                
                
            } while (n != 6174);
            
            System.out.println("Numero de intentos: " + cont);
        }
        
    }
}