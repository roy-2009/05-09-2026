/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.velha;

import java.util.Scanner;



/**
 *
 * @author roy63042026
 */
public class Velha {

   public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    Tabuleiro tabuleiro = new Tabuleiro(
        "Cada jogador deve escolher um símbolo e jogar alternadamente"
    );

    Jogador jogador1 = new Jogador(1, "roy", 'O');
    Jogador jogador2 = new Jogador(2, "yor", 'X');

    String local;
    boolean jogadaValida;
    int jogadas = 0;

    do {
        tabuleiro.mostrarTabuleiro();

        // Jogador 1
        do {
            System.out.println("Vez do jogador " + jogador1.getNome());
            System.out.print("Escolha uma posição: ");

            local = entrada.nextLine().trim().toLowerCase();

            if (tabuleiro.estaVazio(local)) {
                tabuleiro.marcar(jogador1.getSimbolo(), local);
                jogadaValida = true;
                jogadas++;
            } else {
                System.out.println("Posição ocupada ou inválida!");
                jogadaValida = false;
            }

        } while (!jogadaValida);

        tabuleiro.mostrarTabuleiro();
        tabuleiro.verificarGanhador(
            jogador1.getSimbolo(), jogador1.getNome()
        );

        // Jogador 2 só joga se ninguém venceu
        if (!tabuleiro.isTeveumvencedor() && jogadas < 9) {

            do {
                System.out.println("Vez do jogador " + jogador2.getNome());
                System.out.print("Escolha uma posição: ");

                local = entrada.nextLine().trim().toLowerCase();

                if (tabuleiro.estaVazio(local)) {
                    tabuleiro.marcar(jogador2.getSimbolo(), local);
                    jogadaValida = true;
                    jogadas++;
                } else {
                    System.out.println("Posição ocupada ou inválida!");
                    jogadaValida = false;
                }

            } while (!jogadaValida);

            tabuleiro.mostrarTabuleiro();
            tabuleiro.verificarGanhador(
                jogador2.getSimbolo(), jogador2.getNome()
            );
        }

    } while (!tabuleiro.isTeveumvencedor() && jogadas < 9);

    if (!tabuleiro.isTeveumvencedor()) {
        System.out.println("Empate!");
    }

    System.out.println("Fim de jogo!");
    entrada.close();
}
}