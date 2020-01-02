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
public class Card implements Comparable<Card>{
    private Suit suit;
    private Rank rank;
    boolean isFaceUp = false;

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public boolean isIsFaceUp() {
        return isFaceUp;
    }

    public void setIsFaceUp(boolean isFaceUp) {
        this.isFaceUp = isFaceUp;
    }
    
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit; //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getRankValue(){
        return rank.getRankValue();
    }
    
    public int getSuitValue(){
        return suit.getSuitValue();
    }

    @Override
    public int compareTo(Card card) {
        int compareValue = ((Card)card).getRankValue();
        return compareValue - this.getRankValue();
    }
}
