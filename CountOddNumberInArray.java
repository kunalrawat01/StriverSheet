import java.util.*;
public class CountOddNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int Oddcount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                Oddcount++;
            }
        }
        System.out.println("Total Odd Number in Array = "+Oddcount);
        sc.close();
    }
}
