import java.util.*;

public class basic {
    public static void main(String[] args) {
        //declear array
        int marks[]= new int [30];
        //taking input
        Scanner sc=new Scanner (System.in);
        System.out.println("enter marks[0]");
     marks[0]= sc.nextInt();

     System.out.println("enter marks[1]");
     marks[1]= sc.nextInt();

     System.out.println("enter marks[2]");
     marks[2]= sc.nextInt();

     System.out.println("enter marks[3]");
     marks[3]= sc.nextInt();

     System.out.println("enter marks[4]");
     marks[4]= sc.nextInt();
    // output
    System.out.println("marks of physics :"+marks[0] );
    System.out.println("marks of chemistry :"+marks[0] );
    System.out.println("marks of maths :"+marks[1] );
    System.out.println("marks of IT :"+marks[2] );
    System.out.println("marks of SST :"+marks[3] );
    System.out.println("marks of urdu : :"+marks[4] );
    }
}
    