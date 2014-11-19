//Roger Blumin
//CSE2
//Lab12
//November 14, 2014
//This program checks to see if two arrrays are equal and sums two arrays


public class ArrayMath{ //class
  public static void main(String [] arg){ //main method
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
      //delcaring several arrays of doubles
    v=addArrays(x,y); //calls addArrays method
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z))); //prints output
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y)); //prints output
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w)); //prints output
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z)); //prints output

  } //end main method
  
  public static String display(double [] x){ //display method
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";

  } //end display method
  
  public static boolean equals(double a[],double b[]){ //equals method that accepts two double arrays
      boolean size = false; //bolean to check is array sizes are equal
      boolean answer = false; //boolean that will be return
      int count = 0; //creates a counter to see if there are any nonidentical values
      if (a.length==b.length){ //if statement to determine if sizes of arrays are equal
          size=true; //true if arrays have the same size
      }//end if
      
      
      if (size){ //if statement that runs only is sizes are equal
          for (int i=0; i<=a.length-1; i++){ //for loop to count nubmer of nonidentical values
              if (a[i]!=b[i]){ //if statement to see if a particular value is not identical
                  count ++; //increases counter
              }//end innter if
          } //end for loop
      } //end outer if
      
      if (size && count == 0){ //if arrays are the same size and have all idetnical values
          answer = true; //makes answer true
      } //end if
      return answer; //returns boolean value
  } //end equals method
  
    public static double[] addArrays(double a[],double b[]){ //addArrays method that accepts two double arrays
        int sizelong =0; //variable for size of longer array
        int sizeshort =0; //variable for size of shorter array
        int x=-1; //variable to determine which array is larger
        
         if (a.length>b.length){//arrays a is larger than array b
            sizelong=a.length; //a is long
            sizeshort=b.length; //b is short
            x=0; //a is longer so x=1

            
         }//end if
         else{ //else statement
            sizelong=b.length; //b is long
            sizeshort=a.length; //a is short
            x=1; //b is longer so x=1

         } //end else
         
        double[] result; //declares double array
        result = new double[sizelong]; //allocates double for size of sizelong         
         
         
          for (int i=0; i<=sizelong-1; i++){ //for loop to add arrays
              if((i>sizeshort-1) && x ==1){ //if statement to make sum of a particular element only equal to b if b is longer than a
                result[i]=b[i]; //sets value of result equal to b because a is 0 for these elements
              } //end if
              else if((i>sizeshort-1) && x ==0){//if statement to make sum of a particular element only equal to a if a is longer than a
                result[i]=a[i]; //sets value of result equal to a because b is 0 for these elements
              } //end else if
              else{ //else statement
                result[i]=a[i] + b[i]; //stores sum of a and b is array result
              } //end else
          } //end for loop
          
          return result; //returns a double array
    }//end of addArrays method
  
  
  
} //end class
