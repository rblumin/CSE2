//Roger Blumin
//CSE2
//HW11
//December 1, 2014
//This program determines the type of poker hand using arrays

import java.util.Scanner; //imports scanner class

public class PokerHands{ //class
    public static void main(String [] arg){ //main method

        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor        
        
        String run=""; //blank string
        
        System.out.println("Enter 'y' or 'Y' to enter a(nother) hand: ");
        run=myScanner.next(); ///gets input from uses
        
        while ((run.equals("y")) ||(run.equals("Y"))){ //program runs if user enters y or Y
        
            int[] deck; //declares int array for deck
            deck = new int[52]; //allocates array for 52 cards
            int hand[] = new int[5]; //allocates array for 5 cards in a hand
            int ranks[] = new int[13]; //allocates array for 13 possible ranks
            int frequencies[] = new int[5]; //allocates array for frequencies
    
            int flushSuit=-2; //varialbe to store suit of first card
            int suitCount=0; //variable to count number of cards who have same suit as first card including the first card
    
            int cardPosition = 0; //variable for position of card
            
            int suit=-2; //variable for the suit
            int rank=-2; //variable for the rank        
        
        
            for (int i=0; i<5; i++ ){ //for loop to get cards in hand
                int count=0; //counter
                do{ //do-while loop
                    if (count!=0){ //if the loop runs after the first time
                        System.out.println("You already entered that card"); //error message
                    } //end if
    
                    suit = getSuit(); //gets the suit of the card
                    rank = getRank(); //gets the rank of the card
                    
                    cardPosition = suit*13+rank; //uses the suit and the rank to find the position of the card in the array
                    count++; //increases counter by one
                } while(deck[cardPosition] == -1); //condition for while loop
                
                ranks[rank]++; //increaases the amount of times the current rank occurs by one
            
                hand[i] = cardPosition; //stores the card in the hand
                deck[cardPosition] = -1; //makes the valuie of the card in the deck negative one in order to later be able to see if the card is repeated
                
                flushSuit = hand[0]/13; //gets the value for the suit of the first card card in the hand
                if (hand[i]/13==flushSuit){ //checks if suit of current card is equal to suit of first card
                    suitCount++; //incrases value of suitCount by 1
                } //end if
            } //end for loop for getting hand
            
            int freqCount=0; //variable to count number of frequencies
            for (int x=0; x<5; x++ ){ //for loop to go through all the cards in the hand
                for (int y=0; y<13; y++ ){ //for loop for every rank
                    if (ranks[y]==x){ //if the rank if the card 
                        freqCount++; //increases freqCount by one
                    } //end if
                } //end inner for loop
                frequencies[x]=freqCount; //stores the number of frequencies of the rank in the frequencies array
                freqCount=0; //resets freqCount to zero
            } //end outer for loop
            
            getHandType(ranks, frequencies, suitCount); //calls method to get the type of hand
            showOneHand(hand); //calls method to print out the card in the hand   
        
            System.out.println("Enter 'y' or 'Y' to enter a(nother) hand: "); //output for user prompt
            run=myScanner.next(); //gets input from the user
        
        }//end while loop
        
    } //end main method
    
    
    public static int getSuit(){ //this method returns the suit of the entered card
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        int suit=-1; //varialbe for suit
        boolean control = true; //loop control variable 
     
        do{ //do while loop
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's': "); //output
            String x = myScanner.next(); //accepts input for card suit               
            if(x.equals("c")){ //if rank is clubs
                suit = 0; //suit value for clubs
                control = true; //makes control true
            } //end if
            else if(x.equals("d")){ //if rank is diamonds
                suit = 1; //suit value for diamonds
                control = true; //makes control true
            } //end else if
            else if(x.equals("h")){ //if rank is hearts
                suit = 2; //suit value for hearts
                control = true; //makes control true
            } //end else if
            else if(x.equals("s")){ //if rank is spades
                suit = 3; //suit value for spades
                control = true; //makes control true
            } //end else if
            else{ //if user enters an invalid suit
                System.out.println("You did not enter a valid response"); //error message
                control = false; //makes control false so loop runs again
            }//end else
        } while (!control); //end of do while loop
        
        return suit; //returns calue of suit entered
        
    } //end getSuit method 


