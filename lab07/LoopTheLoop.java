//Roger Blumin
//CSE2
//Lab06
//October 10, 2014
//LoopTheLoop
//This program prints out stars in rows based on the user's input


import java.util.Scanner; //imports scanner class

public class LoopTheLoop{ //class
    public static void main(String arg []){ //main method
        

        
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor


        int nStars=0;
        String junk = "";
        String cont = "";
        
    
    
        while(true){
    
            while(nStars<1 || nStars>15){ //while loop to check if int is in range
                System.out.println("Enter an int between 1 and 15:  "); //prompts user for input                
                
                while(!myScanner.hasNextInt()){  //while loop to check if user entered an int          
                    junk = myScanner.next(); //accepts input for starts           
                
                    System.out.println("Enter an int between 1 and 15:  "); //prompts user for input
    
    
                }//end inner while loop
                
                nStars = myScanner.nextInt(); //accepts input for starts
                if(nStars<1 || nStars>15){//if statement to print out error
                System.out.println("Your int was not in the range [1.15]"); //explains error
                }//end if
            }//end outer while loop
            
    
            int counter = 1; //control for loop
            int lineCounter = 1; //control for inner loop
            
            
            while(counter<=nStars){ //while loop to print out stars
                System.out.print("*"); //prints out stars
                counter++; //increment control
            } //end while loop
                System.out.println("");  //moves to next row for output   
            
            counter=1; //resets value of counter
            
            
            while(counter<=nStars){ //while loop to print out stars
            
                while(lineCounter<= counter){//while loop inside while loop to print out correct number of stars in each row
                    System.out.print("*"); //prints out stars
                    lineCounter++; //increment control
                } //end of while loop
                
                lineCounter = 1; //resets value of lineCounter
                
                System.out.println("");  //moves to next row for output
                counter ++; //increment control
                
                
            }//end of while loop
  
            System. out.println("Would you like to continue? If so, enter y or Y");
            cont = myScanner.next(); //accepts input for starts
            
            if ((cont.equals("Y")) || (cont.equals("y"))){
            }
            else{
                break;
            }
            
            
            nStars=0;



  
        }//end of while true loop
  
    }  //end of main method   
} //end of class