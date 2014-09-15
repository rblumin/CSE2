import java.util.Scanner; //import scanner class


//Roger Blumin
//September 12, 2014
//CSE 2
//hw03 Program 2
//This program computes the crude estimate of a cube root


public class Root { //class
    public static void main(String[] args) { // main method required for every Java program

    Scanner myScanner; //declare scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    System.out.print("Enter a double and I print its cube root: "); //prompts user to enter input
    double x = myScanner.nextInt(); //accepts input from user
    double guess = x/3; //divides the user input by 3;
    guess = (2*guess*guess*guess+x)/(3*guess*guess); //estimates value of cube root based on previous guess
    guess = (2*guess*guess*guess+x)/(3*guess*guess); //estimates value of cube root based on previous guess
    guess = (2*guess*guess*guess+x)/(3*guess*guess); //estimates value of cube root based on previous guess
    guess = (2*guess*guess*guess+x)/(3*guess*guess); //estimates value of cube root based on previous guess  
    guess = (2*guess*guess*guess+x)/(3*guess*guess); //estimates value of cube root based on previous guess
    
    double guessCubed = guess *guess *guess; //cubes the final guess value
    
    System.out.println("The cube root is " + guess + ":"); //prints output of the guess
    System.out.println(guess + "*" + guess + "*" + guess + " = " + guessCubed); //prints output of the guess cubed
    
    
    }  //end of main method   
} //end of class
