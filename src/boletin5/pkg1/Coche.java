
package boletin5.pkg1;


public class Coche {
    
    private int velocidade,Acelerar,Frenar;
    
    public Coche(){
         velocidade =0;
        
    }
    public Coche(int Velocidade,int Frenar,int Acelerar){
        Velocidade = velocidade;
        Frenar = Frenar;
        Acelerar = Acelerar;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
       
        return velocidade;
    }
   
    public void setFrenar(int Frenar){
        this.Frenar =  Frenar;
    }
    
    public int getFrenar() {
        return velocidade+Acelerar-Frenar;
    }
    
    public void setAcelerar(int Velocidade){
       Acelerar = Velocidade;
    }

    public int getAcelerar() {
        return velocidade+Acelerar;
    }
    
}
