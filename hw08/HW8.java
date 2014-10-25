//Roger Blumin
//CSE2
//HW08
//October 24, 2014
//This program uses three methods with the same same that has different parameters to return particular characters of strings

import java.util.Scanner;
public class HW8{ //class
  public static void main(String []arg){ //main method
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //prompt for user
	input=getInput(scan,"Cc"); //calls getInput that accepts scanner and string as parameters
	System.out.println("You entered '"+input+"'"); //pints output
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //prints next user prompt
	input=getInput(scan,"yYnN",5); //give up after 5 attempts; calls getInput method that accepts a scanner, string, and int as parameters
	if(input!=' '){//if statement to print output only if user did not fail
   	System.out.println("You entered '"+input+"'"); //prints output
	}
	input=getInput(scan,"Choose a digit.","0123456789"); //calls get input method that accepts a scanner and two strings as parameters
	System.out.println("You entered '"+input+"'"); //prints output
  } //end of main method
  
    public static char getInput(Scanner myScanner, String s){ //method that returns character entered of a specific string
    int x=1000;
    return getInput(myScanner,s,x); //calls a different get input method to get the needed input and returns the result
    }//end method
    
    public static char getInput(Scanner myScanner, String s, int n){ //method that returns character entered of a specific string, but returns ' ' after n attempts
        boolean b = false;
        int x=1; //control for while loop
        char c = ' '; //character that is going to be returned
        while (x<=n){ //whle loop to determine when to give up
            x++;//increments control
            String input = myScanner.next(); //accepts input from user
            
            while (input.length() != 1){ //while loop to ensure input is only one character
                System.out.print("You should enter one character "); //message
                input = myScanner.next(); //accepts input from user
            }//end while
            for (int i=0; i< s.length(); i++){ //for loop to find the character in the string that matches the user's input
                if((s.charAt(i))==(input.charAt(0))){ //checks to see if particular character of the string is equal to the user's input
                    c = s.charAt(i);
                    b=true;
                    break; //breaks for loop
                }//end of if
            } //end of for loop
            
            if (b){ //breaks the while loop if a matching character has been found
                break;
            }//end if
            
            System.out.print("You did not enter a character from the list " + s + "; try again: "); //error message
        }
        if (x>n){//checks to see if user failed
            System.out.println("");
            System.out.println("You failed after 5 tries"); //failure message
        }//end if
        return c; //returns character
    }//end method
    
    public static char getInput(Scanner myScanner, String prompt, String s){ //method uses the prompt and returns character of a string
    
        boolean b = false;
        int x=1; //control for while loop
        int n=1000;
        char c = ' '; //character that is going to be returned
        while (x<=n){ //while loop
            x++; //increments control
            
            System.out.println(prompt); //prints prompt
            System.out.print("Enter a digit from the list: "); //prints prompt
            for (int i=0; i<s.length(); i++){//for loop to print prompt
                System.out.print("'" + s.charAt(i) + "', "); //prints prompt
            } //end for loop
            
            String input = myScanner.next(); //accepts input from user
                    
            while (input.length() != 1){ //while to ensure user's input is only one character
                System.out.println("Enter exactly one character");//message
                System.out.println(prompt); //prints prompt
                System.out.print("Enter a digit from the list: "); //prints prompt
                for (int i=0; i<s.length(); i++){//for to print prompt
                    System.out.print("'" + s.charAt(i) + "', "); //prints prompt
                }//end for
                        
                input = myScanner.next(); //accepts input from user
            }//end while
            for (int i=0; i< s.length(); i++){//for loop to find matching character in string
                if((s.charAt(i))==(input.charAt(0))){//checks to see if particular character matches user's input
                    c = s.charAt(i);
                    b=true;
                    break;//breaks from for loop
                }//end if
            }//end for loop
            
            if (b){ //if to see if break needed
                break;//breaks entire while loop if matching character is found
            } //end if
            
            System.out.println("You did not enter an acceptable character"); //error message
        }//end of while loop

    return c;//returns character
    }//end of method
  
} //end of class
