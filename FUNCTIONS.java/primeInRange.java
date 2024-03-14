public class primeInRange {
public static void primesInRange(int n){
    for(int i=2; i<=n; i++){
        if(n%2==0){
            System.out.println(i+"");
        }
    }
    System.out.println();
}
public static void main(String[] args) {
    primesInRange(20);
     }
}
