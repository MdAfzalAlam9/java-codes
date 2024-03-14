// largest of three nubers
import java.util.*;
public class CONDTN3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
   // int A = 23 , B = 35 , C = 88;
   System.out.println("Enter number A");
   int A = sc.nextInt();
   System.out.println("Enter number B");
   int B = sc.nextInt();
   System.out.println("Enter number C");
   int C = sc.nextInt();
   if (A>=B && A>=C){
        System.out.println(" largest number is : A");
    }  
    else if (B>=C){
        System.out.println("largest number is : B");
    }
    else{
        System.out.println(" largest number is : C");
    }
}
    
}
