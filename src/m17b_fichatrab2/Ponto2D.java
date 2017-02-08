package m17b_fichatrab2;

/**
 * Classe Ponto2D, para instaciar pontos.
 * @version 0.1, 8.fev.2017
 * @author Alfredo Bravo
 */

public class Ponto2D {
    /** Coordenada X */
    private int x;
    /** Coordenada Y */
    private int y;

    /** 
     * Construtor sem parâmetros, que inicializa os atríbutos
     * com valores predefenidos.
     */
    
    public Ponto2D() {
        this.x = 0;
        this.y = 0;        
    }
    
    /**
     * Contrutor de classe parametrizado com todos os atríbutos.
     * @param x
     * @param y 
     */
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Calcular o valor entre as distâncias entre os dois pontos.
     * @param a
     * @return Distância entre ambos os pontos.
     */
    
    public double distancia(Ponto2D a){
        
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    
    /**
     * @return Uma String composta pelos atríbutos da classe
     */
    
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
    
}
