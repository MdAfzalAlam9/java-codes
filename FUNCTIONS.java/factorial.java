public class factorial {
    public static int factorials (int n){
  int fact=1;
  for (int i=1;i<=n;i++){
    fact=fact*i;
    }
  return fact;
}

    public static void main(String[] args) {
      System.out.println(factorials(5)); // direct bhi dal skte hai
    }
}
