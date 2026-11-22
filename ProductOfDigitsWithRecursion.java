import java.util.*;
public class ProductOfDigitsWithRecursion {
    public static int product(int n){
        if(n==1){
            return 1;
        }
        return (n%10)*product(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Product Of Digits is = "+product(n));
        sc.close();
    }
}
