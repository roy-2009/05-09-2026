
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.velha;

/**
 *
 * @author roy63042026
 */
public class Tabuleiro {
    
    private int nota2;
    private int nota1;
    private String regra;
    private boolean teveumvencedor;
    private int jogadordavez;
    private char a1 = ' ',a2 = ' ',a3 = ' ',b1 = ' ',b2 = ' ',b3 = ' ',c1 = ' ',c2 = ' ',c3 = ' ';
    
    
    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public String getRegra() {
        return regra;
    }

    public void setRegra(String regra) {
        this.regra = regra;
    }

    public boolean isTeveumvencedor() {
        return teveumvencedor;
    }

    public void setTeveumvencedor(boolean teveumvencedor) {
        this.teveumvencedor = teveumvencedor;
    }

    public int getJogadordavez() {
        return this.jogadordavez;
    }

    public void setJogadordavez(int jogador) {
        this.jogadordavez = jogador;
    }

    public Tabuleiro(String regra) {
        this.regra = regra;
        this.nota1 = 0; 
        this.nota2 = 0;
        this.teveumvencedor = false;
        this.jogadordavez = 1;
        
    
    }
    
    public void organizar(){
    
    }
    
    public void verificarGanhador(char simbolo ,String nome){
    
        if (a1 == simbolo && a2 == simbolo && a3 == simbolo){
        this.teveumvencedor = true;
        }
        else if (b1 == simbolo && b2 == simbolo && b3 == simbolo){
        this.teveumvencedor = true;
        }
        else if (c1 == simbolo && c2 == simbolo && c3 == simbolo){
        this.teveumvencedor = true;
        }
        else if (b1 == simbolo && a1 == simbolo && c1 == simbolo){
        this.teveumvencedor = true;
        }
        else if (a2 == simbolo && b2 == simbolo && c2 == simbolo){
        this.teveumvencedor = true;
        }
        else if (a3 == simbolo && b3 == simbolo && c3 == simbolo){
        this.teveumvencedor = true;
        }
        else if (a1 == simbolo && b2 == simbolo && c3 == simbolo){
        this.teveumvencedor = true;
        }
        else if (a3 == simbolo && b2 == simbolo && c1 == simbolo){
        this.teveumvencedor = true;
        }

        if(this.isTeveumvencedor()){
        System.out.println("GANHADOR" + nome);
        }
   
        
    }

    public void mostrarTabuleiro(){
    System.out.printf("""
                         1    2   3
                           |      |   
                    a    %c | %c    |%c             
                     ------|------|------
                    b   %c  |  %c   |%c         
                     ------|------|------
                    c    %c |  %c   |%c          
                           |      |
                       """,a1,a2,a3,b1,b2,b3,c1,c2,c3);

    } 
    
    
   public void marcar(char simbolo, String coordenada){
       switch(coordenada){
           case "a1" :
                   this.a1 = simbolo;
              break;
            
           case "a2" :
                   this.a2 = simbolo;
              break;
           
           case "a3" :
                   this.a3 = simbolo;
              break;
           
           case "b1" :
                   this.b1 = simbolo;
              break;
           
           case "b2" :
                   this.b2 = simbolo;
              break;
           
           case "b3" :
                   this.b3 = simbolo;
              break;
       
            case "c1" :
                   this.c1 = simbolo;
              break;           
            
            case "c2" :
                   this.c2 = simbolo;
               break;
       
             case "c3" :
                   this.c3 = simbolo;
               break;      
              
              
              
              
              
              
              
              
              
              
       
       
       }
   } 


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
