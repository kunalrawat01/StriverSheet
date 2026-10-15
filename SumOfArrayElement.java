import java.util.*;
public class SumOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter an "+n+" Elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Total Sum of Array Elements = "+sum);
        sc.close();
    }
}
