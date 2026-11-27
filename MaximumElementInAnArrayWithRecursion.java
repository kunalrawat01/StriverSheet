import java.util.*;
public class MaximumElementInAnArrayWithRecursion {
    public static int MAX(int arr[],int index){
            if(index == arr.length-1){
                return arr[index];
            }
            int max = MAX(arr,index+1);
            if(arr[index] > max){
                return arr[index];
            }else{
                return max;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  A Number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an Array "+n+"Élement : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = MAX(arr,0);
        System.out.println("Maximum Element is = "+result);
        sc.close();
    }
}
