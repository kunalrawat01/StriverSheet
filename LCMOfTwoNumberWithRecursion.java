import java.util.*;
public class LCMOfTwoNumberWithRecursion {
    public static int GCD(int a,int b){
            if(b==0){
                return a;
            }
            return GCD(b,a%b);
    }
    public static int LCM(int a,int b){
          return (a*b)/GCD(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("LCM Of Two Number is = "+LCM(a,b));
        sc.close();
    }
}
