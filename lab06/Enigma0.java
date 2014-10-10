//Roger Blumin
//CSE2
//Lab06
//October 3, 2014
//Enigma0


/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n = 0; //declares n
    if(scan.hasNextInt()){
        n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      String error = scan.next(); //delcares string for input
      System.out.println("You entered "+ error); //tells user what was entered
      return; //terminates the program because an int was not entered
    }
    
    int k=4,p=6,q=7,r=8; //removed n
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *   The variable n is declared multiple times in multiple scopes
 *   Also the value of k+p+q+r will always be 25.
 *   Also the else statement will always says the user entered 4 if the user doesn't enter an int
 */
