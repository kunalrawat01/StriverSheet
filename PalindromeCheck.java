import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
             System.out.println("false");
             sc.close();
             return;
            }
            left++;
            right--;
        }
        System.out.println("true");
        sc.close();
    }
}

 // import java.util.*;
// public class PalindromeCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String rev = "";
//         for(int i=str.length()-1;i>=0;i--){
//             rev+=str.charAt(i);
//         }
//         if(rev.equals(str)){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
//         sc.close();
//     }
// }