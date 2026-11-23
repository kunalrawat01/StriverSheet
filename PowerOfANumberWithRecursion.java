import java.util.*;
public class PowerOfANumberWithRecursion {
    public static int power(int base , int exp){
        if(exp == 0){
            return 1;
        }
        return base*power(base, exp -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base : ");
        int base = sc.nextInt();
        System.out.println("Enter a power : ");
        int exp = sc.nextInt();
        System.out.println("Power of Given Number = "+power(base, exp));
        sc.close();
    }
}
