import java.util.*;
public class ValidAnagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length()){
               System.out.println("Valid Anagram = "+false);
               sc.close();
               return;
        }
        int[] count = new int[26];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }
        boolean isAnagram = true;
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                isAnagram = false;
                break;
            }
        }
        System.out.println("Valid Anagram = "+isAnagram);
        sc.close();
    }
}