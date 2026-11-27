import java.util.*;
public class LinearSearchWithRecursion {
    public static int LinearSearch(int arr[],int index , int target){
            if(index == arr.length){
                return -1;
            }
            if(arr[index] == target){
                return index;
            }
            return LinearSearch(arr,index+1,target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an Array "+n+"Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a Target : ");
        int target = sc.nextInt();
        int result = LinearSearch(arr,0,target);
        if(result == -1){
            System.out.print(" Element Not Found : ");
        }else{
            System.out.print("Element Found = "+result);
        }
        System.out.println();
        sc.close();
    }
}
