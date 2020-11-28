package atividade2;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia(){
        
    }
    
    public Midia(int codigo, double preco, String nome){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
    public void printDados(){
        System.out.println(this.codigo);
        System.out.println(this.preco);
        System.out.println(this.nome);
    }
    
    public String getTipo(){
        return "Midia";
    } 
    public String getDetalhes(){
        return "";
    }
    
    public void inserirDados(){
        
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
