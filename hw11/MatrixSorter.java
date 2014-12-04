//Roger Blumin
//CSE2
//HW11
//December 1, 2014
//This sorts a ragged array


public class MatrixSorter{ //class

    public static int runCount=0; //global counter variable that is used to print output in a later method

    public static void main(String arg[]){ //main method
        int mat3d[][][]; //3d array
        mat3d=buildMat3d(); //calls to buildMat3d method to create and fill the array
        show(mat3d); //calls show method to print out the array
        System.out.println("The smallest entry in the 3D matrix is "+ findMin(mat3d)); //output statement that calls findMin method to find min value in the array
        System.out.println("After sorting the 3rd matrix we get"); //prints output
        sort(mat3d[2]); //calls sort method to sort only the third slab of the array
        show(mat3d); //reprints the entire arrray after the third slab has been sorted
    }//end main method
   
    public static int[][][] buildMat3d(){ //method that builds ragged array
        int [][][] ragged = new int [3][][]; //creates double array with five rows      
        for(int s = 0; s<3; s++){ //for loop for slabs
        	ragged[s] = new int[s*2+3][]; //assigns amount of members int each row
            for(int j = 0; j<s*2+3; j++){ //for loop for rows
            	ragged[s][j] = new int[s+j+1]; //assigns amount of members int each column
                for (int i=0; i<s+j+1; i++){ //for loop for columns
                    int rNum = (int) (Math.random() * 99+1); //generates a random number between 1 and 99 inclusive to each position of the array
            	    ragged[s][j][i] = rNum;    //assigns the random number to a particular position of the array 
                }//end column for loop
            }//end row for loop
        } //end slab for loop
    
        return ragged; //returns na 3d array
        
   } //end buildMat3d method


    public static void show(int [][][] ragged){ //method to print array
        for(int s = 0; s<3; s++){ //for loop for slabs
            
            if (runCount==1){ //checks to see if the method ran once already
                System.out.println("------------Slab 1 Unsorted"); //output statement
                runCount++; //increases value of counter varialbe by one
            } //end if
            
            else if (runCount==2){ //checks to see if the method ran twice already
                System.out.println("------------Slab 2 Unsorted"); //output statement
                runCount++; //increases value of counter variable by one
            }  //end else if          
            
            else if (runCount==3){ //checks to see if the method ran three times already
                System.out.println("------------Slab 3 Sorted"); //output statment
                runCount++; //increases value of counter variable by one
            }   //end else if
            
            else{ //else
                System.out.println("------------Slab "+ (s+1)); //output statment
            } //end else
            
            
            for(int j = 0; j<ragged[s].length; j++){ //for loop for rows
                for (int i=0; i<ragged[s][j].length; i++){ //for loop for column
            	    System.out.print(ragged[s][j][i] + " "); //prints entry of array
                } //end column for loop
                System.out.println(); //prints blank line
            } //end row for loop
            System.out.println(); //prints blank line
        }//end slab for loop
        
    }//end show method
    
    public static void sort(int [][] slab){ //method to sort array

        for(int j = 0; j<slab.length; j++){ //for loop to sort rows using selection sort
            for (int i=0; i<slab[j].length-1; i++){ //for loop to sort particular row 
                for(int k=i; k<slab[j].length; k++){ //for loop that sorts through every value of the row starting from the ith value
                    if(slab[j][i]>slab[j][k]){ //compares value of row with every value after it and evaluates the code below if a smaller value is found
                      int temp=slab[j][i]; //stores the current value in a temporary variable
                       slab[j][i] = slab[j][k]; //stores the smaller value in the current position
                       slab[j][k]=temp; //replaces the smaller value with current value that is stored in temp
                    } //end if     
                   
                }//end innermost for loop
            }//end for loop
        } //end outermost for loop
        
        
       for (int i = 1; i < slab.length; i++) { //for loop to sort columns using insertion sort
            int temp = slab[i][0]; //temp variable that stores the current value that is being compared
            int[] tempArray = slab[i];//temp array that stores the entire row that contains the current value that is being compared
            int j = i; //creates a new variable equal to the location of the current row that is being compared
            while (j > 0 && slab[j - 1][0] > temp) { //while the control variable is greater than zero
            slab[j] = slab[j - 1]; //swaps rows if a smaller value is found
                j--; //decreased value of j so that the next value is compared
            } //end while loop
            slab[j] = tempArray; //makes value of the smallest row equal to the current row
        } //end for loop for insertion sort
        
        runCount++; //increases value of counter by one

    }//end sort method

    
    public static int findMin( int [][][] ragged){ //method to find minimum value in the array
        int min=ragged[0][0][0]; //makes min equal to the first entry and the array
        for(int s = 0; s<3; s++){ //for loop for slabs
            for(int j = 0; j<s*2+3; j++){ //for loop for rows
                for (int i=0; i<s+j+1; i++){ //for loop for columns
                    if (ragged[s][j][i]<min){ //checks ti see if value of the array is smaller than the current minimum
                        min=ragged[s][j][i]; //makes value the array the new minimum
                    }//end if
                }//end columns for loop
            } //end rows for loop
        } //end slab for loop       
        
        return min; //returns the minimun value
    }//end findMin method
   
}//end class