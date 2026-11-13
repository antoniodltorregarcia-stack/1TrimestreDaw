package modelo;


/**
 * Write a description of class Coche here.
 * 
 * @author (Tony) 
 * @version (ClaseCoche)
 */
public class Coche {
    private String matricula;
    private String color;
    private String marca;
    private String modelo;
    private int anioMatriculacion;
    
    
    public Coche (String matricula, String color, String marca, String modelo, int anioMatriculacion) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anioMatriculacion = anioMatriculacion;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
    this.modelo = modelo;    
    }
    
    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }
    
    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }
}
