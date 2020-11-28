package atividade2;

public class CD extends Midia {

    private int nMusicas;

    public CD() {

    }

    public CD(int codigo, double preco, String nome, int nMusicas) {
        this.setCodigo(codigo);
        this.setPreco(preco);
        this.setNome(nome);
        this.setnMusicas(nMusicas);
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return "";
    }

    @Override
    public void printDados() {
        System.out.println(this.getCodigo());
        System.out.println(this.getPreco());
        System.out.println(this.getNome());
        System.out.println(this.getnMusicas());
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
}
