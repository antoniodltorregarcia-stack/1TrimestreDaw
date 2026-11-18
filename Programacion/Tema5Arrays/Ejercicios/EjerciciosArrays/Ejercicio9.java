import java.util.Scanner;

/**
 * Diseña una aplicación para gestionar la llegada a meta de los participantes de una carrera. Cada uno de ellos dispone
 * de un dorsal (un número entero) que los identifica. En la aplicación se introduce el número de dorsal de cada corredor
 * cuando este llega a la meta. 
 * 
 * Para indicar que la carrera ha finalizado (han llegado todos los corredores a la meta),
 * se introduce como dorsal el número -1. 
 * 
 * A continuación, la aplicación solicita información extra de los corredores.
 * 
 * En primer lugar, se introducen los dorsales de todos los corredores menores de edad; para premiarlos por su esfuerzo
 * se les avanza un puesto en el ranking general de la carrera, es decir, es como si hubieran adelantado al corredor que
 * llevaban delante. 
 * 
 * En Segundo lugar, se introducen los dorsales de los corredores que han dado positivo en el test antidopaje,
 * lo que provoca su expulsión inmediata. 
 * 
 * Para finalizar, se introducen los dorsales de los corredores que no han pagado
 * su inscripción en la carrera, lo que provoca que se releguen a los últimos puestos del ranking general.
 * 
 * La aplicación debe mostrar los dorsales de los corredores que han conseguido las medallas de oro, plata y bronce. 
 * 
 * @author (Tony) 
 * @version (5.19)
 */
