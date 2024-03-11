package Aplicação;

import Xadrez.PartidaDeXadrez;

public class Main{
    public static void main(String[] args) {
        
        PartidaDeXadrez partida = new PartidaDeXadrez();
        UI.imprimirTabuleiro(partida.getPeças());
    }
}