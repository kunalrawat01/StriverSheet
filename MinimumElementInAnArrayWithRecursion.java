import java.util.*;
public class MinimumElementInAnArrayWithRecursion {
    public static int MIN(int arr[],int index){
            if(index == arr.length-1){
                return arr[index];
            }
        int min = MIN(arr,index+1);
        if(arr[index]<min){
            return arr[index];
        }else{
            return min;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = MIN(arr,0);
        System.out.println("Minimum Element In Array = "+result);
        sc.close();
    }
}
