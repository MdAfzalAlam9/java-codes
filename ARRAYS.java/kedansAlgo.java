// kedans Algorithm
import java.util.*;
public class kedansAlgo {
    public static void kedans(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        // loop
        for(int i=0;i<numbers.length;i++){
            currSum+=numbers[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum, maxSum);
            System.out.println(currSum);// current sum of all sub arrays
        }
        System.out.println("our max sub array is :"+maxSum); // max sum in alla the sub arrays
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        kedans(numbers);
    }
}
