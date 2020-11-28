package atividade2;

public class Main {

    public static void main(String[] args) {
        Midia midia = new DVD(1, 12, "CD", 1);
        System.out.println(midia.getTipo());
        midia.printDados();
        
        System.out.println("\n");

        DVD dvd = new DVD(1, 12, "DVD", 1);
        System.out.println(dvd.getTipo());
        midia.printDados();
        
        System.out.println("\n");

        CD cd = new CD(2, 20, "CD", 3);
        System.out.println(cd.getTipo());
        cd.printDados();
    }
}
