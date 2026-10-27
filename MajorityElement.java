import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count;
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                if(count>n/2){
                    System.out.println("Majority Element is = "+arr[i]);
                    sc.close();
                    return;
                }
            }
        }
        sc.close();
    }
}