public class Ejercicio9 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int t [] = new int [100];
        
        rellenarDatos(t,sc);
        int nParticipantes = longitudArray(t);
        
        int dorsalesMenores [] = new int [nParticipantes];
        introducirMenores (t,dorsalesMenores,nParticipantes,sc);
        
        int dopados [] = new int [nParticipantes];
        introducirDopados (t,dopados,nParticipantes,sc);
        
        int morosos [] = new int [nParticipantes];
        introducirMorosos (t,morosos,nParticipantes,sc);
        
        int ordenFinal [] = new int [nParticipantes];
        ordenarCarrera(ordenFinal, t, dorsalesMenores, morosos, dopados, nParticipantes, sc);
        
        pintarDatos(t,dorsalesMenores,morosos,dopados,ordenFinal,nParticipantes,sc);
                

    }
    
        public static int[] ordenarCarrera(int ordenFinal[], int t[], int dorsalesMenores[], int morosos[], int dopados[], int nParticipantes, Scanner sc) {
        // Copiamos los participantes activos a ordenFinal
        for (int i = 0; i < nParticipantes; i++) {
            ordenFinal[i] = t[i];
        }
        int totalActivos = nParticipantes; //Reduciremos luego los activos si se ha metio falopa

        // 1. ADELANTAR MENORES (empezando en 1 porque el primero no puede adelantar a nadie)
        for (int i = 1; i < totalActivos; i++) {
            boolean esMenor = false; //Creamos el boolean para las comprobacioneh que siempre empieza en falso
            for (int j = 0; j < dorsalesMenores.length; j++) {
                if (dorsalesMenores[j] != 0 && ordenFinal[i] == dorsalesMenores[j]) { //el primero no puede adelantar al primero 
                    esMenor = true; //cambiamos a true
                    break;
                }
            }
            if (esMenor == true) { 
                int aux = ordenFinal[i - 1]; //Seleccionamos la posicion anterior
                ordenFinal[i - 1] = ordenFinal[i]; //El anterior pasa a ser el menolsito
                ordenFinal[i] = aux; //El actual pasa a ser el anterior
            }
        }

        // 2. EXPULSAR DOPADOS (eliminar y desplazar el resto hacia la izquierda)
        int i = 0;
        while (i < totalActivos) { //Usamos while para no saltar a nadie
            boolean esDopado = false; //Siempre el bucle empieza en false
            for (int j = 0; j < dopados.length; j++) {
                if (dopados[j] != 0 && ordenFinal[i] == dopados[j]) {
                    esDopado = true;
                    break;
                }
            }

            if (esDopado == true) {
                for (int k = i; k < totalActivos - 1; k++) {
                    ordenFinal[k] = ordenFinal[k + 1]; //copia el dato al siguiente en la lista
                }
                ordenFinal[totalActivos - 1] = 0; //coge al ultimo que hemos movido con el for y lo convierte en 0
                totalActivos--; //Reduce el límite del array
            } else {
                i++; //sino avanza al siguiente
            }
        }

        // 3. RELEGAR MOROSOS AL FINAL
        int revisados = 0; // Cuenta cuántos corredores hemos comprobado ya (evita bucles infinitos)
        int pos = 0;  // Índice de la casilla actual del array que estamos mirando

        // Repetimos hasta haber revisado exactamente a todos los corredores activos
        while (revisados < totalActivos) {
            boolean esMoroso = false;

            // Buscamos si el dorsal de la posición 'pos' está en la lista de morosos
            for (int j = 0; j < morosos.length; j++) {
                // Ignoramos los 0 porque son posiciones vacías del array
                if (morosos[j] != 0 && ordenFinal[pos] == morosos[j]) {
                    esMoroso = true;
                    break; // Si lo encontramos, dejamos de buscar
                }
            }

            if (esMoroso == true) {
                // 1. Guardamos el dorsal del moroso antes de pisarlo
                int morosoActual = ordenFinal[pos];

                // 2. Desplazamos a todos los corredores de detrás un puesto hacia la izquierda
                for (int k = pos; k < totalActivos - 1; k++) {
                    ordenFinal[k] = ordenFinal[k + 1];
                }

                // 3. Colocamos al moroso en la última posición de los corredores activos
                ordenFinal[totalActivos - 1] = morosoActual;

                // IMPORTANTE: No sumamos 'pos++' porque el corredor de detrás acaba de ocupar esta misma casilla
            } else {
                // Si NO es moroso, se queda en su sitio y pasamos a revisar la siguiente casilla
                pos++;
            }

            // Hayamos movido al corredor o no, ya hemos revisado a uno más
            revisados++;
        }


        return ordenFinal;
    }

    
    
    public static void pintarDatos (int t[], int dorsalesMenores[], int morosos[], int dopados[],int ordenFinal[], int nParticipantes, Scanner sc) {
        System.out.print("Dorsales introducidos por orden: ");
        for(int i = 0; i < nParticipantes; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
        
        System.out.print("Dorsales de menores:             ");
        for(int i = 0; i < dorsalesMenores.length; i++) {
            System.out.print(dorsalesMenores[i] + " ");
        }
        System.out.println();
        
        System.out.print("Dorsales de dopados:             ");
        for(int i = 0; i < dopados.length; i++) {
            System.out.print(dopados[i] + " ");
        }
        System.out.println();
        
        System.out.print("Dorsales de morosos:             ");
        for(int i = 0; i < morosos.length; i++) {
            System.out.print(morosos[i] + " ");
        }
        System.out.println();
        
        System.out.print("Orden Final:                     ");
        for(int i = 0; i < ordenFinal.length; i++) {
            System.out.print(ordenFinal[i] + " ");
        }
        System.out.println();
        
        System.out.println("Dorsales Ganadores:");
        System.out.println("Primer puesto:  " + ordenFinal[0]);
        System.out.println("Segundo puesto: " + ordenFinal[1]);
        System.out.println("Tercer puesto:  " + ordenFinal[2]);
    }
    
    public static int [] rellenarDatos (int t [], Scanner sc) {
        int dorsal = 0;
        
        for (int i = 0; i < t.length; i++) {
            System.out.println("Introduce el dorsal del corredor (-1 cierra el ingreso)");
            dorsal = sc.nextInt();
            if (dorsal != -1) {
                t[i] = dorsal;
            } else break;
        }
        
        return t;
    }
    
    public static int longitudArray (int t[]) {
        int limite = 0;
        
        for(int i = 0; i < t.length; i++) {
            if (t[i] == 0) {
                limite = i;
                break;
            }
        }
        
        return limite;
    }
    
    public static int [] introducirMenores (int t[], int dorsalesMenores[], int nParticipantes, Scanner sc) {
        int posicion = 0;
        int menor = 0;
        do {
            System.out.println("Introduce el dorsal de un menor (-1 cierra el ingreso)");
            
            menor = sc.nextInt();
            
            for(int i = 0; i < nParticipantes; i++) {
                if (t[i] == menor) {
                    dorsalesMenores[posicion] = t[i];
                    posicion++;
                }
            }
            
        } while (menor != -1);
        
        return dorsalesMenores;
    }
    
    public static int [] introducirMorosos (int t[], int morosos[], int nParticipantes, Scanner sc) {
        int posicion = 0;
        int moroso = 0;
        do {
            System.out.println("Introduce el dorsal del moroso (-1 cierra el ingreso)");
            
            moroso = sc.nextInt();
            
            for(int i = 0; i < nParticipantes; i++) {
                if (t[i] == moroso) {
                    morosos[posicion] = t[i];
                    posicion++;
                }
            }
            
        } while (moroso != -1);
        
        return morosos;
    }
    
    public static int [] introducirDopados (int t[], int dopados[], int nParticipantes, Scanner sc) {
        int posicion = 0;
        int dopado = 0;
        do {
            System.out.println("Introduce el dorsal del dopado (-1 cierra el ingreso)");
            
            dopado = sc.nextInt();
            
            for(int i = 0; i < nParticipantes; i++) {
                if (t[i] == dopado) {
                    dopados[posicion] = t[i];
                    posicion++;
                }
            }
            
        } while (dopado != -1);
        
        return dopados;
    }
}