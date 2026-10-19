import java.util.*;
public class ReverseAStringSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.print("Reversed String is = ");
        System.out.print(Arrays.toString(ch));
        sc.close();
        }
}
