//do while loop
import java.util.*;
public class dowhileloop {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    do{
        System.out.println("ENETR YOUR NUMBER:");
        int n =sc.nextInt();
        if(n%10==0){
            break;
        }
        System.out.println(n);
    } while(true);
}   
}
