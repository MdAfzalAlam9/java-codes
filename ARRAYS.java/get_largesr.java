

import java.util.*;
public class get_largesr {
    public static int getLargest(int numbers[]) {
    
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int n =numbers.length;
        //loop
        for(int i=0;i<n;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];

            }
        }
        System.out.println("largest value is:"+largest);
        System.out.println("smallest value is:"+smallest);
        
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println(getLargest(numbers));
    }
        
    }

