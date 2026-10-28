import java.util.*;
public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Element : ");
        int target = sc.nextInt();
        boolean isfound = true;
        for(int i=0;i<n;i++){
                if(arr[i] == target){
                    isfound = false;
                    System.out.println("Target found at the index is = "+i);
                    break;
                }
                if(!isfound){
                    System.out.println("Target Element Not found : ");
                }
        }
        
        sc.close();
    }
}
