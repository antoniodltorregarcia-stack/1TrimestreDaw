import java.util.Scanner;

/**
 * Crea un programa en el que mediante una funcion se calcule el area o el volumen de un cilindro
 * (a peticion del usuario).
 * 
 * area total cilindro --> A = 2 * pi * r^2 + 2 * pi * h (r = radio, h = altura);
 * volumen cilindro --> V = pi * r^2 * h (r = de la base, h = altura);
 * 
 * @author (Tony) 
 * @version (Ejercicio3)
 */
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los datos de tu cilindro");
        
        System.out.println("Radio: ");
        double r = sc.nextDouble();
        
        System.out.println("Altura: ");
        double h = sc.nextDouble();
        
        System.out.println("¿Que quieres calcular?");
        System.out.println("(1) Area del cilindro");
        System.out.println("(2) Volumen de cilindro");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Area del cilindro = " + area(r,h));
                break;
            case 2:
                System.out.println("Volumen del cilindro = " + volumen(r,h));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    
    public static double area (double r, double h) {
        return (2 * Math.PI * (r*r) + 2 * Math.PI * r * h);
    }
    
    public static double volumen (double r, double h) {
        return (Math.PI * (r*r) * h);
    }
}