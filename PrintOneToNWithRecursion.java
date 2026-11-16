import java.util.*;
public class PrintOneToNWithRecursion {
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
