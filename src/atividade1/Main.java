/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author Matheus
 */
public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.mostrarEstado();
        lampada.ligar();
        lampada.desligar();
        
        Carro carro = new Carro();
        carro.mostrarVelocidade();
        carro.acelerar();
        carro.acelerar();
        carro.freiar();
                
        Time time = new Time();
        time.ganharPartida();
        time.empatarPartida();
        time.perderPartida();
        
        Relogio relogio = new Relogio();
        relogio.mostrarHora();
        relogio.adicionarHora();
        relogio.adicionarHora();
        relogio.adicionarHora();
        
        Telefone telefone = new Telefone();
        telefone.duracaoLigacao(300);
        telefone.mostrarConta();
    }
}
