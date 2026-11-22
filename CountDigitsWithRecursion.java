import java.util.*;
public class CountDigitsWithRecursion {
    public static int count(int n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = sc.nextInt();
        System.out.println("Digits In a Number is = "+count(Math.abs(n)));
        sc.close();
    }
}
