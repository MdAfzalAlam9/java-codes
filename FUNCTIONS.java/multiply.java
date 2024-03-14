// multiply a b
import java.util.*;
public class multiply {
    public static int multiPly(int a, int b){
        int product=(a*b);
        return (product);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt(45);
       int product= multiPly(19, 29);
    System.out.println("product of a+b:"+product);
    }
    
}
