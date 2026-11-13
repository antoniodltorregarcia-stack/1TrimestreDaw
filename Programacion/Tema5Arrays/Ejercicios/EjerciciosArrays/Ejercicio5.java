import java.util.Scanner;

/**
 * Debes desarrollar una aplicación que ayude a gestionar las notas
 * de un centro educativo. Los alumnos se organizan en grupos compuestos
 * por 5 personas. Leer las notas (números enteros) del primer, segundo
 * y tercer trimestre de un grupo. Debes mostrar al final la nota media
 * del grupo en cada trimestre y la media del alumno que se encuentra en
 * una posición dada (que el usuario introduce por teclado). 
 * 
 * 
 * @author (Tony) 
 * @version (5.15)
 */
public class Ejercicio5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        byte opcion = 0;
        
        int trimestre1 [] = new int [5];
        int trimestre2 [] = new int [5];
        int trimestre3 [] = new int [5];
        
        
        do {
            System.out.println("Gestión de notas:");
            System.out.println("(1) Introducir datos del 1º Trimestre");
            System.out.println("(2) Introducir datos del 2º Trimestre");
            System.out.println("(3) Introducir datos del 3º Trimestre");
            System.out.println("(4) Ver media de los Trimestres");
            System.out.println("(5) Ver la nota concreta de un alumno");
            System.out.println("(-1) Cerrar programa");
            
            opcion = sc.nextByte();
            switch (opcion) {
                default:
                    System.out.println("Opción no válida");
                    break;
                case -1:
                    System.out.println("Cerrando programa...");
                    break;
                case 1:
                    rellenar1Trim(trimestre1, sc);
                    break;
                case 2:
                    rellenar2Trim(trimestre2, sc);
                    break;
                case 3:
                    rellenar3Trim(trimestre3, sc);
                    break;
                case 4:
                    calcularMedia(trimestre1, trimestre2, trimestre3, sc);
                    break;
                case 5:
                    System.out.println("La nota del alumno es: " + mostrarNota(trimestre1, trimestre2, trimestre3, sc));
                    break;
            }
        } while (opcion != -1);
    }
    
    public static int [] rellenar1Trim (int trimestre1 [], Scanner sc) {
        
        for (int i = 0; i < trimestre1.length; i++) {
            System.out.println("Introduce la nota del alumno " + i);
            trimestre1 [i] = sc.nextInt();
        }
        
        return trimestre1;
    }
    
    public static int [] rellenar2Trim (int trimestre2 [], Scanner sc) {
        
        for (int i = 0; i < trimestre2.length; i++) {
            System.out.println("Introduce la nota del alumno " + i);
            trimestre2 [i] = sc.nextInt();
        }
        
        return trimestre2;
    }
    
    public static int [] rellenar3Trim (int trimestre3 [], Scanner sc) {
        
        for (int i = 0; i < trimestre3.length; i++) {
            System.out.println("Introduce la nota del alumno " + i);
            trimestre3 [i] = sc.nextInt();
        }
        
        return trimestre3;
    }
    
    public static void calcularMedia (int trimestre1 [], int trimestre2 [], int trimestre3 [], Scanner sc) {
        int suma1Trimes = 0;
        int suma2Trimes = 0;
        int suma3Trimes = 0;
        for (int i = 0; i < trimestre1.length; i++) {
            suma1Trimes += trimestre1 [i];
        }
        
        for (int i = 0; i < trimestre2.length; i++) {
            suma2Trimes += trimestre2 [i];
        }
        
        for (int i = 0; i < trimestre3.length; i++) {
            suma3Trimes += trimestre3 [i];
        }
        
        System.out.println("Media 1º Trimestre: " + suma1Trimes / 5);
        System.out.println("Media 2º Trimestre: " + suma2Trimes / 5);
        System.out.println("Media 3º Trimestre: " + suma3Trimes / 5);
    }
    
    public static int mostrarNota (int trimestre1 [], int trimestre2 [], int trimestre3 [], Scanner sc) {
        byte opcion = 0;
        int dato = 0;
        
        System.out.println("(1) Ver nota de 1ºTrimestre");
        System.out.println("(2) Ver nota de 2ºTrimestre");
        System.out.println("(3) Ver nota de 3ºTrimestre");
        System.out.println("(-1) Cerrar ver nota concreta...");
        
        opcion = sc.nextByte();
        int alumno = 0;
        
        switch (opcion) {
            default: 
                System.out.println("Opción no válida");
                break;
            case -1:
                System.out.println("Cerrando ver nota concreta...");
                break;
            case 1:
                System.out.println("Introduce el número de alumno");
                alumno = sc.nextInt();
                dato = trimestre1 [alumno];
                break;
             case 2:
                System.out.println("Introduce el número de alumno");
                alumno = sc.nextInt();
                dato = trimestre2 [alumno];
                break;
             case 3:
                System.out.println("Introduce el número de alumno");
                alumno = sc.nextInt();
                dato = trimestre3 [alumno];
                break;
        }
        
        return dato;
    }
}