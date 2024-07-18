package org.example;


import org.example.cardhanddeckdealerplayerimpl.Dealer;
import org.example.cardhanddeckdealerplayerimpl.Deck;
import org.example.cardhanddeckdealerplayerimpl.Hand;
import org.example.cardhanddeckdealerplayerimpl.Player;
import org.example.enumerationimpl.Rank;
import org.example.enumerationimpl.Suit;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {

    Dealer dealer;
    Player player;
    Deck deck;
    double betAmount;


    public BlackJack(Player player, double betAmount){
        this.dealer = new Dealer();
        this.deck = new Deck();
        this.player = player;
        this.player.hand = new Hand();
        this.betAmount = betAmount;
    }

    public void printHandsAndScore(){
        System.out.println("Dealer Cards : "+dealer.printHand());
        System.out.println("Your Cards : "+player.hand);
        System.out.println("Your Score : "+player.hand.getValue());
    }


    public int dealerPlay(int dealerScore,int playerScore){

        System.out.println("Dealer Hand : "+dealer.hand);
        System.out.println("Dealer Score : "+dealerScore);

        while(dealerScore < 17){
            dealer.hit(deck);
            dealerScore = dealer.hand.getValue();
            System.out.println("Dealer Hit");
            System.out.println("Dealer Hand: "+dealer.hand);
            System.out.println("Dealer Score : "+dealerScore);
        }


        if(dealerScore>21){
            System.out.println("Dealer Busted! You Win");
            player.updateAmount(betAmount);
            return 1;
        }
        else if(dealerScore>=playerScore){
            System.out.println("Dealer Wins");
            player.updateAmount(-1 * betAmount);
            return 0;
        }
        else{
            System.out.println("Yow Win");
            player.updateAmount(betAmount);
            return 1;
        }

    }



    public int start(){

        // Deck is shuffled at start
        deck.shuffle();

        // Dealer deals two cards to player and himself
        dealer.dealCards(deck,player);

        int playerScore = player.hand.getValue();
        int dealerScore = dealer.hand.getValue();

        Scanner sc = new Scanner(System.in);

        while (true){

            printHandsAndScore();

            if(playerScore == 21){
                System.out.println("BlackJack! You Win");
                player.updateAmount(betAmount);
                return 1;
            }
            else if(playerScore > 21){
                System.out.println("Busted! Dealer Wins");
                player.updateAmount(-1*betAmount);
                return 0;
            }
            else{

                System.out.println("Press 1 to Hit, 0 to Stand");
                int input = sc.nextInt();

                if(input == 0){
                    return dealerPlay(dealerScore,playerScore);
                }
                else if(input == 1){
                    player.hit(deck);
                    playerScore = player.hand.getValue();
                    System.out.println("You Hit");
                }
                else{
                    System.out.println("Invalid Choice! Press 1 to Hit, 0 to Stand");
                }

            }

        }


    }



    public static void main(String[] args) {


        /*

        Ace ==> has a face value of 1 or 11.
        if total sum exceeds the 21. we should consider it's value as 1.
        otherwise 11.

        Jack/King/Queen ==> 10 (face value)

        Jack/king/Queen + Ace ==> 10+11=21 (BlackJack)

         */

        /*

        Case :
        Let's say if player scored 20 with three cards(Jack+8+2)
        next he opted to STAND rather than HIT

        next, dealer show will begin. The dealer will expose his concealed cards. if the dealer score is less than 17
        the dealer will draw more cards from the deck till the score is less than 17.

        if the score exceeds 17, the dealer score is compared with player score. the one with higher score wins the game.

        if anyone score exceeds 21. he will be busted and opposition wins.

        if dealer wins dealer will collect the bet. if player wins dealer will pay off the bet.

         */


        System.out.println("Welcome to BlackJackCardGame.....");


        Scanner sc = new Scanner(System.in);

        String userInput;
        Player pavan = new Player("Pavan",10000);

        do{
            System.out.println("Enter bet amount: ");
            double betAmount = sc.nextDouble();
            BlackJack game = new BlackJack(pavan,betAmount);
            game.start();
            System.out.println("Your Total amount is : "+pavan.getAmount());
            System.out.println("Would you like to DEAL ? Press Y or N");
            userInput = sc.next();
        }
        while (userInput.equals("Y"));


    }

}