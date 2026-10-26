import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an Array "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long totalsum = 0;
        for(int i=0;i<n;i++){
                totalsum+=arr[i];
        }
        long actualsum = (long)n*(n+1)/2;
        long MissingNumber = actualsum-totalsum;
        System.out.println("Missing number = "+MissingNumber);
        sc.close();
    }
}
