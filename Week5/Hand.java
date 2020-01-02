package CardGame;

import java.util.ArrayList;
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
public class Hand extends GroupOfCards{
    
    Hand(){
        super();
    }
    
    public Hand orderHand(Hand playerHand){
        Collections.sort(playerHand.cards);
        return playerHand;
    }
    
    
    public int compare(Card p1, Card p2){
        if (p1.getRankValue() > p2.getRankValue()){
            return -1;
        }
        else if (p1.getRankValue() < p2.getRankValue()){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public void addAll(Hand compare){
        for(int i = 0; i < compare.size(); i++){
            cards.add(compare.get(i));
        }
    }
    
    public void erasePile(Hand compare){
        compare.cards.clear();
    }
}
                  