//Roger Blumin
//September 20, 2014
//CSE 2
//hw04 program 2
//This program displays the number of days in a month 


import java.util.Scanner; //import scanner class

public class Month{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor

    
        System.out.print("Enter an int giving the number of the month (1-12)- "); //prompts user to enter input
        if(myScanner.hasNextInt()){ //checks to see if the user entered an integer
        }
        else{
            System.out.println("You did not enter an int"); //informs the user of the error
            return;    //terminates the program
        }
        
        
        int month = myScanner.nextInt(); //accepts input for the month
        
        if (month <1 || month >12){ //checks to see if user entered an integer in the range
            System.out.println("You did not enter an int between 1 and 12"); //informs the user of the error
            return; //terminates the program
        }
        
        int days = 0; //creates days variable
        
        
        switch (month) { //applies the appropriate case based on the users input
            case 1:  days = 31; //assigns appropriate days for the month
                     break; //terminates the switch
            case 2:  
                     System.out.print("Enter an int giving the year- "); //prompts user to enter input
                     
                     if(myScanner.hasNextInt()){ //checks to see if the user entered an integer
                     }
                     else{
                        System.out.println("You did not enter an int"); //informs the user of the error
                        return;    //terminates the program
                     }

                     int year = myScanner.nextInt(); //accepts input for the month
                     
                     if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) { //checks to see if its a leap year
                        days = 29; //assigns 29 to days for leap year
                     }
                     else{ //else statement
                        days = 28; //assigns 28 to days for non leap years
                     }
                     break; //terminates the switch
            case 3:  days = 31; //assigns appropriate days for the month
                     break; //terminates the switch
            case 4:  days = 30; //assigns appropriate days for the month
                     break; //terminates the switch
            case 5:  days = 31; //assigns appropriate days for the month
                     break; //terminates the switch
            case 6:  days = 30; //assigns appropriate days for the month
                     break; //terminates the switch
            case 7:  days = 31; //assigns appropriate days for the month
                     break; //terminates the switch
            case 8:  days = 31; //assigns appropriate days for the month
                     break; //terminates the switch
            case 9:  days = 30; //assigns appropriate days for the month
                     break; //terminates the switch
            case 10: days = 31; //assigns appropriate days for the month
                     break; //terminates the switch
            case 11: days = 30; //assigns appropriate days for the month
                     break; //terminates the switch
            case 12: days = 31; //assigns appropriate days for the month
                     break; //terminates the switch
        }

            System.out.println("The month has " + days + " days"); //prints output

    }  //end of main method   
} //end of class