package CardGame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trevor
 */
public enum Suit {
    SPADES (0),
    HEARTS (13),
    DIAMONDS (26),
    CLUBS (39);
    
    private final int suitValue;
    
    public int getSuitValue(){
        return suitValue;
    }
    
    Suit(int suitValue){
        this.suitValue = suitValue;
    }
}
