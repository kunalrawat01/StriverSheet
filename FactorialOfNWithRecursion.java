import java.util.*;
public class FactorialOfNWithRecursion{
    public static int fact(int n){
            if(n==0 || n==1){
                return 1;
            }
            int ans = n*fact(n-1);
            return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size : ");
        int n = sc.nextInt();
        System.out.println("Factorial = "+fact(n));
        fact(n);
        sc.close();
    }
}