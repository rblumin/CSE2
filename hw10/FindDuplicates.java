//Roger Blumin
//CSE2
//HW10
//November 14, 2014
//This program checks to see there are repeated entries within an array


import java.util.Scanner;
public class FindDuplicates{ //class
  public static void main(String [] arg){ //main method
    Scanner scan=new Scanner(System.in); //creates scanner object
    int num[]=new int[10]; //declares an integer array with ten elements
    String answer=""; //empty string
    do{ //do while loop
      System.out.print("Enter 10 ints- "); //output to ask for input
      for(int j=0;j<10;j++){ //for loop to get input from user
        num[j]=scan.nextInt(); //accepts users input and stores the input in the array num
      } //end for loop
      String out="The array "; //string used for output
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ //if statement that calls hasDups method
        out+="has "; //used for output
      } //end if
      else{ //else
        out+="does not have "; //used for output
      } //end else
      out+="duplicates."; //used for output
      System.out.println(out); //prints output using string out
      out="The array "; //used for output
      out+=listArray(num); //calls the listArray method and adds result to string out   
      if(exactlyOneDup(num)){ //if statement that calls if exactlyOneDup method
        out+="has "; //used for output
      } //else if
      else{ //else statment
        out+="does not have "; //used for output
      } //end else statment
      out+="exactly one duplicate."; //used for output
      System.out.println(out); //prints output using string out
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //prints prompt for user
      answer=scan.next(); //gets user's input
    }while(answer.equals("Y") || answer.equals("y")); //while loops that checks if the users answer is "y" or "Y"
  } //end main method

  public static String listArray(int num[]){ //listArray method that accepts an array of integers
    String out="{"; //delcares string
    for(int j=0;j<num.length;j++){ //for loop to obtain the list of elements in the array
      if(j>0){ //if statement
        out+=", "; //adds comma to string out
      } //end if
      out+=num[j]; //adds ith element of the array to string out
    } //end of for loop
    out+="} "; //adds to string out
    return out; //returns string for output
  }//end list array method
  
  
    public static boolean hasDups(int num[]){ //hasDups method that accepts an array of integers
        int count = 0; //counter used to count if duplicates are present
        boolean answer = false; //boolean to be used for output
        for (int i=0; i<= num.length-1; i++){ //for loop check to check through each element of the array
                for (int j=0; j<= num.length-1; j++){ //for loop to check to see if there is a duplicate for each element of the array
                    if (i!=j){ //runs only is i is not equal to k
                        if(num[i]==num[j]){ //if statement if there is a duplicate
                            count ++; //increases counter variable
                        } //end inner if
                    } ////end outer if
                }//end inner for loop
        }//end outer for loop
        
        if (count>0){ //if there are duplicates
            answer = true; //make valueto be returned true
        } //end if
        
        return answer; //returns a boolean
    
    
    } //end of hasDups method


    public static boolean exactlyOneDup(int num[]){ //exactlyOneDup method that accepts an array of integers
        int num2[]=new int[num.length]; //declares an integer array
        
        for (int i=0; i<num.length; i++){ //for loop to copy contents of num into num2
        	num2[i] = num[i];
        } //end for loop
        
        
        int count1 = 0; //counter used to count if duplicates are present
        int count2 = 0; //counter used to count if duplicates are present        
        boolean answer = false; //boolean to be used for output
        for (int i=0; i<= num2.length-1; i++){ //for loop check to check through each element of the array
                for (int j=0; j<= num2.length-1; j++){ //for loop to check to see if there is a duplicate for each element of the array
                    if (i!=j){ //runs only is i is not equal to k
                        if(num2[i]==num2[j]){ //if statement if there is a duplicate
                            count1++; //increases counter variable
                            num2[j]=-1; //changes value of position j of array to -1
                        } //end inner if
                    } ////end outer if
                }//end inner for loop
                
                if (count1==0){ //if statment if no duplicates of first value
                    continue; //continues through the loop
                } //end if
                
                else if(count1==1){ //else if there is exactly one duplicate value
                    count1=0; //reset count1
                    count2++; //increment count2
                }
                else{ //else will be the case for multiple duplicates
                    break; //breaks loop
                }//end else
                    
        }//end outer for loop
        
        if (count2==1){ //if there are duplicates
            answer = true; //make valueto be returned true
        } //end if
        return answer; //returns a boolean
    
    } //end of exactlyOneDup method
  
  
  
  
}//end class
