package atividade1;

public class Time {
    private int pontosGanhos;
    
    public Time(){
        this.pontosGanhos = 0;
    }
    public void ganharPartida(){
        this.pontosGanhos = this.pontosGanhos + 3;
        mostrarPontos();
    }
    public void empatarPartida(){
        this.pontosGanhos = this.pontosGanhos + 1;
        mostrarPontos();
    }
    public void perderPartida(){
        this.pontosGanhos = this.pontosGanhos + 0;
        mostrarPontos();
    }
    public void mostrarPontos(){
        System.out.println("Pontos: " + this.pontosGanhos);
    }
    
    public int getPontosGanhos() {
        return pontosGanhos;
    }

    public void setPontosGanhos(int pontosGanhos) {
        this.pontosGanhos = pontosGanhos;
    }
}
