package xadrez;

import jogoDeTabuleiro.Posição;
import jogoDeTabuleiro.Tabuleiro;
import xadrezPeças.Rei;
import xadrezPeças.Torre;

public class PartidaDeXadrez {
    
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8,8);
        configuraçãoInicial();
    }
    
    public PeçaDeXadrez[][] getPeças(){
        PeçaDeXadrez[][] matriz = new PeçaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        
        for(int i=0; i<tabuleiro.getLinhas(); i++){
            for(int j=0; j<tabuleiro.getColunas(); j++){
                matriz[i][j] = (PeçaDeXadrez) tabuleiro.peça(i, j);
            }
        }
        return matriz;
    }
    
    public void configuraçãoInicial(){

        tabuleiro.colocarPeça(new Torre(tabuleiro, Cor.BRANCO), new Posição(2, 1));
        tabuleiro.colocarPeça(new Rei(tabuleiro, Cor.PRETO), new Posição(0, 4));
        tabuleiro.colocarPeça(new Rei(tabuleiro, Cor.PRETO), new Posição(7, 4));
    }
}
