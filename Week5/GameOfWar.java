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
public class GameOfWar implements Game {

    Deck deck = new Deck();
    Hand playerOneHand = new Hand();
    Hand playerTwoHand = new Hand();
    Hand p1Winnings = new Hand();
    Hand p2Winnings = new Hand();
    Hand comparePile = new Hand();
    Card p1Card;
    Card p2Card;
    int roundsPlayed = 10000;
    boolean won = false;

    @Override
    public void initialize() {
        deck.Shuffle();
        deck.splitDeck(playerOneHand, playerTwoHand);
    }

    @Override
    public void play() {
        try{
        while (roundsPlayed > 0 && won == false) {
            if(won == true){
                        break;
                    }
            roundsPlayed--;
            System.out.println("Round " + roundsPlayed);
            checkSize();
            displayWinner();
            p1Card = playerOneHand.remove();
            System.out.println("Player 1 played a " + p1Card.toString());
            //displayWinner();
            p2Card = playerTwoHand.remove();
            System.out.println("Player 2 played a " + p2Card.toString());
            comparePile.add(p1Card);
            comparePile.add(p2Card);
            if (p1Card.compareTo(p2Card) > 0) {
                p2Winnings.addAll(comparePile);
                System.out.println("Player 2 won this round");
                comparePile.erasePile(comparePile);
                //displayWinner();
            } else if (p1Card.compareTo(p2Card) < 0) {
                p1Winnings.addAll(comparePile);
                System.out.println("Player 1 won this round");
                comparePile.erasePile(comparePile);
                //displayWinner();
            } else {
                System.out.println("\nWar!");
                if (playerOneHand.size() > 3 && playerTwoHand.size() > 3) {
                    for (int i = 0; i < 3; i++) {
                        p1Card = playerOneHand.remove();
                        p2Card = playerTwoHand.remove();
                        comparePile.add(p1Card);
                        comparePile.add(p2Card);
                        checkSize();
                    }
                    checkSize();
                    
                    play();
                    //displayWinner();
                }// end of if
            }// end of else
        }// end of while
        }//end of try
        catch(IndexOutOfBoundsException e){
           // System.out.println(e);
        }
    }// end of play

    @Override
    public void displayWinner() {
        if(playerOneHand.size() == 0 && p1Winnings.size() == 0){
            System.out.println("\n\nPlayer Two won the Game of War!");
            won = true;
        }
        else if(playerTwoHand.size() == 0 && p2Winnings.size() == 0){
            System.out.println("\n\nPlayer One won the Game of War!");
            won = true;
        }
        else if(roundsPlayed == 0){
            if(playerOneHand.size() > playerTwoHand.size()){
                System.out.println("\n\nRound limit reached.");
                System.out.println("\nPlayer One won the Game of War!");
                won = true;
            }
            else{
                System.out.println("\n\nRound limit reached.");
                System.out.println("\nPlayer Two won the Game of War!");
                won = true;
            }
        }
    }

    public void checkSize() {
        if (playerOneHand.size() == 0 && p1Winnings.size() > 0) {
            System.out.println("\n\n\nadded cards to player 1 hand");
            playerOneHand.addAll(p1Winnings);
            p1Winnings.erasePile(p1Winnings);
        }
        if (playerTwoHand.size() == 0 && p2Winnings.size() > 0) {
            System.out.println("\n\n\nadded cards to player 2 hand");
            playerTwoHand.addAll(p2Winnings);
            p2Winnings.erasePile(p2Winnings);
        }
    }

}
