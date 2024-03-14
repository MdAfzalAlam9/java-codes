//marks array of a student
import java.util.*;

public class marks {
public static void main(String args[]){
    int marks[] = new int[100];
    Scanner sc =new Scanner (System.in);
    System.out.println("enter marks physics :");
    marks[0]=sc.nextInt();
    System.out.println("enter marks chemistry :");
    marks[1]=sc.nextInt();
    System.out.println("enter marks maths :");
    marks[2]=sc.nextInt();
 System.out.println("marks of physics:"+marks[0]);
  System.out.println("marks of chemistry:"+marks[1]);
  System.out.println("marks of maths:"+marks[2]); 
  int percentage=(marks[0]+marks[1]+marks[2])/3;
  System.out.println("percentage :"+percentage+"%");
}
}

