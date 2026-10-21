import java.util.*;
public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        for(int i=word.length-1;i>=0;i--){
                System.out.print(word[i]+" ");
        }
        sc.close();
    }
}
