import java.util.*;
public class ReverseANumberWithRecursion {
    public static int reverse(int n, int rev) {
        if(n == 0) {
            return rev;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        return reverse(n/10, rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Reverse = "+reverse(n, 0));
        sc.close();
    }
}