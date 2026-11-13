package modelo;


/**
 * Write a description of class Posicion here.
 * 
 * @author (TonY) 
 * @version (ClasePosicion)
 */
public class Posicion {
    private int posX;
    private int posY;
    private int velX;
    private int velY;
    
    public Posicion(int posX, int posY, int velX,int velY){
        this.posX=posX;
        this.posY=posY;
        this.velX=velX;
        this.velY=velY;
    }
    
    public int getposX(){
        return posX;
    }
    
    public void setposX(int posX){
        this.posX=posX;
    }
    
    public int getposY(){
        return posY;
    }
    
    public void setposY(int posY){
        this.posY=posY;
    }
    
    public int getvelX(){
        return velX;
    }
    
    public void setvelX(int velX){
        this.velX=velX;
    }
    
    public int getvelY(){
        return velY;
    }
    
    public void setvelY(int velY){
        this.velY=velY;
    }
}
