// max sub array sum   not anwr

import java.util.*;

public class MAXsubArraySum {
    public static void printSubarraySum(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        
        // outer loop
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i; j<numbers.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
            //sub array sum
            currentSum+=numbers[k];
            }
        if (maxSum<currentSum){
            maxSum=currentSum;
        }
    }
}
         System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        printSubarraySum(numbers);
    }
}
