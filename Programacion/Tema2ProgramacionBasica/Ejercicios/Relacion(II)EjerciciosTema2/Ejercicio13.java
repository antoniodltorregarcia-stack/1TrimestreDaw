import java.util.Scanner;

/**
 * En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales. 
 * El número de animales que alimentar (todos de la misma especie) es numAnmales, y sabemos 
 * que cada animal come una media kilosPorAnimal. Diseña un programa que solicite al usuario los valores
 * anteriores y determine si disponemos de alimento suficiente para cada animal. En caso negativo,
 * ha de calcular cuál es la ración que corresponde a cada uno de los animales.  
 * 
 * Nota: Evitar que la aplicación realice divisiones por cero. 
 * 
 * @author (Tony) 
 * @version (2.13)
 */
public class Ejercicio13 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime cuanta comida se compra al dia para los animales");
        
        int comidaDiaria = sc.nextInt();
        
        System.out.println("Dime cuantos animales hay que alimentar");
        
        int numAnmales = sc.nextInt();
        
        System.out.println("Dime cuantos kilos de media come cada animal");
        
        int kilosPorAnimal = sc.nextInt();
        
        if (numAnmales <= 0 || kilosPorAnimal <= 0 || comidaDiaria <= 0) {
            System.out.println("No puede existir un dato menor o igual a 0");
            return;
        }
        
        int comidaNecesaria = numAnmales * kilosPorAnimal;
        
        if (comidaNecesaria < comidaDiaria) {
            System.out.println("Disponemos de la comida para alimentar a todos los animales");
        } else {
            System.out.println("No disponemos de la comida necesaria, necesitamos una cantidad de: " + comidaNecesaria);
        }
        
    }
    
    //Podriamos tener los int en double en el caso de los kilos fueran por ejemplo 0,5 , 2,5 , etc...
    
}