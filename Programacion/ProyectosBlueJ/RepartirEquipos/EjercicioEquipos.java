import java.util.Scanner;

/**
 * Introduce valores de edades y ve añadiendolo a 4 equipos distintos y que este variadas las edades
 * 
 * @author (Tony) 
 * @version (EjercicioProfesor)
 */
public class EjercicioEquipos {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        
        int edad = 0;
        
        int equipo0 = 0, equipo1 = 0, equipo2 = 0, equipo3 = 0;
        
        int cantidad0 = 0, cantidad1 = 0, cantidad2 = 0, cantidad3 = 0;
        
        do {
            System.out.println("Introduce la edad (-1) para finalizar");
            
            edad = sc.nextInt();
            
            // 1. Si es -1 reventamos el programa
            
             if (edad == -1) {
                break; 
            }
            
            // 2. En principio el mejor equipo para el jugador es el Equipo 0
            int equipoElegido = 0;
            int cantElegida = cantidad0;
            int edadElegida = equipo0;
  
            // 3. Comparamos contra el Equipo 1
            // Un equipo es mejor si tiene MENOS jugadores. Si empatan en jugadores, es mejor si tiene MENOS suma de edad.
            if (cantidad1 < cantElegida || (cantidad1 == cantElegida && equipo1 < edadElegida)) {
                equipoElegido = 1;
                cantElegida = cantidad1;
                edadElegida = equipo1;
            }
            
            // 4. Comparamos el ganador actual contra el Equipo 2
            if (cantidad2 < cantElegida || (cantidad2 == cantElegida && equipo2 < edadElegida)) {
                equipoElegido = 2;
                cantElegida = cantidad2;
                edadElegida = equipo2;
            }
            
            // 5. Comparamos el ganador actual contra el Equipo 2
            if (cantidad3 < cantElegida || (cantidad3 == cantElegida && equipo3 < edadElegida)) {
                equipoElegido = 3;
                cantElegida = cantidad3;
                edadElegida = equipo3;
            }
            
            //En caso de empate se queda en el equipo 0
            
            // 6. Aplicamos los cambios segun el ganador
            if (equipoElegido == 0) {
                cantidad0++;
                equipo0 += edad;
            } else if (equipoElegido == 1) {
                cantidad1++;
                equipo1 += edad;
            } else if (equipoElegido == 2) {
                cantidad2++;
                equipo2 += edad;
            } else if (equipoElegido == 3) {
                cantidad3++;
                equipo3 += edad;
            }
            
            // 7. Printeamos el valor
            System.out.println("El corredor de edad: " + edad + " forma parte del equipo " + equipoElegido);
            
            
            //Al no usar arrays no podemos mostrar las edades de todos los participantes de cada equipo
        }while (edad != -1);
    }
}