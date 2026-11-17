import java.util.*;
public class SumFromOneToNWithRecursion {
    public static int print(int n,int sum){
        if(n==0){
            return sum;
        }
        sum+=n;
        return print(n-1, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Sum = "+print(n, 0));
        sc.close();
    }
}
