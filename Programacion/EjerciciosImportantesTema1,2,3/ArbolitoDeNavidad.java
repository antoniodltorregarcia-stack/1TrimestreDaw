import java.util.Scanner;

public class ArbolitoDeNavidad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del árbol");
        int base = sc.nextInt();
        
        int saltos = (base / 2) - 1;
        
        // Copa (2 asteriscos)
        for(int i = 1; i <= saltos; i++) {
            System.out.print(" ");
        }
        System.out.println("**");
        
        // Cuerpo: empezamos en 4 porque la copa de 2 ya está pintada, 
        // y paramos cuando llegamos a la base (capa <= base)
        for (int capa = 2; capa <= base; capa += 2) {
            int espacios = (base - capa) / 2;
            
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < capa; i++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        
        
        int anchoTronco = 2;
        int alturaTronco = base / 2;
        
        
        int espaciosTronco = (base - anchoTronco) / 2;
        
        
        for (int fila = 0; fila < alturaTronco; fila++) {
            
            for (int i = 0; i < espaciosTronco; i++) {
                System.out.print(" ");
            }
            
            for (int i = 0; i < anchoTronco; i++) {
                System.out.print("+");
            }
            System.out.println(); 
        }
        
    }
}
