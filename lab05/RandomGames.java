//Roger Blumin
//September 20, 2014
//CSE 2
//lab05
//This program 


import java.util.Scanner; //import scanner class

public class RandomGames{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: "); //prompts user for input
        String game = myScanner.next(); //accepts input for game
        
        if(game.length()!=1){ //checks to see if string is of length 1
            System.out.println ("You did not enter an acceptable input"); //prints out error message
            return; //terminates the program;
        }
        
        if(!(game.equals("R")||game.equals("r")||game.equals("C")||game.equals("c")||game.equals("P")||game.equals("p"))){ //checks to see if user input is acceptable{
            System.out.println (game + " is not one of 'R', 'r', 'C', 'c', 'P', or 'p'"); //prints out error message
            return; //terminates the program;
        }
        
        int dice1, dice2 = 0; //creates variables for the dice
        char gameChar = game.charAt(0); //gets the character from the string for the switch statement
        int rNum = (int) (Math.random() *36 + 1); //generates a random number between 1 and 37 inclusive
        
        switch(gameChar){ //swtich statement to determine game based on input
            
            case 'R': case 'r': //case for Roulette
                
                switch(rNum){//case to determine roulette output
                    case 37://exception for 37, which is used to represent 00
                        System.out.println("Roulette: 00"); //prints output for 00 case
                        break; //terminate the switch statement
                    default: //all other cases except 00
                        System.out.println("Roulette: " + rNum); //prints out the randomly generated number as the output for roullete
                }//end of roulette switch
                
                break; //terminates the swtich statment
             
             case 'C': case 'c': //case for craps
                //dice1 = (int) (Math.random() *6 + 1);
                //dice2 = (int) (Math.random() *6 % 1);
                //System.out.print ln("Craps " + dice1 + "+" + dice2 "=" + (dice1+dice2); //prints out the result for craps
                //above three commmented lines would be used to implement craps
                System.out.println("Craps not implemented yet"); //output if user chooses craps
                break; //terminates the switch statement
                
            case 'P': case 'p':
                System.out.println("Picking a card not implemented yet");//output if user chooses to pick a card
                break;//terminates the switch statement

            
        }//end of game switch statement
        
        
    }  //end of main method   
} //end of class
        