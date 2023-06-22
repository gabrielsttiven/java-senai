/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Aluno
 */
public class TiroAoAlvoOnline implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Hora de Iniciar a partida!");
        System.out.println("Está preparado para acertar muito?");
        System.out.println("Inicie a partida. Boa Sorte!!!!!");
    }

    @Override
    public void fechar() {
         System.out.println("Tem certeza que deseja sair?");
         System.out.println("Fechando o jogo...");
    }
    
}
