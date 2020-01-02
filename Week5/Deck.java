package CardGame;

import java.util.Random;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trevor
 */
public class Deck extends GroupOfCards{
    /* Create a full deck of 52 cards */
    public Deck() {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
                this.add(c);
            }
        }
    }
    
    /* Take the deck and split the cards to two Hand objects */
    public void splitDeck(Hand hand1, Hand hand2){
        for(int i = 0; i < 52; i++){
            if(i % 2 == 0){
                hand1.add(this.remove());
            }
            else{
                hand2.add(this.remove());
            }
        }
    }
    
    Random random = new Random();
    public void Shuffle(){
        Collections.shuffle(cards, random);
    }  
}
