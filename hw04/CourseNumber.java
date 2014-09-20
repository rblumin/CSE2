//Roger Blumin
//September 20, 2014
//CSE 2
//hw04 program 3
//This program uses a course number to determine the year and semester of the course


import java.util.Scanner; //import scanner class

public class CourseNumber{ //class
    public static void main(String[] args) { // main method required for every Java program
    
        Scanner myScanner; //declare scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        System.out.print("Enter a six digit number giving the course semester- "); //prompts user for input
        int course = myScanner.nextInt(); //accepts input for the course
        
        if (course <186510 || course >201440){ //checks to see if user entered an integer in the range
            System.out.println("The number was outside the range [186510,201440]"); //informs the user of the error
            return; //terminates the program
        }
        
        int year = course/100; //determines year from input
        int semesterNum = course % 100; //determines semester value from input
        String semester;
        
        if(semesterNum==10){ //checks to see if numerical value of semester is 10
            semester = "Spring"; //assigns appropriate semester
        }
        
        else if(semesterNum==20){ //checks to see if numerical value of semester is 20
            semester = "Summer 1"; //assigns appropriate semester
        }
        else if(semesterNum==30){ //checks to see if numerical value of semester is 30
            semester = "Summer 2"; //assigns appropriate semester
        }
        
        else if(semesterNum==10){ //checks to see if numerical value of semester is 40
            semester = "Fall"; //assigns appropriate semester
        }
        
        else { //if all other conditions fail
            System.out.println (semesterNum + " is not a legitimate semester"); //prints out error
            return; //terminates the program
        }
        
        System.out.println("The course was offered in the " + semester + " semester of " + year); //prints out semester and year of the course


    }  //end of main method   
} //end of class