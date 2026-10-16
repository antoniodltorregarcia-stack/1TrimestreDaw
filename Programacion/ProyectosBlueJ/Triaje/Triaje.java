import java.util.Scanner;

/**
    //Primero: reglas
    // Rojo: gravedad inminente de compromiso vital: hemorragia, h interna, ictus, cv: arritmia, fc baja, fc alta, fr baja o alta
    // Amarillo: Gravedad pero compromiso vital a futuro: cancer?, neumonia?, infeccion generalizada
    // Verde: No hay compromiso vital a presente o futuro
    
    //entrada
    // ¿que pedimos al medico? hemorragia(boolean), interna(boolean). ictus(boolean), arritmia(boolean)
    // fcbaja es cuando fc<40, fcalta es fc>110 en reposo, frbaja est por debajo de 10/minuto, fralta es fr>20
    // tumor(boolean), neumonia(boolean), igeneral(boolean)
    //Memoria
    
    
    //Proceso
    
    
    
    //salida

    @author (Tony)
    @version (1.0)

 */
public class Triaje {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        //Triaje Rojo
        boolean hemorragia, hemorragiaInterna, ictus, arritmia, fcBaja, fcAlta, frBaja, frAlta;
        //Triaje Amarillo
        boolean cancer, neumonia, infeccion;
        //Triaje Verde
            //No se cumple ninguno
            
        System.out.println("¿Existe hemorragia? (1) si , (0) no");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            hemorragia = true;
        } else hemorragia = false;
        
        System.out.println("¿Existe hemorragia interna? (1) si , (0) no");
        opcion = sc.nextInt();
        if (opcion == 1) {
            hemorragiaInterna = true;
        } else hemorragiaInterna = false;
        
        System.out.println("¿Existe un ictus? (1) si , (0) no");
        opcion = sc.nextInt();
        if (opcion == 1) {
            ictus = true;
        } else ictus = false;
        
        System.out.println("¿Existe arritmia? (1) si , (0) no");
        opcion = sc.nextInt();
        if (opcion == 1) {
            arritmia = true;
        } else arritmia = false;
        
        System.out.println("Cual es la frecuencia cardiaca del usuario");
        opcion = sc.nextInt();
        
        if (opcion < 40) {
            fcBaja = true;
            fcAlta = false;
        } else if (opcion > 110) {
            fcBaja = false;
            fcAlta = true;
        } else {
            fcBaja = false;
            fcAlta = false;
        }
        
        System.out.println("Cual es la frecuencia respiratoria del usuario");
        opcion = sc.nextInt();
        
        if (opcion < 10) {
            frBaja = true;
            frAlta = false;
        } else if (opcion > 20) {
            frBaja = false;
            frAlta = true;
        } else {
            frBaja = false;
            frAlta = false;
        }
        
        System.out.println("¿Existe cancer? (1) si , (0) no");
        opcion = sc.nextInt();
        if (opcion == 1) {
            cancer = true;
        } else cancer = false;
        
        System.out.println("¿Existe neumonia? (1) si , (0) no");
        opcion = sc.nextInt();
        if (opcion == 1) {
            neumonia = true;
        } else neumonia = false;
        
        System.out.println("¿Existe infeccion? (1) si , (0) no");
        opcion = sc.nextInt();
        if (opcion == 1) {
            infeccion = true;
        } else infeccion = false;
        
        System.out.println("");
        
        if (hemorragia == true || hemorragiaInterna == true || ictus == true || arritmia == true || fcBaja == true || fcAlta == true || frBaja == true || frAlta == true) {
            System.out.println("Triaje Rojo");
        } else if (cancer == true || neumonia == true || infeccion == true) {
            System.out.println("Triaje Amarillo");
        } else System.out.println("Triaje Verde");
    }
}