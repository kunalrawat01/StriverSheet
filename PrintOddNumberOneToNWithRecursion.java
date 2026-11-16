import java.util.*;
public class PrintOddNumberOneToNWithRecursion {
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        if(n%2!=0){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
