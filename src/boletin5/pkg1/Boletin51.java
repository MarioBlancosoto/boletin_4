
package boletin5.pkg1;


public class Boletin51 {

    
    public static void main(String[] args) {
        Coche Coche2 = new Coche ();
        Coche2.setVelocidade(100);
        Coche2.setAcelerar(70);
        Coche2.setFrenar(25);
        int Velocidade = Coche2.getVelocidade();
        int frenar = Coche2.getFrenar();
        int Acelerar = Coche2.getAcelerar();
        System.out.println(" a velocidade e de "+Velocidade+" acelera " +Acelerar + " Kmh"+ " e Frea " + frenar + " kmh");
        
    
}
}