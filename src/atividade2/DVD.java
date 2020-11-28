
package atividade2;

public class DVD extends Midia{
    private int nFaixas;
    public DVD(){
        
    }
    public DVD(int codigo, double preco, String nome, int faixa){
        this.setCodigo(codigo);
        this.setPreco(preco);
        this.setNome(nome);
        this.setnFaixas(faixa);
        
    }
    @Override
    public String getTipo(){
        return "DVD";
    } 
    @Override
    public String getDetalhes(){
        return "";
    }
    @Override
        public void printDados(){
        System.out.println(this.getCodigo());
        System.out.println(this.getPreco());
        System.out.println(this.getNome());
        System.out.println(this.getnFaixas());
    }
    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
}
