import java.util.*;
public class CountVovelsAndConsonantInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int vowel = 0;
        int consonant = 0;
        for(int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
              if(ch == 'a'||ch == 'i'||ch == 'o'||ch == 'e'|| ch == 'u'){
                  vowel++;
              }else if(ch >= 'a'&& ch <= 'z'){
                consonant++;
              }
        }
        System.out.println("Vowels in a String is = "+vowel);
        System.out.println("Consonant in a String = "+consonant);
        sc.close();
    }
}
