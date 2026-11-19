package modelo;
import java.util.Scanner;


/**
 * Write a description of class Ciudad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ciudad {
    private String nombre;
    private String ciudad[] = null;
    
    public Ciudad (String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarCiudades(String nuevaCiudad) {
        if (this.ciudad == null) { //Si no existen ciudades previas , creamos un espacio [1] y agregamos la ciudad al valor ciudad[0]
            this.ciudad = new String[1];
            this.ciudad[0] = nuevaCiudad;
        } else {
            String[] aux = new String[this.ciudad.length + 1]; //Creamos un auxiliar con un espacio de mas
            
            for (int i = 0; i < this.ciudad.length; i++) { //bucle para añadir los datos al auxiliar
                aux[i] = this.ciudad[i];
            }
            
            aux[aux.length - 1] = nuevaCiudad; //le damos el valor anterior a auxiliar para no perderlo
            this.ciudad = aux; //agregamos todos los datos a this.ciudad
        }
    }
    
    public void eliminarCiudades(String ciudadEliminada) {
        if (this.ciudad == null) { //Comprobamos si este vacio
            System.out.println("No existen ciudades que eliminar");
            return;
        } 
        
        int indiceQueEliminar = -1; //Empezamos en -1 para no coger el 0 por defecto
        
        for(int i = 0; i < this.ciudad.length; i++) { //Bucle para buscar el indice donde esta la ciudad
            if(this.ciudad[i].equalsIgnoreCase(ciudadEliminada)) {
                indiceQueEliminar = i;
                break;
            }
        }
        
        if (indiceQueEliminar == -1) { //Si el valor no se ha movido, no esta
            System.out.println("La ciudad no se encuentra en la lista");
            return;
        }
        
        if (this.ciudad.length == 1) { //Si la longitud era de solo 1, vuelve a null
            this.ciudad = null;
            return;
        }
        
        String [] aux = new String[this.ciudad.length - 1]; //Creamos un auxiliar con uno menos
        
        for (int i = 0; i < indiceQueEliminar; i++) { //Añadimos la lista original al auxiliar
            aux[i] = this.ciudad[i];
        } 
        
        for (int i = indiceQueEliminar + 1; i < this.ciudad.length; i++) { //Copiamos las ciudades despues de eliminar la elegida, -1 puesto 
            aux[i - 1] = this.ciudad[i];
        } 
        
        this.ciudad = aux; //El valor vuelve a ciudad
        
    }
    
    public void mostrarCiudades() {
        if (this.ciudad == null) {
            System.out.println("No existen ciudades");
        } else {
            for (int i = 0; i < this.ciudad.length; i++) {
                System.out.println(i + ". " + this.ciudad[i]);
            }
        } 
    }
}