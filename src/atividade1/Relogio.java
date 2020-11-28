package atividade1;

public class Relogio {
    private int hora;
    
    public Relogio(){
        this.hora = 22;
    }
    public void adicionarHora(){
        if(this.hora + 1 > 23){
            this.hora = 0;
        } else {
            this.hora = this.hora + 1;
        }
        mostrarHora();
    }
    public void subtratirHora(){
        if(this.hora - 1 < 0){
            this.hora = 23;
        } else {
            this.hora = this.hora - 1;
        }
        mostrarHora();
    }
    public void mostrarHora(){
        System.out.println("Hora: " + this.hora);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
