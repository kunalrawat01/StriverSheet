import java.util.*;
public class ReverseAStringWIthRecurion {
    public static String reverse(String str){
        if(str.length()==0 || str.length()==1){
            return str;
        }
        return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Reverse String is = "+reverse(str));
        sc.close();
    }
}
