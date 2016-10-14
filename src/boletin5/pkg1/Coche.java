
package boletin5.pkg1;


public class Coche {
    
    private int velocidade,Acelerar,Frenar;
    
    public Coche(){
        int velocidade =0;
        
    }
    public Coche(int Velocidade,int Frenar,int Acelerar){
        Velocidade = velocidade;
        Frenar = Frenar;
        Acelerar = Acelerar;
    }

    public int getVelocidade() {
       
        return Acelerar -Frenar;
    }
   
    public void setFrenar(int Menos){
        Frenar = - Menos;
    }
    
    public void setAcelerar(int Valor){
       Acelerar = +Valor;
    }
}
