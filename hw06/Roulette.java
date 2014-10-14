//Roger Blumin
//CSE2
//HW06
//October 14, 2014
//Roulette
//This program is a runs a simulation for 1000 trials of betting on the same number on Roullete 100 times



public class Roulette{ //class
    public static void main(String[] args) { // main method required for every Java program
    
    int count1=1; //control for loop
    int count2=1; //control for loop
    int wins=0; //used to store number of wins
    int total=0;
    int loses=0;
    int profit = 0;
    
    
    while(count2<=1000){ //1000 simulations
        count2++; //increments control
        int rNum = (int) (Math.random() *37 + 1); //generates a random number between 1 and 38 inclusive
        
        while(count1<=100){ //while for 100 times betting on same number
            count1++;//increments control 
            
            int compareNum = (int) (Math.random() *37 + 1); //generates a random number between 1 and 38 inclusive
            
            if (compareNum == rNum){ //compares random number to rNum)
                wins++;
            }
            
            
        }//end of inside while
        
        if(wins==0){//if to calculate number of loses
            loses++;
        }
        
        if(wins>=3){ //if to calcualte number of times profit was made
            profit++;
        }
        
        total+= 36*wins; //calculates total of winning
        wins=0; //resets wins
        count1=1; //resets inner countrol
        
        
    
    }//end of outside while
    
    System.out.println("The number of times you lost everything is " + loses);
    System.out.println("Your total winnings are $" + total);   
    System.out.println("The number of times you made of profit is " + profit);    
    
    
    }  //end of main method   
} //end of class
        