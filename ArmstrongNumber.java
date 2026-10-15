import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){
            int digit = temp%10;
            sum = sum+(digit*digit*digit);
            temp/=10;
        }
        if(sum == n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}
