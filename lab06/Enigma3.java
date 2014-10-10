//Roger Blumin
//CSE2
//Lab06
//October 3, 2014
//Enigma0


/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash */



import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
//System.out.println(n);
//System.out.println(k);
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    
//System.out.println(n);
//System.out.println(k);    
    
    
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5; //this line makes n =0;
        k/=9; //this line makes the value of k equal to 5
      default:
        n-=3; //this line makes the value of n equal to negative 3
        k-=5; //this line makes the value of k equal to zero
    }
     out+=1/n + 1/k;  //the error occurs in this line when when 1 is being divided by k (which equals zero) 
    System.out.println(out);
  }
}

/*
 * Error report:
 * After using print statements, I found that the switch(n+k) statement results in the values of n to equal negative 3 and the value of k
 * to equal 0.  In line 63, the runtime error is caused becuase 1/k cannot be computed because k is equa to 0
 * 
 * 
 */

