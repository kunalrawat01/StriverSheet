import java.util.*;
public class ArrayisSortedOrNot {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter an array "+n+" Elements : ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean issorted = true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    issorted = false;
                    break;
                }
            }
            if(issorted){
                System.out.println("Array is sorted : ");
            }else{
                System.out.println("Array is not sorted : ");
            }
            sc.close();
        }  
}
