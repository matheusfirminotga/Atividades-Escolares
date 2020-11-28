package atividade1;

public class Telefone {
    private double preco;
    private int minuto;
    
    public Telefone(){
        this.minuto = 0;
        this.preco = 2.0;
    }
    public void duracaoLigacao(int tempo){
        this.minuto = tempo;
    }
    public void alterarPreco(double valor){
        this.preco = valor;
    }
    public void mostrarConta(){
        System.out.println("Valor:" + (this.minuto * this.preco));
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
