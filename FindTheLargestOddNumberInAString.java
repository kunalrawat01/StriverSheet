import java.util.*;
public class FindTheLargestOddNumberInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch%2!=0){
                System.out.println("Largest Odd Number = "+str.substring(0,i+1));
                sc.close();
                return;
            }
        }
        sc.close();
    }
}
