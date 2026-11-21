import java.util.*;
public class BinarySearchWithRecursion {
    public static int binarySearch(int[] arr,int start,int end,int target){
            if(start > end){
                return -1;
            }
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                return binarySearch(arr,start,mid-1,target);
            }else{
                return binarySearch(arr,mid+1,end,target);
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target Element : ");
        int target = sc.nextInt();
        int result = binarySearch(arr,0,arr.length-1, target);
        System.out.println("Targte Element At This index = "+result);
        sc.close();
    }
}
