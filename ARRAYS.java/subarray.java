// sub arays
import java.util.*;

public class subarray {
public static void printsubArrays(int numbers[]){
    int ts=0;
    for(int i=0; i<numbers.length;i++){
    int start=i;
       for(int j=i;j<numbers.length;j++){
        int end=j;
           for (int k=start;k<=end;k++){
            System.out.print(numbers[k]);
            ts++;
           }
        System.out.println();
        }
    }
         System.out.println("total sub arrays are :"+ts);
}
// main
   public static void main(String args[]){
    int numbers[]={2,4,6,7,8,9,3,4};
    printsubArrays(numbers);
   }
}
   








