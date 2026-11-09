public class Ejercicio3 {
    public static void main(String[] args) {
        int[] t = new int[10];
        
        rellenarTabla(t);
        
        int[] t2 = desordenar(t);
        
        System.out.println("Array 1 generado");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Array 2 desordenado");
        for (int i = 0; i < t2.length; i++) {
            System.out.print(t2[i] + " ");
        } 
    }
    
    public static void rellenarTabla(int[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random() * 101);
        }
    }
    
    
    public static int[] desordenar(int[] t) {
        // Creamos la copia 't2' con el mismo tamaño que 't'
        int[] t2 = new int[t.length];
        
        // Copiamos los datos
        for (int i = 0; i < t.length; i++) {
            t2[i] = t[i];
        }
        
        // Desordenamos t2
        for (int i = t2.length - 1; i > 0; i--) { 
            int nuevaPosicion = (int) (Math.random() * (i + 1)); 
             
            int posicionAuxiliar = t2[i]; 
            t2[i] = t2[nuevaPosicion];
            t2[nuevaPosicion] = posicionAuxiliar;
        }
        
        // Devolvemos el array desordenado
        return t2;
    }
}
