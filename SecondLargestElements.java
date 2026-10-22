import java.util.*;
public class SecondLargestElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array "+n+" Element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        if(arr[i]>max){
            smax = max;
            max = arr[i];
        }else if(arr[i]<max && arr[i]>smax){
            smax = arr[i];
        }
     }
     System.out.println("Maximum Element = "+max);
     if(smax == Integer.MIN_VALUE){
        System.out.println(-1);
     }else{
        System.out.println("Second MAximum Element = "+smax);
     }
        sc.close();
    }
}
