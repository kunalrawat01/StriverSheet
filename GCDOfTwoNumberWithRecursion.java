import java.util.*;
public class GCDOfTwoNumberWithRecursion {
    public static int GCD(int a, int b){
            if(b==0){
                return a;
            }
            return GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();
        System.out.println("GCD OF Two NUmber is = "+GCD(a,b));
        sc.close();
    }
}
