import java.util.*;
public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("Rotation = "+false);
        }else{
            String combined = str1 + str1;
            if(combined.contains(str2)){
                System.out.println("Rotation = "+true);
            }else{
                System.out.println("Rotation = "+false);
            }
        }
    }
}
