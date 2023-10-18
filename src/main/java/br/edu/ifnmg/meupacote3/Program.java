/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.meupacote3;

/**
 *
 * @author joaok
 */
public class Program {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(8);
        Cavalo cavalo = new Cavalo();
        int movimentos = cavalo.passeioDoCavalo(tabuleiro, 0, 0);
        System.out.println("O cavalo fez " + movimentos + " movimentos.");
        tabuleiro.exibirTabuleiro();
    }
}
