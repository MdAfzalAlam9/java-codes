//sum of all nth terms
import java.util.*;
public class lopsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();
        int sum = 0;
        int counter = 1;
    while(counter<=number){ 
        sum+= counter;
        counter++;
    }
System.out.println("your sum is:"+sum);   
}

    
}
