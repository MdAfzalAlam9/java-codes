// fever checker
import java.util.*;
public class feverchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your temperature:");
        double temp = sc.nextDouble();

        if(temp >= 100){
            System.out.println(" YOU HAVE FEVER");
        }
        else{
            System.out.println("YOU DONT HAVE FEVER");
        }
    }
    
}
