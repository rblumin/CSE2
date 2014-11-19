//Roger Blumin
//CSE2
//Lab11
//November 7, 2014
//This program uses arrays to find the largest numbers, smallest number, and sum

import java.util.Scanner;
public class Arrays{ //class
    public static void main(String []arg){ //main method
    
        int[] nums; //declares int array
        nums = new int[10]; //allocates array for 10 ints
        
        Scanner input = new Scanner (System.in); //scanner object for input
        
        System.out.print("Enter 10 ints "); //print message
        int sum=0; //variable to be used for sum
        for (int i=0; i<=9; i++){ //for loop for input and sum of array
            nums[i] = input.nextInt(); //accepts users input and stores in an array
            sum += nums[i]; //calculates sum
        }//end for loop
        
        int max=nums[0]; //variable for max
        int min=nums[0]; //variable for min
        
        for (int j=1; j<=9; j++){ //for loop to find min and max
            if (max<nums[j]){ //if statement for max
                max=nums[j]; //stores current max value in max
            } //end if
            if (min>nums[j]){ //if statement for min
                min=nums[j]; //stores current min value in min
            } //end if
        } //end for loop
        
        System.out.println("The lowest entry is " + min); //prints min
        System.out.println("The highest entry is " + max); //prints max
        System.out.println("The sum is " + sum); //prints sum
        
        int[] reversenums; //declares int array
        reversenums = new int[10]; //allocates array for 10 ints
    
        for (int k=0; k<=9; k++){ //for loop for reversing array
            reversenums[k]=nums[9-k]; //reverses array into second array
            System.out.println(nums[k] + " " + reversenums[k]); //prints both arrays
            
        }//end for loop

    
    }//end main method
} //end class