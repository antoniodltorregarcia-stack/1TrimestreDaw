import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. 
 * El programa debe mostrarlo con letras. por ejemplo, para 56, se verá: «cincuenta y seis». 
 * 
 * @author (Tony) 
 * @version (2.14)
 */
public class Ejercicio14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un numero entre 1 - 99");
        
        int n = sc.nextInt();
        
        if (n < 1 || n > 99) {
            System.out.println("Número no válido");
            return;
        }
        
        String texto = "";
        
        // 1. Extraemos la unidad de los números que se componen (ej: el 6 en el 56, o el 7 en el 17)
        // Para los números del 1 al 9, se extrae el número directo.
        int unidad = n % 10;
        
        if (n <= 9) {
            switch (n) {
                case 1: texto = "uno"; break;
                case 2: texto = "dos"; break;
                case 3: texto = "tres"; break;
                case 4: texto = "cuatro"; break;
                case 5: texto = "cinco"; break;
                case 6: texto = "seis"; break;
                case 7: texto = "siete"; break;
                case 8: texto = "ocho"; break;
                case 9: texto = "nueve"; break;
            }
        } else {
            // Evaluamos casos especiales fijos y decenas exactas
            switch (n) {
                case 10: texto = "diez"; break;
                case 11: texto = "once"; break;
                case 12: texto = "doce"; break;
                case 13: texto = "trece"; break;
                case 14: texto = "catorce"; break;
                case 15: texto = "quince"; break;
                case 16: texto = "dieciséis"; break; 
                case 20: texto = "veinte"; break;
                case 30: texto = "treinta"; break;
                case 40: texto = "cuarenta"; break;
                case 50: texto = "cincuenta"; break;
                case 60: texto = "sesenta"; break;
                case 70: texto = "setenta"; break;
                case 80: texto = "ochenta"; break;
                case 90: texto = "noventa"; break;
                default:
                    // Si no es un número fijo, obtenemos el texto de su unidad para concatenarlo después
                    switch (unidad) {
                        case 1: texto = "uno"; break;
                        case 2: texto = "dos"; break;
                        case 3: texto = "tres"; break;
                        case 4: texto = "cuatro"; break;
                        case 5: texto = "cinco"; break;
                        case 6: texto = "seis"; break;
                        case 7: texto = "siete"; break;
                        case 8: texto = "ocho"; break;
                        case 9: texto = "nueve"; break;
                    }
                    break;
            }
        }
        
        // 2. Imprimimos el resultado final combinándolo según tu lógica original
        if (n >= 17 && n <= 19){
            System.out.println("dieci" + texto);
        } else if (n >= 21 && n <= 29) {
            System.out.println("veinti" + texto);
        } else if (n >= 31 && n <= 39) {
            System.out.println("treinta y " + texto);
        } else if (n >= 41 && n <= 49) {
            System.out.println("cuarenta y " + texto);
        } else if (n >= 51 && n <= 59) {
            System.out.println("cincuenta y " + texto); // Espacio corregido aquí
        } else if (n >= 61 && n <= 69) {
            System.out.println("sesenta y " + texto);
        } else if (n >= 71 && n <= 79) {
            System.out.println("setenta y " + texto);
        } else if (n >= 81 && n <= 89) {
            System.out.println("ochenta y " + texto);
        } else if (n >= 91 && n <= 99) {
            System.out.println("noventa y " + texto);
        } else {
            System.out.println(texto);
        }
    }
}
