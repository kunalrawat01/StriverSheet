import java.util.*;
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        for(int right=1;right<n;right++){
            if(arr[right]!=arr[left]){
                    left++;
                    arr[left] = arr[right];
            }
        }
        System.out.println("Array After Remove All Dupkicates = ");
        for(int k=0;k<=left;k++){
            System.out.println(arr[k]);
        }
        sc.close();
    }
}
