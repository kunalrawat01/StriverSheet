import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter an target Element : ");
        int target = sc.nextInt();
        boolean isfound = false;
        for(int i=0;i<n;i++){
             if(arr[i] == target){
                isfound = true;
                System.out.println("Found at the index of = "+i);
                break;
             }
        }
        if(!isfound){
            System.out.println("Not Found");
        }
        sc.close();
    }
}
