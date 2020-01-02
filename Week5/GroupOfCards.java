package CardGame;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trevor
 */
public abstract class GroupOfCards {
    ArrayList<Card> cards;
   
    public GroupOfCards(){
        cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public Card remove(){
        return cards.remove(0);
    }
    
    @Override
    public String toString(){
        String deck = "";
        for(Card c : cards){
            deck += c + "\n";
        }
        return deck;
    }
    
    public Card get(int i){
        return cards.get(i);
    }
    
    public int size(){
        return cards.size();
    }
    
    
}
