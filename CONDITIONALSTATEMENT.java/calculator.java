// BASIC CALCULATOR
    
import java.util.*;
public class calculator {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter YOUR number a:");
    int a = sc.nextInt();
    System.out.println("enter your number b :");
    int b = sc.nextInt();
    System.out.println("enter your operator :");
    char operator = sc.next().charAt(0);
    switch(operator) {
    case '+' : System.out.println(a+b);
              break;
    case '-' : System.out.println(a-b);
              break;
    case '*' : System.out.println(a*b);
              break;
    case '/': System.out.println(a/b);
              break;
    case '%' : System.out.println(a%b);
              break;
    default : System.out.println("invalid please write  a valid operator");
         }
    }
    
}

