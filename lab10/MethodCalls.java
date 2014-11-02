//Roger Blumin
//CSE2
//Lab10
//October 31, 2014
//Ths program joins numbers together



public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int number, int digit){ //method adds a single digit in front of a number
        String num = " " + number; //converts the number to a string
        int x = (num.length()-1); //find the amount of charactefs in the string
        int newNum=0; //variable that will be return
        if ((digit>=0 && digit<=9)){ //if the digit is between 1 and 9
            newNum = ((digit * (int) Math.pow(10,x))+number); //adds digit in front of number
            if(number<0){ //for negative numbers
                number= (int) Math.abs(number); //finds absolute value of negative number
                newNum = 0-((digit * (int) Math.pow(10,x-1))+number); //adds digit in front of number                
            } //end inner if
        } //end outer if
        
        else if(digit>=-9 && digit <=-1) { //for negative numbers
            if(number<0){ //for negative numbers
                number= (int) Math.abs(number); //gets absolute value of negative number
                digit= (int) Math.abs(digit); //gets absolute value of negative digit
                newNum = ((digit * (int) Math.pow(10,x-1))+number); //adds digit in front of number                
            }   //end of if  
        } //end of else if
        
        else{ //if not a single digit
            newNum=number; //sets the value to be returned equal to the original number
        } //end of else
        
        return newNum; //returns an int
        
    } //end of addDigit method
    
    public static int join(int startnum, int endnum){ //method that is used to join two number
        String num = " " + endnum; //sets the ending number to a string
        int x = (num.length()); //find the length of the ending number
        for (int i=1;i<=x; i++){ //for loop to add one digit at a time
            int digit = (startnum% (int) (Math.pow(10,i)))/(int) Math.pow(10,i-1); //gets the digits of the starting number from left to right
            endnum=addDigit(endnum,digit); //calls the addDigit to add a digit in front of the ending number
        } //end of for loop
        return endnum;
    } //end of join method
    
}  //end of class