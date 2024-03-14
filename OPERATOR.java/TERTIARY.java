//pass or fail

import java.util.Scanner;

public class TERTIARY {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter your marks :");
    int marks = sc.nextInt();

    String result = marks >= 33 ? "PASS":"NIKAL PAKODE PHLI FURSAT ME NIAKL";
    System.out.println(result);
}
    
}
