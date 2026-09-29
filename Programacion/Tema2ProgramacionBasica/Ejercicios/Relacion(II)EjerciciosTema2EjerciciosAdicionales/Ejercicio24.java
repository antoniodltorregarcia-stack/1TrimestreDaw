import java.util.Scanner;

/**
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y laestatura media,
 * la cantidad de alumnos mayores de 18 años,
 * y la cantidad dealumnos que miden más de 1.75.
 * 
 * @author (Tony) 
 * @version (Adicional24)
 */
public class Ejercicio24 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int mayor18 = 0;
        
        int mayor175 = 0;
        
        System.out.println("Alumno 1");
        
        System.out.println("Edad = ");
        
        int edad1 = sc.nextInt();
        
        System.out.println("Altura = ");
        
        double altura1 = sc.nextDouble();
        
        if (edad1 < 0 || altura1 < 0) {
            System.out.println("Datos invalidos");
            return;
        } else if (edad1 >= 18) {
            mayor18++;
        } else if (altura1 >= 1.75) {
            mayor175++;
        }
        
        System.out.println("Alumno 2");
        
        System.out.println("Edad = ");
        
        int edad2 = sc.nextInt();
        
        System.out.println("Altura = ");
        
        double altura2 = sc.nextDouble();
        
        if (edad2 < 0 || altura2 < 0) {
            System.out.println("Datos invalidos");
            return;
        } else if (edad2 >= 18) {
            mayor18++;
        } else if (altura2 >= 1.75) {
            mayor175++;
        }
        
        System.out.println("Alumno 3");
        
        System.out.println("Edad = ");
        
        int edad3 = sc.nextInt();
        
        System.out.println("Altura = ");
        
        double altura3 = sc.nextDouble();
        
        if (edad3 < 0 || altura3 < 0) {
            System.out.println("Datos invalidos");
            return;
        } else if (edad3 >= 18) {
            mayor18++;
        } else if (altura3 >= 1.75) {
            mayor175++;
        }
        
        System.out.println("Alumno 4");
        
        System.out.println("Edad = ");
        
        int edad4 = sc.nextInt();
        
        System.out.println("Altura = ");
        
        double altura4 = sc.nextDouble();
        
        if (edad4 < 0 || altura4 < 0) {
            System.out.println("Datos invalidos");
            return;
        } else if (edad4 >= 18) {
            mayor18++;
        } else if (altura4 >= 1.75) {
            mayor175++;
        }
        
        System.out.println("Alumno 5");
        
        System.out.println("Edad = ");
        
        int edad5 = sc.nextInt();
        
        System.out.println("Altura = ");
        
        double altura5 = sc.nextDouble();
        
        if (edad5 < 0 || altura5 < 0) {
            System.out.println("Datos invalidos");
            return;
        } else if (edad5 >= 18) {
            mayor18++;
        } else if (altura5 >= 1.75) {
            mayor175++;
        }
        
        
        double mediaAltura = (altura1 + altura2 + altura3 + altura4 + altura5) / 5;
        int mediaEdad = (edad1 + edad2 + edad3 + edad4 + edad5) / 5;
        
        System.out.println("Altura media: " + mediaAltura);
        System.out.println("Edad media: " + mediaEdad);
        System.out.println("nº alumnos +18: " + mayor18);
        System.out.println("nº alumnos +1,75: " + mayor175);
    }
}