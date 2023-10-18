/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.meupacote3;

/**
 *
 * @author joaok
 */
public class Cavalo {

    private int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public int passeioDoCavalo(Tabuleiro tabuleiro, int linha, int coluna) {
        int contadorMovimentos = 1;
        tabuleiro.getTabuleiro()[linha][coluna] = contadorMovimentos;

        for (int i = 1; i < 64; i++) {
            int linhaAtual = linha;
            int colunaAtual = coluna;
            int minMovimentos = 8;
            for (int j = 0; j < 8; j++) {
                int linhaTeste = linhaAtual + vertical[j];
                int colunaTeste = colunaAtual + horizontal[j];
                if (linhaTeste >= 0 && linhaTeste < tabuleiro.getTamanho() && colunaTeste >= 0
                        && colunaTeste < tabuleiro.getTamanho() && tabuleiro.getTabuleiro()[linhaTeste][colunaTeste] == 0) {
                    int numMovimentos = 0;
                    for (int k = 0; k < 8; k++) {
                        int proximaLinha = linhaTeste + vertical[k];
                        int proximaColuna = colunaTeste + horizontal[k];
                        if (proximaLinha >= 0 && proximaLinha < tabuleiro.getTamanho() && proximaColuna >= 0
                                && proximaColuna < tabuleiro.getTamanho() && tabuleiro.getTabuleiro()[proximaLinha][proximaColuna] == 0) {
                            numMovimentos++;
                        }
                    }
                    if (numMovimentos < minMovimentos) {
                        minMovimentos = numMovimentos;
                        linha = linhaTeste;
                        coluna = colunaTeste;
                    }
                }
            }
            contadorMovimentos++;
            tabuleiro.getTabuleiro()[linha][coluna] = contadorMovimentos;
        }
        return contadorMovimentos;
    }
}
