//Roger Blumin
//CSE2
//Lab12
//December 1, 2014
//This program sorts rows of ragged rays of random numbers in ascending order

import java.util.Arrays;

public class RaggedArrays{ //class
    public static void main(String [] arg){ //main method
    
    int [][] ragged = new int [5][]; //creates double array with five rows
    for(int i = 0; i<5; i++){ //for loop used to determine number of member of each row
	    ragged[i] = new int[i*3+5]; //assigns amount of members int each row
    }//end for loop
    
    System.out.println("The array before sorting"); //prints output
    
    
    for(int i = 0; i<5; i++){ //for loop to assign random numbers to array and print array
        for (int j=0; j<i*3+5; j++){ //for loop to assign random numbers to array and print array
            int rNum = (int) (Math.random() *40); //generates a random number between 0 and 39 inclusive to each position of the array
            ragged[i][j] = rNum;    //assigns the random number to a particular position of the array             
            System.out.print(ragged[i][j] + " "); //prints a member of the array
        } //end innner for loop
        System.out.println(); //prints blank line after each row
    } //end outer for loop
    
    
    
    for(int i = 0; i<5; i++){ //for loop to sort the rows of the array
        Arrays.sort(ragged[i]); //sorts each row of the array
    } //end for loop
    
    System.out.println();//prints blank line
    System.out.println("The array after sorting"); //prints output
    
    for(int i = 0; i<5; i++){ //for loop to print sorted array
        for (int j=0; j<i*3+5; j++){ //for loop to print each row
            System.out.print(ragged[i][j] + " "); //prints entry of array
        } //end inner for loop
        System.out.println(); //prints blank line in between rows
    }    //end outer for loop 
    
    
    
    
    }//end main method
}//end class