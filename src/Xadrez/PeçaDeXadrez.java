package Xadrez;

import JogoDeTabuleiro.Peça;
import JogoDeTabuleiro.Tabuleiro;

public class PeçaDeXadrez extends Peça{
    
    private Cor cor;
    private int numeroDeMovimentos;

    public PeçaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }
    
    public Cor getCor() {
        return cor;
    }
    

    
}
