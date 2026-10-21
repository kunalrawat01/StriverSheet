import java.util.*;
public class CheckTwoStringAreEqualToNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();
         if(str1.equals(str2)){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }

        sc.close();
    }
}
