// sum of 1st n natural number
import java.util.*;
public class whilleloop4 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter your number:");
    int input = sc.nextInt();
    int i = 1;
   long sum= 0;
    while(i<=input){
        sum+=i;
        i++;
     System.out.println(" your sum is:: "+sum);
       
        } 
    }
}
