//Roger Blumin
//CSE2
//HW09
//November 4, 2014
//BlockedAgain
//This program uses methods to create a block of numbers


import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);
    }



    public static int getInt(){ //method to get the user to enter an int
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        System.out.print("Enter an int betwen 1 and 9, inclusive: "); //prompts user for input        
        String input = " "; //accepts input for starts 
        while (!checkInt(myScanner)){ //while loop to keep prompting the user to enter input until an int is entered
            System.out.print("You did not enter an int; try again: "); //error message
            input = myScanner.next(); //accepts input for starts 
        } //end of while loop
        
       int x= myScanner.nextInt(); //gets value of integer the integer
       
        while (!checkRange(x)){ //while loop to keep prompting the user to enter input until an int in range is entered
            System.out.print("You did not enter an int in [1,9]; try again: "); //explains error
            x=myScanner.nextInt(); //accepts user's input
        }//end while loop

       return x; //returns a one digit integer
       
    } //end of getInt method
    
    
    
    public static boolean checkInt(Scanner myScanner){ //method to check if user entered int
        boolean b = false; //delcaration of boolean that will be returned
        if (myScanner.hasNextInt()){ //if statement to change value of boolean that will be returned
            b=true; //changes value of boolean
        } //end if
        return b; //returns boolean
    }//end of checkInt Method
        
        
    public static boolean checkRange(int x){ //method to check if int is in range of 1 to 9
        boolean b = true; //declaration of boolean that will be returned
        if(x<1 || x>9){//if statement to change value of boolean that will be returned
        b=false; //changes value of boolean
        }//end if
        return b; //returns boolean  
    } //end of checkRange method
    
    public static void allBlocks(int x){ //method to print blocks
        int center = (int) ((x+x-1)/2)+1; //finds the center of the last line to be printed
        for(int i=1; i<=x; i++){ //for loop used to print a block for each number
            block(i, center); //calls the method block to print the block for each number
        } //end of for loop
    } //end of allBlocks Method
    
    public static void block(int x, int center){ //method to print out a block of numbers for a particular number
        for(int i=1; i<=x; i++){ //for loop to print out the lines of each block
        line(x,0,center); //calls lines method to print out the numbers of the block
        }//end of for loop
        line(x,100, center); //calls the lines method to print out the dash line of each block
    } //end of block method
    
    
    public static void line(int x, int y, int center){ //line method to print out each line of each block

        int i=x; //sets value of x to i

        if(y==100){ //special case to print out dash line
            
            for( int l = 1; l<=(center+center-1); l++){ //to print dashes
                if (l<(center-i+1) || l>(center+i-1)){ //used to print space
                System.out.print(" "); //prints out space
                } //end of inner if
                else{ //used to print dash
                System.out.print("-");  //print out dash   
                } //end of ese           
            } //end of for loop
            System.out.println(); //prints out blank line
            
        }//end of if
        
        else{ //used to print out lines of numbers
            for (int j=1; j<=(center+center-1); j++){ //for loop to determine how many characters to print per line
                if (j<(center-i+1) || j>(center+i-1)){ //used to print spaces
                System.out.print(" ");//prints out spaces
                } //end of if
                else{ //used to print number
                System.out.print(i);   //prints out numbers 
                } //end of inner else
            } //end of for loop
            
            System.out.println(); //prints blank line
        } //end of else    
        
    }  //end of line method  
    
}//end of class