import java.util.Scanner; //import scanner class
import java.text.*; //import decimal format class



//Roger Blumin
//September 12, 2014
//CSE 2
//hw03 Program 1
//This program computes the crude estimate of a cube root


public class Bicycle { //class
    public static void main(String[] args) { // main method required for every Java program

    Scanner myScanner; //declare scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    
    DecimalFormat myFormatter = new DecimalFormat("##.00"); //declare decimalFormat object
    
    
    System.out.print("Enter the number of seconds: "); //prompts user to enter seconds
    double seconds = myScanner.nextInt(); //accepts seconds input from user
    System.out.print("Enter the number of counts: "); //prompts user to enter counts
    double counts = myScanner.nextInt(); //accepts counts input from user
    double wheelDiameter=27.0, //diameter of wheel    
        PI=3.14159, //value of pi
        feetPerMile=5280, //number of feet per mile
        inchesPerFoot=12, //number of inches perfoot
        secondsPerMinute=60; //number of seconds per minute
    double distanceTrip;//variables for distance for each trip and total trip distance
        
    distanceTrip=counts*wheelDiameter*PI;
        // Calculates distance in inches for trip
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        
    distanceTrip/=inchesPerFoot*feetPerMile; // Converts to distance in miles
    double timeMinuntes = seconds / secondsPerMinute; //converts the seconds to minutes
    double mph = distanceTrip/(timeMinuntes/60); //calculates the average miles per hour
    System.out.println("The distance was " + myFormatter.format(distanceTrip) + " and took " + timeMinuntes + " minutes.");
        //outputs the distance of the trip and the amount of minutes it took in proper format
    
    
    System.out.println("The average mph was "+ myFormatter.format(mph));
        //outputs the average miles per hour that the trip took in proper format

    }  //end of main method   
} //end of class
    
    
    
    