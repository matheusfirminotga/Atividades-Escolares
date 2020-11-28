package atividade1;

public class Carro {
    private double velocidade;
    
    public Carro(){
        this.velocidade = 0.0;
    }
    public void acelerar(){
        this.velocidade = this.velocidade + 10.0;
        mostrarVelocidade();
    }
    public void freiar(){
        this.velocidade = this.velocidade - 10.0;
        mostrarVelocidade();
    }
    
    public void mostrarVelocidade(){
        System.out.println("Velocidade: " + this.velocidade);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
