//Roger Blumin
//CSE2
//HW07
//October 21, 2014
//NumberStack
//This program uses for loops, while loops, and do-while loops to create stacks of numbers


import java.util.Scanner; //imports scanner class


public class NumberStack{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        int x=0;
        String junk ="";
        int i=0;
        int r=0;
        int j=0;
        int l=0;
        
        
        while(x<=0){ //while loop to check if input is in range
            System.out.println("Enter a number betwen 1 and 9: "); //prompts user for input                
            
            while(!myScanner.hasNextInt()){  //while loop to check if user entered a double         
                junk = myScanner.next(); //accepts input for starts           
            
                System.out.println("Enter a number betwen 1 and 9: "); //prompts user for input


            }//end inner while loop
            
            x = myScanner.nextInt(); //accepts input for starts
            if(x<1 || x>9){//if statement to print out error
            System.out.println("Your int was not in range"); //explains error
            }//end if
        }//end outer while loop
        
        
        
        int center = (int) ((x+x-1)/2)+1;        
        
        //Using for Loops
        
        System.out.println("Using for loops:");

        for( i=1; i<=x; i++){ // number
            
            for ( r=1; r<=i; r++){ //columns
            
                for ( j=1; j<=(x+x-1); j++){ //rows
                    
                    if (j<(center-i+1) || j>(center+i-1)){ //used to print spaces
                    System.out.print(" ");
                    }
                    else{ //used to print number
                    System.out.print(i);    
                    }
                    
                }
                
                System.out.println();
                
            }
            
            for( l = 1; l<=(x+x-1); l++){ //to print dashes
        
                if (l<(center-i+1) || l>(center+i-1)){ //used to print space
                System.out.print(" ");
                }
                else{ //used to print dash
                System.out.print("-");    
                }            
            
            }
            System.out.println();
            
        }




//Using while Loops

        i=1;
        r=1;
        j=1;
        l=1;
        
        System.out.println("Using while loops:");
        
        while(i<=x){//number
            while(r<=i){///columns
                while(j<=(x+x-1)){//rows
                    if (j<(center-i+1) || j>(center+i-1)){ //used to print spaces
                    System.out.print(" ");
                    }
                    else{ //used to print number
                    System.out.print(i);    
                    } 
                    j++;   
                }
                j=1;
                System.out.println();
                r++;
            }
            
            while(l<=(x+x-1)){
                if (l<(center-i+1) || l>(center+i-1)){ //used to print space
                System.out.print(" ");
                }
                else{ //used to print dash
                System.out.print("-");    
                } 
            
                l++;
            }
            
            System.out.println();            
            i++;
            r=1;
            l=1;
        }
        
        


//Using do loops

        i=1;
        r=1;
        j=1;
        l=1;
        
        System.out.println("Using do-while loops:");
        
        do{//number
            do{///columns
                do{//rows
                    if (j<(center-i+1) || j>(center+i-1)){ //used to print spaces
                    System.out.print(" ");
                    }
                    else{ //used to print number
                    System.out.print(i);    
                    } 
                    j++;   
                }while(j<=(x+x-1));
                j=1;
                System.out.println();
                r++;
            }while(r<=i);
            
            do{
                if (l<(center-i+1) || l>(center+i-1)){ //used to print space
                System.out.print(" ");
                }
                else{ //used to print dash
                System.out.print("-");    
                } 
            
                l++;
            }while(l<=(x+x-1));
            
            System.out.println();            
            i++;
            r=1;
            l=1;
        }while(i<=x);


    }
}