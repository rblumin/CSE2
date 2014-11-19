//Roger Blumin
//CSE2
//HW10
//November 14, 2014
//This program determines the chances of duplicate hands in poker

import java.util.ArrayList;//imports arrayList class
import java.util.Random; //imports random class
import java.util.Scanner; //imports scanner class
public class PokerOdds{ //class
    public static void main(String [] arg){ //main method
        showHands(); //calls showHands method
        simulateOdds(); //calls simluateOdds method
    }//end main method
    
    
    public static void showHands(){ //showHands method
    
        Scanner scan=new Scanner(System.in); //creates scanner object
        String z="";
        do{ //do while loop
            int[] deck; //declares int array for deck
            deck = new int[52]; //allocates array for 52 cards
            int hand[] = {-1,-1,-1,-1,-1}; //declares int array of 5 for the hand
     
            String clubs = "Clubs:  ";  //output for clubs
            String diamonds = "Diamonds:  "; //output for diamonds
            String hearts = "Hearts:  "; //output for hearts
            String spades = "Spades:  "; //output for spades
            
     
            for (int i=0; i<=51; i++){ //for loop to assign values to deck array
                deck[i]=i; //assigns ith value to the ith position of the array
            } //end for loop   
            
            for (int i=0; i<=4; i++){ //for loop to generate a random hand
                
                int r = (int) (Math.random() *(52 - i)); //generates a random number between 1 and 52-i inclusive
                int n=deck[r]; //stores the value of random number's position in the deck array in n
                hand[i] = n; //assigns random card to hand
                deck[n] = deck[51-i]; //assigns last card in deck to slot of the card
                deck[51-i] = -1;  //sets last card in deck equal to -1
    
            
                if(n/13==0){ //clubs
                    if(n%13==0){//Ace
                        clubs += "A  ";
                    }//end if
                    else if(n%13==1){//King
                        clubs += "K  ";
                    }//end if            
                    else if(n%13==2){//Queen
                        clubs += "Q  ";
                    }//end if                    
                    else if(n%13==3){//Jack
                        clubs += "J  ";
                    }//end if
                    else{ //numbers
                        clubs += (14-n%13)+ "  ";
                    }//end else
                }//end if
                
                else if(n/13==1){ //diamonds
                    if(n%13==0){//Ace
                        diamonds += "A  ";
                    }//end if
                    else if(n%13==1){//King
                        diamonds += "K  ";
                    }//end if            
                    else if(n%13==2){//Queen
                        diamonds += "Q  ";
                    }//end if                    
                    else if(n%13==3){//Jack
                        diamonds += "J  ";
                    }//end if            
                    else{ //numbers
                        diamonds += (14-n%13)+ "  ";
                    }//end else      
                } //end else if
                
                else if(n/13==2){ //hearts
                    if(n%13==0){//Ace
                        hearts += "A  ";
                    }//end if
                    else if(n%13==1){//King
                        hearts += "K  ";
                    }//end if            
                    else if(n%13==2){//Queen
                        hearts += "Q  ";
                    }//end if                    
                    else if(n%13==3){//Jack
                        hearts += "J  ";
                    }//end if            
                    else{ //numbers
                        hearts += (14-n%13)+ "  ";
                    }//end else             
                } //end else if       
                
                else{ //spades
                    if(n%13==0){//Ace
                        spades += "A  ";
                    }//end if
                    else if(n%13==1){//King
                        spades += "K  ";
                    }//end if            
                    else if(n%13==2){//Queen
                        spades += "Q  ";
                    }//end if                    
                    else if(n%13==3){//Jack
                        spades += "J  ";
                    }//end if            
                    else{ //numbers
                        spades += (14-n%13) + "  ";
                    }//end else            
                } //end else       
                  
            } //end for loop
            
            System.out.println(clubs); //prints clubs
            System.out.println(diamonds); //prints diamonds
            System.out.println(hearts); //prints hearts
            System.out.println(spades); //prints spades
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //prints prompt for user
          
           z =scan.next(); //gets user's input
        }while(z.equals("Y") || z.equals("y")); //while loops that checks if the users answer is "y" or "Y"
    } //end showHands method
    
    
    public static void simulateOdds(){ //simluateOdds method
        String type[] = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"}; //declares string array
        int[] typenum; //declares int array
        typenum = new int[13]; //allocates array for 13     
        
        int count=0; //used to count nonduplicates
        int card=-1; //used for value of card
        for(int x=1; x<=10000; x++){ //for loop to generate 1000 random hands
            int[] deck; //declares int array for deck
            deck = new int[52]; //allocates array for 52 cards
            int hand[] = {-1,-1,-1,-1,-1}; //declares int array of 5 for the hand
     
            String clubs = "Clubs:  "; //output for clubs
            String diamonds = "Diamonds:  "; //output for diamonds
            String hearts = "Hearts:  "; //output for hearts
            String spades = "Spades:  "; //output for spades
    
            for (int i=0; i<=51; i++){ //for loop to generate deck array
                deck[i]=i; //assigns ith value in deck array to i
            } //end for loop    
            
            for (int i=0; i<=4; i++){ //for loop to generate random hand
                
            int r = (int) (Math.random() *(52 - i)); //generates a random number between 1 and 52-i inclusive
            int n=deck[r]; //assings n to the rth value of deck
            
                hand[i] = n%13; //assigns random card to hand
                deck[n] = deck[51-i]; //assigns last card in deck to slot of the card
                deck[51-i] = -1;  //sets last card in deck equal to -1
            } //end for loop to generate random hand   
            int answer= exactlyOneDup(hand); //sees if there is exactly one duplicate and returns the position of the duplicate card
            if (answer==-1){ //runs only if there was not a duplicate
                count++; //increases counter
            } //end if 
            else{ //else if there is a duplicate
                card = hand[answer]; //assign value of duplicate to card
                typenum[card%13]++; //increase the rank counter of the duplicate card
            }//end else
        
        } //end of foor loop that generate 1000 random hands
        
        for (int j=0; j<=12; j++ ){ //for loop used for output of rank and amounts of duplicates of each rank
            System.out.println(type[j] + "  " + typenum[j]); //prints the rank and the amount of duplicates of each rank
        } //end for loop
        
        System.out.println("----------------------------"); //output
        System.out.println("total not exactly one pair: " + count); //outputs how many times there was not exactly one pair

        
    }//end simulateOdds method
    
    
    
    
    public static int exactlyOneDup(int num[]){ //exactlyOneDup method that accepts an array of integers
        int num2[]=new int[num.length]; //declares an integer array
        
        for (int i=0; i<num.length; i++){ //for loop to copy contents of num into num2
        	num2[i] = num[i]; //copies contents of num into num2
        } //end for loop
        
        
        int count1 = 0; //counter used to count if duplicates are present
        int count2 = 0; //counter used to count if duplicates are present        
        int answer = -1; //boolean to be used for output
        for (int i=0; i<= num2.length-1; i++){ //for loop check to check through each element of the array
                for (int j=0; j<= num2.length-1; j++){ //for loop to check to see if there is a duplicate for each element of the array
                    if (i!=j){ //runs only is i is not equal to k
                        if(num2[i]==num2[j]){ //if statement if there is a duplicate
                            count1++; //increases counter variable
                            num2[j]=-1; //changes value of position j of array to -1
                        } //end inner if
                    } ////end outer if
                }//end inner for loop
                
                if (count1==0){ //if statment if no duplicates of first value
                    continue; //continues through the loop
                } //end if
                
                else if(count1==1){ //else if there is exactly one duplicate value
                    count1=0; //reset count1
                    count2++; //increment count2
                    answer=i; //makes answer equal to the position of the duplicate number
                }
                else{ //else will be the case for multiple duplicates
                    break; //breaks loop
                }//end else
                    
        }//end outer for loop
        
        if (count2!=1){ //if there is not exactly one duplicate
            answer = -1; //make value to be returned -1 if no duplicates
        } //end if
        return answer; //returns an int with position of the duplicate
    
    } //end of exactlyOneDup method    
    
}//end class