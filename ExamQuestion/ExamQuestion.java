
public class ExamQuestion{ //class
    
    
    public static void main(String[] args){ //main method
        int[]x={1,10,3,7};
        int[]y={2,3,4,5,10,6};
        int[]z=overlap(x,y);
        for (int i=0; i<z.length; i++){
            System.out.print(z[i] + "  ");
        }
        System.out.println();
    }
    

    public static int[] overlap(int x[], int y[]){
        int count = 0;
        int max = 0;
        
        if (x.length > y.length){
            max = x.length;
        }
        else{
            max = y.length;
        }
        
        int[] result = new int [max + 1];
        
        for (int i=0; i<x.length; i++){
            for (int j = 0; j<y.length; j++){
                if (x[i]==y[j]){
                    count++;
                    result [0] = count;
                    result[i] = x[i];
                    
                }
                
            }
        }
        
        return result;
        
    }        
    
    
    
}

