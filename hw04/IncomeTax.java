//Roger Blumin
//September 20, 2014
//CSE 2
//hw04
//This program determines the tax on an income entered by the user


import java.util.Scanner; //import scanner class

public class IncomeTax{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        double taxRate = 0;
    
        System.out.print("Enter an int giving the number of thousands- "); //prompts user to enter input
        if(myScanner.hasNextInt()){ //checks to see if the user entered an integer
        }
        else{
            System.out.println("You did not enter an int"); //informs the user of the error
            return;    //terminates the program
        }
        
        
        int income = myScanner.nextInt(); //accepts input for income
        
        
        if (income <0){ //checks to see if user entered a positive integer
            System.out.println("You did not enter a positive int"); //informs the user of the error
            return; //terminates the program
        }
        
        if (income<20){ //checks to see if income is less than 20
            taxRate = .05; //assigns appropirate tax value
        }
        
        else if (income>=20 && income <40){ //checks to see if income is between 20 and 40
            taxRate = .07; //assigns appropirate tax value
            
        }

        else if (income>=40 && income <78){ //checks to see if income is between 40 and 78
            taxRate = .12; //assigns appropirate tax value
        }
        
        else if (income>=78){ //checks to see if income is greater than 78
            taxRate = .14; //assigns appropirate tax value
            
        }
        
        double newIncome = income *1000 * taxRate; //multiples income by 1000
        double printTax = taxRate * 100; //multiplies taxrate by 100
        
        System.out.format("The tax rate on $" + income + ",000 is " + "%.1f", printTax);
        System.out.print("%, and the tax is $");
        System.out.format ("%.1f", newIncome);
        //above three output statements print the necessary output in proper format
        System.out.println(""); //prints blank line
        

    }  //end of main method   
} //end of class
