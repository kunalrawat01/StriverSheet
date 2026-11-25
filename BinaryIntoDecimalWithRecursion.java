import java.util.*;
public class BinaryIntoDecimalWithRecursion {
    public static int BinaryToDecimal(int n){
        if(n==0){
            return 0;
        }
        return (n % 10) + 2 * BinaryToDecimal(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Decimal To Binary = "+BinaryToDecimal(n));
        sc.close();
    }
}
