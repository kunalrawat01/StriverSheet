import java.util.*;
public class ReturnTheLargestDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int max = 0;
        while(n!=0){
            int lastdigit = n%10;
            if(lastdigit>max){
                max = lastdigit;
            }
            n/=10;
        }
        System.out.println("Largest Digit In A Number = "+max);
        sc.close();
    }
}
