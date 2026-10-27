import java.util.*;
public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Array Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter First Array "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Second Array Elements : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter Second Arrat "+m+" Elements : ");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                    i++;
            }else{
                j++;
            }
        }
        sc.close();
    }
}
