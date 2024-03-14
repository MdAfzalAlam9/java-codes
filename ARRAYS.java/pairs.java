// pairs

import java.util.*;
public class pairs {
public static void printPairs(int numbers[]) {
    int tp=0;
    //outer loop for intail vlaues(3,5,6,7,8,9,2)
    for(int i=0;i<numbers.length;i++){
        int current=numbers[i];
        // inner loop for (i+pair values)
        for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+current+","+numbers[j]+")");
            tp++;
        }
        System.out.println();
        }
        System.out.println("total pair is :"+tp);
    } 
    
// main
public static  void main(String args[]){
    int numbers[]={3,5,6,7,8,9,2};
   printPairs(numbers);
}
}
