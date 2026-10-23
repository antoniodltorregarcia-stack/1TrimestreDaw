import java.util.Scanner;

/**
 * Realiza el contrario del ejercicio 32. Esta vez se solicitaría un número por teclado en notación hexadecimal
 * y queremos que nos muestre el equivalente en notación decimal
 * 
 * @author (Tony) 
 * @version (Adicional33)
 */
public class Ejercicio33 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un número hexadecimal");
        
        String n = sc.nextLine();
        int potencia = 1; //Empieza en uno y luego sera 16 al ser hexadecimal
        int resultadoFinal = 0;
        
        
        //Bucle que comprueba cada caracter unico (De atras para delante)
        for (int i = n.length() - 1; i >= 0 ; i--) { //Se imprime al reves
         
            char digito = n.charAt(i);
            
            int nInt = 0;
            
            if (digito >= '0' && digito <= '9') { //Si el digito es menor que 9 para pasarlo a int le restamos 0
                nInt = digito - '0'; 
            } else { //Si el digito es una letra le restamos el valor A = 2 y le sumamos 10
                nInt = digito - 'A' + 10;
            }
            
            resultadoFinal += nInt * potencia; //digito que no salga por 16 elevado primero a 0, luego a 1, luego a 2, asi sucesivamente
            potencia *= 16; // Aqui elevamos uno mas a la potencia de 16
            
        }
        System.out.println("Valor en entero = " + resultadoFinal);
    }
}