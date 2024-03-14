// bill for  customer
import java.util.Scanner;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost of 1st item");
       float pencil = sc.nextFloat();
        System.out.println("enter cost of 2nd item");
       float pen = sc.nextFloat();  
         System.out.println("enter cost of 3rd item");
       float erasor = sc.nextFloat();
         float total = (pencil + pen + erasor);
         System.out.println(" bill is :"+total);
   // with 18% gst
float neTotal = total+(0.18f*total);
   System.out.println( "with gst :"+" "+ neTotal +" " +"me to tut gya bhai kangal ho gya" ); 
}
}