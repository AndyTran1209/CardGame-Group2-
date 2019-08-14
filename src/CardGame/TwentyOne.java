package CardGame;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class TwentyOne extends Game {
    
    Scanner in = new Scanner(System.in);
    TwentyOneGamePlayer player;
    TwentyOneGamePlayer computer;
    boolean end = false;
    boolean t = false;
    
    public TwentyOne(String givenName) {
        super(givenName);
    }
    
    public void play() {
        boolean play = true;
        while(play){
            System.out.println("\n");
            System.out.println("\tWelcome to BlackJack!");

            //Prompting user player for name and validating for real name
            String user = JOptionPane.showInputDialog("Please enter your name :D");
            while (user == null){
                user = JOptionPane.showInputDialog("Please enter a valid name");
            }

            //Creating two players
            player = new TwentyOneGamePlayer(user);
            computer = new TwentyOneGamePlayer("Computer");

            //Welcome message
            System.out.println("\tWelcome " + player.getPlayerID() + "!");

            //Creating deck, shuffling, and dealing
            System.out.println("\n\tDealing two cards to each player...");
            Deck deck = new Deck(52);
            for(int i = 1; i <= 2; i++){
                player.receiveP(deck.dealCard());
                computer.receiveC(deck.dealCard());
            }

            //Display players cards
            hand(player);
            isWinner(); // method to see if there were any winners during first deal

            //Hit or sit while loop to determine whole game
            while(end == false){
                System.out.println("\n\tHit or Sit (h/s)?\n\tCurrent Points: " + player.getPoints());
                String hitSit = in.nextLine();
                t = false;
                while(t == false){
                        if (hitSit.equals("h")){
                            player.receiveP(deck.dealCard());
                            computer.receiveC(deck.dealCard());
                            hand(player);
                            t = true;
                        }else if(hitSit.equals("s")){
                            hand(player);
                            if (intRand() > 7){
                                computer.receiveC(deck.dealCard());
                            }
                            t = true;
                        }
                        else{
                            System.out.println("Something went wrong. Enter h for hit or s for sit" +
                                    "\n\tCurrent Points: " + player.getPoints());
                            hitSit = in.nextLine();
                            t = false;
                        }
                }//end inner while loop
                isWinner();
            }//while loop end 
            
            String playAgain = JOptionPane.showInputDialog("Want to play again? (y/n)");
            if(playAgain.equals("y")){
                play = true;
                end = false;
            }else if(playAgain.equals("n")){
                play = false;
            }
        }//end play loop
        System.out.println("\tThank you for playing!");
    }//end play method
    
    public void declareWinner(TwentyOneGamePlayer p) {
        
        System.out.println("\n\tPlayer Points: " + player.getPoints() + 
                "\n\tComputer Points: " + computer.getPoints());
        System.out.println("\t" + p.getPlayerID() + " Won!");
    }
    
    public void isWinner(){
        if (player.isBusted()){
            declareWinner(computer);
            end = true;
        }else if(computer.isBusted()){
            declareWinner(player);
            end = true;
        }
    }
   
    
    public void hand(TwentyOneGamePlayer p){
        System.out.println("\n\tCards:");
        p.getCards();
        System.out.println("\tPoints: " + p.getPoints());
    }
    
    public int intRand(){
        int range = (10 - 1) + 1;
        return (int)(Math.random() * range) + 1;
    }

}