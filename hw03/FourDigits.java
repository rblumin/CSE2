import java.util.Scanner; //import scanner class


//Roger Blumin
//September 12, 2014
//CSE 2
//hw03 Program 3
//This program computes the crude estimate of a cube root


public class FourDigits { //class
    public static void main(String[] args) { // main method required for every Java program

    Scanner myScanner; //declare scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    
    System.out.print ("Enter a double and I display the four digits to the right of the decimal point- "); //asks user to enter a double
    double x = myScanner.nextDouble(); //accepts user input
    
    int  xInt = (int) x; //casts x into an integer
    xInt *=10000; //multipies the value of the casted Integer by 10000
    
    int xNewInt = (int) (10000 * x); //casts the value of 10000 multipled by x into an integer
   
    int digits = xNewInt - xInt; //subtracts the orginally casted integer from the casted integer that was multiplied by 10,000 to determine the digits after the decimal
   
    int firstDigit = digits / 1000; //determines the first digit
    digits -= (firstDigit * 1000); //changes the value of digits into a three or less digit number if that is not already the case
    int secondDigit = digits / 100; //determines the second digit
    digits -= (secondDigit * 100); //changes the value of digits into a two or less digit number if that is not already the case
    int thirdDigit = digits / 10; //determines the third digit
    digits -= (thirdDigit * 10); //changes the value of digits into a one digit number if that is not already the case
    int fourthDigit = digits / 1; //determines the fourth digit
    //the above process accesses each of the four digits after the decimal individually

   
    System.out.println("The four digits are " + firstDigit + secondDigit + thirdDigit + fourthDigit); //prints out the four digits after the decimal
    
    
    }  //end of main method   
} //end of class