    public static int getRank(){ //this method returns the rank of the entered card
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor    
        int rank=-1; //varialbe for rank
        boolean control = true; //loop control variable
                
        do{ //do while loop
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': "); //output
            String x = myScanner.next(); //accepts input for card rank        
            
            if(x.equals("a")){ //if rank is ace
                rank = 0; //rank value for ace
                control = true; //makes control true
            } //end if
            else if(x.equals("k")){ //if rank is king
                rank = 1; //rank value for king
                control = true; //makes control true
            } //end else if
            else if(x.equals("q")){ //if rank is queen
                rank = 2; //rank value for queen
                control = true; //makes control true
            } //end else if
            else if(x.equals("j")){ //if rank is jack
                rank = 3; //rank value for jack
                control = true; //makes control true
            } //end else if
            else if(x.equals("10")){ //if rank is ten
                rank = 4; //rank value for ten
                control = true; //make control true
            }//end else if
            else if(x.equals("9")){ //if rank is nine
                rank = 5; //rank value for nin
                control = true; //makes control true
            } //end else if
            else if(x.equals("8")){ //if rank is eight
                rank = 6; //rank value for eight
                control = true; //makes control true
            } //end else if
            else if(x.equals("7")){ //if rank is seven
                rank = 7; //rank value for seven
                control = true; //makes control true
            }//end else if
            else if(x.equals("6")){ //if rank is six
                rank = 8; //rank value for 6
                control = true; //makes control true
            } //end else if
            else if(x.equals("5")){ //if rank is five
                rank = 9; //rank value for fice
                control = true; //makes control true
            } //end eles if           
            else if(x.equals("4")){ //if rank is four
                rank = 10; //rank value for four
                control = true; //makes control true
            } //end else if           
            else if(x.equals("3")){ //if rank is three
                rank = 11; //rank value for three
                control = true; //makes control true
            } //end else if
            else if(x.equals("2")){ //if rank is two
                rank = 12; //rank value for two
                control = true; //makes control true
            }  //end else if          
            else{ //if invalid card is entered
                System.out.println("You did not enter a valid response"); //error message
                control = false; //makes control false so that loop runs again
            } //end else
        } while (!control); //end do while
        
        return rank; //returns the rank of the card
        
    } //end getRank method     


    public static void getHandType(int rank[], int[] freq, int suitCount){ //method to get the type of hand entered
        
        int firstOne = 0; //varialbe for the first one in the rank array
        int sum=0; //variable for sum
        
        for (int i=0; i<13; i++){ //for loop to search through rank array
            if (rank[i] == 1){ //if the value of the rank array is one
                firstOne=i; //assign position of first one to the firstOne variable
                break; //break
            } //end if
        } //end for loop
        
        for (int j=0; j<5; j++){ //for loop to add five consecutive values in rank array starting from the first one
            sum+= rank[firstOne+j]; //adds value to sum
        } //end for loop


        if((suitCount == 5) && (rank[0]==1)){ //checks to see if royal flush
            System.out.println("This is a Royal Flush"); //output
        } //end if

        else if((freq[1] == 5) && (sum==5) && (suitCount==5)){ //checks if straight flush
            System.out.println("This is a Straight Flush"); //output
        } //end else if

        else if((freq[1] == 5) && (sum==5)){ //checks if straight
            System.out.println("This is a Straight"); //output
        } //end else if

        else if(suitCount == 5){ //checks if flush
            System.out.println("This is a Flush"); //output
        } //end else if

        else if(freq[4] ==1){ //checks if four of a kind
            System.out.println("This is a Four of a Kind"); //output
        } //end else if
        
        else if((freq[3] ==1)&&(freq[2]==0)){ //checks if three of a kind
            System.out.println("This is a Three of a Kind"); //output
        } //end else if
        
        else if((freq[3] ==1)&&(freq[2]==1)){ //checks if full house
            System.out.println("This is a Full House"); //output
        } //end else if       
        
         else if((freq[2] ==2)){ //checks if two pair
            System.out.println("This is a Two Pair"); //output
        } //end else if
        
        else{ //else for High card
            System.out.println("This is a High Card"); //output
        } //end else
        
        
    } //end getHandType method
    

    
    
    
 public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }    
    
    
    
} //end class