package atividade1;

public class Lampada {
  private int estado;

    public Lampada(){
        this.estado = 0;
    }
    
    public void ligar(){
        this.estado = 1;
        mostrarEstado();
    }
   
    public void desligar(){
        this.estado = 0;
        mostrarEstado();
    }
    
    public void mostrarEstado(){
        if(this.estado == 0){
            System.out.println("Desligado");
        } else {
            System.out.println("Ligado");
        }
    }
    
    public int getLampada() {
        return estado;
    }

    public void setLampada(int lampada) {
        this.estado = lampada;
    }
  
}
