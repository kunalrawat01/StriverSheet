import java.util.*;
public class PrintEvenNumberOneToNwithRecursion{
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        if(n%2==0){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}