import java.util.*;
public class GCDOfTwoNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int n = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int m = sc.nextInt();
        int GCD = 1; 
        for(int i=1;i<=n;i++){
                if(n%i==0 && m%i==0){
                    GCD = i;
                }
        }
        System.out.println("GCD = "+GCD);
        sc.close();
    }
}