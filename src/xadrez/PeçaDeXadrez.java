package xadrez;

import jogoDeTabuleiro.Peça;
import jogoDeTabuleiro.Tabuleiro;

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
