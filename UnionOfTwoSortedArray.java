import java.util.*;
public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Array Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter First array "+n+" Element : ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Second Array Size : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter Second array "+m+" Element : ");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(arr1[i]);
            }
            for(int i=0;i<m;i++){
                    set.add(arr2[i]);
            }
            for(int num : set){
            System.out.print(num+" ");
            }
            sc.close();
    }
}
