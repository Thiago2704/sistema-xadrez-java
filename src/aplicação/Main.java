package aplicação;

import xadrez.PartidaDeXadrez;

public class Main{
    public static void main(String[] args) {
        
        PartidaDeXadrez partida = new PartidaDeXadrez();
        UI.imprimirTabuleiro(partida.getPeças());
    }
}