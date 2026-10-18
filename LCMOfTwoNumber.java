import java.util.*;
public class LCMOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int n = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int m = sc.nextInt();
        int LCM = Math.max(n ,m);
        while(LCM%n!=0 || LCM%m!=0){
            LCM++;
        }
        System.out.println("LCM = "+LCM);
        sc.close();
    }
}
