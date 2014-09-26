//Roger Blumin
//September 25, 2014
//CSE 2
//hw05
//This program allows the use to choose if they want a burger soda and fries and then customize their choice

import java.util.Scanner; //import scanner class

public class BurgerKing{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        System.out.println("Enter a letter to indicate a choice of"); //prompts user for input
        System.out.println("Burger (B or b)"); //prompts user for input
        System.out.println("Soda (S or s)"); //prompts user for input
        System.out.print("Fries (F or f) "); //prompts user for input
        
        String order = myScanner.next(); //accepts input for the order
        String fixin, soda, fries;
        
        if(order.length()!=1){ //checks to see if string is of length 1
            System.out.println ("a single character expected"); //prints out error message
            return; //terminates the program;
        }
        
        if(!(order.equals("B")||order.equals("b")||order.equals("S")||order.equals("s")||order.equals("F")||order.equals("f"))){ //checks to see if user input is acceptable
            System.out.println (order + " is not one of 'B', 'b', 'S', 's', 'F', or 'f'"); //prints out error message
            return; //terminates the program;
        }
        
        char orderChar = order.charAt(0); //gets the character from the string for the switch statement
                
        switch(orderChar){ //swtich statement to determine order based on input
            
            case 'B': case 'b': //case for Burger
            
                System.out.println("Enter A or a for all the fixins"); //prompts user for input
                System.out.println("C or c for cheese"); //prompts user for input
                System.out.print("N or n for none of the above "); //prompts user for input
                
                fixin = myScanner.next(); //accepts input for the fixin
                
                if (fixin.equals("A") || fixin.equals("a")){ //checks to see if user wants all fixins
                    fixin = "all the fixins"; //assings appropriate value to fixin
                }                
                else if (fixin.equals("C") || fixin.equals("c")){ //checks to see if user wants cheese
                    fixin = "cheese"; //assings appropriate value for fixin
                }
                else if (fixin.equals("N") || fixin.equals("n")){ //checks to see if user wants no fixins
                    fixin = "no fixins"; //assings appropriate value for fixin
                }
                
                System.out.println("You ordered a burger with " + fixin);
                break; //terminates the switch statement
                
            case 'S': case 's': //case for soda
                
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m) "); //prompts user for input

                soda = myScanner.next(); //accepts input for the soda
                
                if (soda.equals("P") || soda.equals("p")){ //checks to see if user wants pepsi
                    soda = "pepsi"; //assings appropriate value to soda
                }                
                else if (soda.equals("C") || soda.equals("c")){ //checks to see if user wants coke
                    soda = "coke"; //assings appropriate value for soda
                }
                else if (soda.equals("S") || soda.equals("s")){ //checks to see if user wants sprite
                    soda = "sprite"; //assings appropriate value for soda
                }
                else if (soda.equals("M") || soda.equals("m")){ //checks to see if user wants mountain dew
                    soda = "mountain dew"; //assings appropriate value for soda
                }
                
                System.out.println("You ordered a " + soda);    
                break; //terminates the switch statement            
            
            case 'F': case 'f': //case for fries
            
                System.out.println("Do you want a large or small order of fries (l,L,s, or S) "); //prompts user for input

                fries = myScanner.next(); //accepts input for fries
                
                if (fries.equals("l") || fries.equals("L")){ //checks to see if user wants large
                    fries = "large fries"; //assings appropriate value to soda
                }                
                else if (fries.equals("s") || fries.equals("S")){ //checks to see if user wants small
                    fries = "small fries"; //assings appropriate value for soda
                }

                
                System.out.println("You ordered " + fries);              
                break; //terminates the switch statement            
        }//end of game switch statement
        
        
    }  //end of main method   
} //end of class