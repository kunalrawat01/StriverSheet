import java.util.*;
public class MoveZeroesToTheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array "+n+" Elements : ");
        for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
        }
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=index;i<n;i++){
                arr[i] = 0;
        }
        System.out.println("Array After Move Zeroes To The End = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
