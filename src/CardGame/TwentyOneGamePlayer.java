package CardGame;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TwentyOneGamePlayer extends Player {
    Scanner in = new Scanner(System.in);

    ArrayList<Card> cards = new ArrayList<>();
    int points = 0;
    
    public TwentyOneGamePlayer(String name) {
        super(name);
    }
    
    public void receive(Card card) throws NumberFormatException {

        cards.add((NormalCard) card);
        
        //IF statement to check and confirm ACE values from user
        if (card.toString().contains(String.valueOf(NormalCard.Representation.ACE))) {
            boolean isAcePoint = false;
            
            String input = JOptionPane.showInputDialog("You got an ACE! Shall it represent 1 or 11 points?");
            
            while(isAcePoint == false){
                try{
                    int acePoint = Integer.parseInt(input);
                    if (acePoint == 1 || acePoint == 11){ 
                        this.points += acePoint; 
                        isAcePoint = true;
                    }else{
                        isAcePoint = false;
                        input = JOptionPane.showInputDialog("Incorrect Value! 1 or 11 points?");
                    }//end try
                }catch(NumberFormatException e){
                    isAcePoint = false;
                    input = JOptionPane.showInputDialog("Incorrect Value! 1 or 11 points?");
                }//end catch
            }//While loop ends
        }//end if statement
        else { this.points += card.getValue(); }
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public String toString(int index){
        return cards.get(index).toString();
    }
    

}