import java.util.*;
public class SumFromOneToNWithRecursion {
    public static void print(int n,int sum){
        if(n==0){
            return;
        }
        sum+=n;
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
    }
}
