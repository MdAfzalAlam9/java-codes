// user input number
import java.util.*;
public class whileloop3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number :");
    int input = sc.nextInt();
    int counter =1;

    while(counter<= input){
        System.out.println(counter);
        counter++;
    }
}    
}
