import java.util.Scanner;


//Roger Blumin
//September 12, 2014
//CSE 2
//lab03
//This program computes the cost of buying big macs


public class BigMac { //class
    public static void main(String[] args) { // main method required for every Java program

    Scanner myScanner; //declare scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    System.out.print("Enter the number of Big Macs(an integer > 0): "); //prompts user to enter input
    int nBigMacs = myScanner.nextInt(); //accepts input for number of big macs
    
    
    System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx): "); //prompts user to enter input
    double bigMac$ = myScanner.nextDouble(); //accepts cost input from user
	System.out.print("Enter the percent tax as a whole number (xx): "); //prompts user to enter input
    double taxRate = myScanner.nextDouble(); //accepts tax rate from user
    taxRate/=100; //user enters percent, but I want proportion

    double cost$; //declares cost variable
    int dollars,   //whole dollar amount of cost 
        dimes, pennies; //for storing digits to the right of the decimal point for the cost$ 
    cost$ = nBigMacs*bigMac$*(1+taxRate); //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;//get dimes amount, e.g., 
    // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
    //  where the % (mod) operator returns the remainder
    //  after the division:   583%100 -> 83, 27%5 -> 2 
    dimes=(int)(cost$*10)%10; //gets number of dimes
    pennies=(int)(cost$*100)%10; //gets number of pennies
    System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
    " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.' +dimes+pennies);
    //prints out the output




    }  //end of main method   
} //end of class
