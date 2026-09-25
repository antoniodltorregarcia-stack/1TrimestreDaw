import java.util.Scanner;

/**
 * Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha 
 * correspondiente al día siguiente.
 * 
 * @author (Tony) 
 * @version (2.14)
 */
public class Ejercicio14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame en número dia, mes y año y te dire el dia siguiente");
        
        System.out.println("Dia:");
        int dia = sc.nextInt();
        
        System.out.println("Mes:");
        int mes = sc.nextInt();
        
        System.out.println("Año:");
        int anio = sc.nextInt();
        
        if (dia < 0 || dia > 31 || mes < 0 || mes > 12 || anio < 0) {
            System.out.println("Formato no válido");
            return;
        }
        
        System.out.println("Fecha original = " + dia + "/" + mes + "/" + anio);
        
        dia++;
        
        switch (mes) {
            case 1, 3, 5, 7, 8, 11, 12:
                if (dia == 32) {
                    mes++;
                    dia = 1;
                    break;
                }
                
            case 2:
                if (dia > 29) {
                    System.out.println("Febrero solo tiene 28 dias");
                    return;
                } else if (dia == 29) {
                    mes++;
                    dia = 1;
                    break;
                }
                
            case 4, 6, 9, 10: 
                if (dia > 31) {
                    System.out.println("Este mes solo tiene 30 dias");
                    return;
                } else if (dia == 31) {
                    mes++;
                    dia = 1;
                    break;
                }
                
        }
        
        if (mes == 13) {
            mes = 1;
            anio++;
        }
        
        System.out.println("Fecha + 1 dia = " + dia + "/" + mes + "/" + anio);
    }
}