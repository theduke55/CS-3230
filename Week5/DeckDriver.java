/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 *
 * @author Trevor
 */
public class DeckDriver{
    public static void main(String[] args){
        /* Instantiate the game objects */
        GameOfWar gow = new GameOfWar();
        
        gow.initialize();
        gow.play();
        gow.displayWinner();
    }
}
