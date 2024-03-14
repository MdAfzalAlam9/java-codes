// even odd with if else
import java.util.*;
public class CONDTN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter a number :");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }

    }
}
