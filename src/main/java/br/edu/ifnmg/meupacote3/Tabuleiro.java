/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.meupacote3;

/**
 *
 * @author joaok
 */
public class Tabuleiro {

    private int tamanho;
    private int[][] tabuleiro;

    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        this.tabuleiro = new int[tamanho][tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }
    
    public void exibirTabuleiro() {
        for (int[] linha : this.tabuleiro) {
            for (int celula : linha) {
                System.out.print(celula + " ");
            }
            System.out.println();
        }
    }
}
