//Roger Blumin
//September 25, 2014
//CSE 2
//hw05
//This program uses random variables to create boolean expressions and the user is asked if the expression is correct

import java.util.Scanner; //import scanner class

public class BoolaBoola{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        
        boolean boola1 = (Math.random()< 0.5); //assings random value to boola1
        boolean boola2 = (Math.random()< 0.5); //assings random value to boola2
        boolean boola3 = (Math.random()< 0.5); //assings random value to boola3
        String answer; //variable wil be used for user input
        
        int num = (int) (Math.random() *3 + 1); //generates a random number between 1 and 4 inclusive that will be used to assign operators
        
        switch (num){
            
            case 1: //case for || and && operator
                System.out.print("Does " + boola1 + " || " + boola2 +" && " + boola3 + " have the value true(t/T) or false(f/F)? "); //prints out prompt to the user
                answer = myScanner.next();//retreives user's answer
                if ((boola1 || boola2 && boola3) && (answer.equals("T")||answer.equals("t"))){//checks to see if user's response is correct
                    System.out.println("Correct"); //output message
                }
                else if (!(boola1 || boola2 && boola3) && (answer.equals("F")||answer.equals("f"))){ //checks to see if user's response is correct
                    System.out.println("Correct"); //output message
                }
                else { //if users response is wrong
                    System.out.println("Wrong; try again"); //output message
                }
                
                break; //terminates the switch statement
            
            case 2: //case for && and || operator
                System.out.print("Does " + boola1 + " && " + boola2 +" || " + boola3 + " have the value true(t/T) or false(f/F)? "); //prints out prompt to the user
                answer = myScanner.next();//retreives user's answer
                if ((boola1 && boola2 || boola3) && (answer.equals("T")||answer.equals("t"))){//checks to see if user's response is correct
                    System.out.println("Correct"); //output message
                }
                else if (!(boola1 && boola2 || boola3) && (answer.equals("F")||answer.equals("f"))){ //checks to see if user's response is correct
                    System.out.println("Correct"); //output message
                }
                else { //if users response is wrong
                    System.out.println("Wrong; try again"); //output message
                }
                
                break; //terminates the switch statement
                
             case 3: //case for || and || operator
                System.out.print("Does " + boola1 + " || " + boola2 +" || " + boola3 + " have the value true(t/T) or false(f/F)? "); //prints out prompt to the user
                answer = myScanner.next();//retreives user's answer
                if ((boola1 || boola2 || boola3) && (answer.equals("T")||answer.equals("t"))){//checks to see if user's response is correct
                    System.out.println("Correct"); //output message
                }
                else if (!(boola1 || boola2 || boola3) && (answer.equals("F")||answer.equals("f"))){ //checks to see if user's response is correct
                    System.out.println("Correct"); //output message
                }
                else { //if users response is wrong
                    System.out.println("Wrong; try again"); //output message
                }
                
                break; //terminates the switch statement               
                
            case 4: //case for && and && operator
                System.out.print("Does " + boola1 + " && " + boola2 +" && " + boola3 + " have the value true(t/T) or false(f/F)? "); //prints out prompt to the user
                answer = myScanner.next();//retreives user's answer
                if ((boola1 && boola2 && boola3) && (answer.equals("T")||answer.equals("t"))){//checks to see if user's response is correct
                    System.out.println("Correct"); //output message
                }
                else if (!(boola1 && boola2 && boola3) && (answer.equals("F")||answer.equals("f"))){ //checks to see if user's response is correct
                    System.out.println("Correct"); //output message
                }
                else { //if users response is wrong
                    System.out.println("Wrong; try again"); //output message
                }
                
                break; //terminates the switch statement                
                
                
                
        } //end of switch statement
        
        
    }  //end of main method   
} //end of class