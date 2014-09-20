//Roger Blumin
//September 20, 2014
//CSE 2
//hw04 program 4
//This program displays the time in conventional from a certain amount of seconds


import java.util.Scanner; //import scanner class

public class TimePadding{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        System.out.print("Enter the time in seconds: "); //prompts user for input
        int time = myScanner.nextInt(); //accepts input for seconds
        
        
        int hours = time/3600; //calculates number of hours
        time -= (hours * 3600); //removes the seconds for hours from the time
        int min = time/60; //calculates number of minutes
        time -= (min * 60); //removes the seconds for minutes from the time
        int sec = time; //calculates the number of seconds
        
        System.out.print("The time is " + hours + ":");
        
        if (min <10){ //checks to see if min is less than 10
            System.out.print("0" + min + ":"); //if above is true, prints out min in special format
        }
        
        else{
            System.out.print(min + ":"); //prints out min
        }
        
        if (sec <10){ //checks to see if sec is less than 10
            System.out.print("0" + sec + "."); //if above is true, prints out sec in special format
        }
        
        else{
            System.out.print(sec + "."); //prints out sec    
        }
        
        System.out.println(""); //prints blank line
        

    }  //end of main method   
} //end of class