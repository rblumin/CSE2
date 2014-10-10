//Roger Blumin
//CSE2
//Lab06
//October 3, 2014
//Enigma2


import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0; //results in an error
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * When running, the program, java reports a runtime error in the form of a java.lang exception due to an arithmetic expression
 * The error in this program is in case 40 (which always happens to be the case because n always equals 40), when 40 is being divided by zero
 * 
 * 
 * 
 */
