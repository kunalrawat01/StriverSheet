import java.util.*;
public class DecimalToBinaryWithRecursion {
    public static void DecimalToBinary(int n){
        if(n==0){
            return;
        }
        DecimalToBinary(n/10);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.print("Binary : 0 ");
        }else{
            System.out.print("Binary : ");
        }
        DecimalToBinary(n);
        sc.close();
    }
}
