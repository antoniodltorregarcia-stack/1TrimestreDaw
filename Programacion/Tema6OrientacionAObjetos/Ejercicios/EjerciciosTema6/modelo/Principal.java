package modelo;
import java.util.Scanner;


/**
 * En esta clase se trabajan los objetos creados en el paquete
 * 
 * @author (Tony) 
 * @version (Clase Principal(Main))
 */
public class Principal {
    
    
    
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        Ciudad gestorDeCiudades = new Ciudad ("España");
        String nuevaCiudad = "Stop";
        
        do {
            System.out.println("Introduce una ciudad (Stop finaliza el ingreso)");
            nuevaCiudad = sc.nextLine();
            
            if (!nuevaCiudad.equalsIgnoreCase("Stop")) {
                gestorDeCiudades.agregarCiudades(nuevaCiudad);
            }
        } while (!nuevaCiudad.equalsIgnoreCase("Stop"));
        
        System.out.println("Quieres eliminar alguna ciudad(1) Si, (2) No");
        int opcion = sc.nextInt();
        sc.nextLine(); //Limpia el buffer de los cohone
        
        String ciudadEliminar = "Stop";
        if (opcion == 1) {
            do {
                System.out.println("Introduce una ciudad (Stop finaliza el ingreso)");
                ciudadEliminar = sc.nextLine();
                
                if (!ciudadEliminar.equalsIgnoreCase("Stop")) {
                    gestorDeCiudades.eliminarCiudades(ciudadEliminar);
                }
            } while (!ciudadEliminar.equalsIgnoreCase("Stop"));
        }
        
        
        System.out.println("Ciudades guardadas");
        gestorDeCiudades.mostrarCiudades();
    }
    /*
     * 
     *  private static Persona tony;
     *  
        Persona tony;
        
        tony = new Persona ("Tony", "De La Torre", "Garcia", "44652589K", 23, "602343323", "antoniodltorregarcia@gmail.com");

        System.out.println("Los datos del patrón del programa son:");
        System.out.println("Nombre: " + tony.getNombre());
        System.out.println("Apellido 1: " + tony.getApellido1());
        System.out.println("Apellido 2: " + tony.getApellido2());
        System.out.println("Dni: " + tony.getDni());
        System.out.println("Edad: " + tony.getEdad());
        System.out.println("Telefono: " + tony.getTelefono());
        System.out.println("Email: " + tony.getEmail());
        
    */
    
    
}
