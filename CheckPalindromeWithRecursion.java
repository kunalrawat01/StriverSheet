import java.util.*;
public class CheckPalindromeWithRecursion {
    public static int reverse(int n, int rev){
            if(n==0){
                return rev;
            }
            int digit = n%10;
            rev = rev*10+digit;
            return reverse(n/10, rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n==reverse(n, 0)){
            System.out.println("Number is Palindrome : ");
        }else{
            System.out.println("Number is not Palindrome : ");
        }
         sc.close();
    }
}
