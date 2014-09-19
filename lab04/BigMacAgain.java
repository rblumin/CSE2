//Roger Blumin
//September 19, 2014
//CSE 2
//lab04
//This program computes the total price for Big Macs and Fries and ensures that the inputs entered by the user are acceptable based on the prompt

import java.util.Scanner; //import scanner class

public class BigMacAgain{ //class
    public static void main(String[] args) { // main method required for every Java program
    
    double BigMacCost = 2.22; //cost of each big mac
    double FriesCost = 2.15; //cost of fries
    
    Scanner myScanner; //declare scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    
    System.out.print("Enter the number of Big Macs(an integer > 0): "); //prompts user to enter input

    if(myScanner.hasNextInt()){ //checks to see if the user entered an integer
    }
    else{
        System.out.println("You did not enter an int"); //informs the user of the error
        return;    //terminates the program
    }
    
    int nBigMacs = myScanner.nextInt(); //accepts input for number of big macs

    if (nBigMacs > 0){ //checks to see if user enter an int greater than 0
    }
    else{
        System.out.println("You did not enter an int greater than 0");//informs the user of the error
        return;    //terminates the program
    }
    
    double BigMacTotal = BigMacCost * nBigMacs; //computes the total cost of big macs
    System.out.format("You ordered " + nBigMacs + " Big Macs for a cost of " + nBigMacs + "x2.22 = $" + "%.2f", BigMacTotal); //outputs total cost of big macs in proper format
    System.out.println("");//prints to next line
    
    
    System.out.print("Do you want an order of fries (Y/y/N/n)? "); //prompts user to enter input
    String answer=myScanner.next(); //stores the value of users input in the string answer
    
    if (answer.equals("Y")||answer.equals("y")||answer.equals("N")||answer.equals("n")){ //checks to see if user input is acceptable
    }
    else{
        System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'"); //informs the user of the error
        return;    //terminates the program
    }
    
    if (answer.equals("N")||answer.equals("n")){ //checks to see if user did not purchase fries
    FriesCost = 0; //if the above is true then the fries cost is set to 0
    }
    double totalCost = BigMacCost*nBigMacs + FriesCost; //calculates the total cost of the meal
    System.out.format("The total cost of the meal is $" + "%.2f", totalCost); //prints out the total cost of the meal in a proper format
    System.out.println(""); //prints a blank line


    }  //end of main method   
} //end of class
