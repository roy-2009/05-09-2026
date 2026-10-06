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

Scanner entrada = new Scanner (System.in);
        
        
 Tabuleiro tabuleiro = new Tabuleiro("cada jogador deve escolher um simbolo, "
                        + "jogadores devem jogar auternadamente");
    
Jogador jogador1 = new Jogador(1,"roy",'0');
Jogador jogador2 = new Jogador(2,"yor",'x');


       do{ 
       
          tabuleiro.mostrarTabuleiro();
           
           
           
        if(tabuleiro.getJogadordavez() == 1){
        System.out.println("vez do jogar 1");
         String local = entrada.nextLine();                           
         
        tabuleiro.marcar(jogador1.getSimbolo(),local);
        
        tabuleiro.mostrarTabuleiro();
         
        tabuleiro.setJogadordavez(2);
        tabuleiro.verificarGanhador(jogador1.getSimbolo(),jogador1.getNome());
        }

        else {
        System.out.println("jogador 2");
        String local = entrada.nextLine();
        tabuleiro.marcar(jogador2.getSimbolo(),local);
        tabuleiro.setJogadordavez(1);
        tabuleiro.verificarGanhador(jogador2.getSimbolo(),jogador2.getNome());
        }  

       
       }while(tabuleiro.isTeveumvencedor() == false);
        

        
        entrada.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
}
