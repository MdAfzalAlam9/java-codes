
import java.util.*;
public class binary_search {
    public static int binerySearch(int numbers[],int key) {
        int start=0, end=numbers.length-1;
        //loop
        while(start<=end){
            int mid=(start+end)/2;

            //compare
            if (numbers[mid]==key){ // key found
                return mid;
            }
            if (numbers[mid]<key){ // right side
                start=mid+1;
            }else{
                end=mid-1; //left side 
            }

        }
        return-1; // not found
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        Scanner sc= new Scanner (System.in);
        System.out.println("enter your key :");
        int key= sc.nextInt();
        System.out.println("key fount at index :"+binerySearch(numbers, key));

    }
    
}
