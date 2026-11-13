package modelo;


/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal {
    
    private static Persona tony;
    
    public Principal () {
        
    }
    
    public static void main (String[]args) {
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
    }
}
