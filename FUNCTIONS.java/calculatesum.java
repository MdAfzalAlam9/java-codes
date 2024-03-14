import java.util.*;;

public class calculatesum {
//     public static void calculateSum() {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("ENTER NUMBER A:");
//         int A = sc.nextInt();
//         System.out.println("ENTER NUMBER B:");
//         int B = sc. nextInt();
//         System.out.println("SUM IS :"+ (A+B));
//     }

//  public static void main(String args[]){
//     calculateSum();
//  }
// }
public static int calculateSum(int a, int b){
    int sum =(a+b);
    return sum;

}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a:");
    int a=sc.nextInt();
    System.out.println("enter b:");
    int b=sc.nextInt();
    int sum= (calculateSum(a, b));
    System.out.println("sum of a+b:"+sum);
}
}