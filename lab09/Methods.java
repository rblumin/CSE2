//Roger Blumin
//CSE2
//Lab09
//October 24, 2014
//This program accepts three integers and finds the largest of the three and states whether or not they were entered in ascending order

import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", and "+c+" are in ascending order");
  }

    public static int getInt(Scanner myScanner){ //method that returns an int entered by the user
        String junk ="";
        int x=0;
        
            System.out.print("Enter an int: "); //prompts user for input                
            
            while(!myScanner.hasNextInt()){  //while loop to check if user entered an Int         
                junk = myScanner.next(); //accepts input for starts
                
                System.out.print("You did not enter an int; try again: "); //prompts user for input            
            }//end  while loop
            
            x = myScanner.nextInt(); //accepts input for starts
    
            return x; //returns value of x
    }//end of getInt method

    public static int larger (int x, int y){ //method that returns the larger of two integers
        if (x>y){
            return x;
        }
        else{
            return y;
        }
    } //end of larger method

    public static boolean ascending( int a, int b, int c){ //method to determine if the three integers were entered in ascending order
        
        boolean z=false;
        if (a<b && b<c){
            z=true;
        }
        
        return z;
    } //end of ascending method

 
 
  
}
  
  