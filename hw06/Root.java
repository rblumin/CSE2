//Roger Blumin
//CSE2
//HW06
//October 14, 2014
//Roulette
//This program estimates the square root of a number



import java.util.Scanner; //imports scanner class


public class Root{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        double low = 0;
        double x=0;
        double middle = 0;
        String junk ="";
        
        
        while(x<=0){ //while loop to check if input is in range
            System.out.println("Enter a double greater than 0: "); //prompts user for input                
            
            while(!myScanner.hasNextDouble()){  //while loop to check if user entered a double         
                junk = myScanner.next(); //accepts input for starts           
            
                System.out.println("Enter a double greater than 0: "); //prompts user for input


            }//end inner while loop
            
            x = myScanner.nextDouble(); //accepts input for starts
            if(x<=0){//if statement to print out error
            System.out.println("Your int was not greater than 0"); //explains error
            }//end if
        }//end outer while loop
        
        
        double high = x+1;
        
        while ((high-low)> 0.0000001*(1+x)){ //while to calculate square root
        
        middle = (low + high)/2;//calculates new middle
        if ((middle*middle)>x){//checks to see whether the upper half of the middle or the lower half of the middle contains the square root of x
            high=middle; //assigns middle to high
        }//end if
        else{ //else
            low=middle; //assigns middle to low
        }//end else
        
        }//end of while

        System.out.println("The square root of " + x + " is " + middle); //prompts user for input

    
    }//end of main method
} //end of class