import java.util.*;
public class FirstAndLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target Elements : ");
        int target = sc.nextInt();
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
        if (arr[i] == target) {
        if (first == -1) {
            first = i;
        }
        last = i;
        }
     }
     System.out.println("First Occurance = "+first);
     System.out.println("Second Occuance = "+last);
        sc.close();
    }
}
