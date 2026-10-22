import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String Size : ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter an String "+n+" Elements : ");
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        if(n==0){
            System.out.println("Longest Common Prefix");
            sc.close();
            return;
        }
        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[str.length-1];
        int index = 0;
        while(index < str1.length() && index <str2.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        String prefix = str1.substring(0,index);
        System.out.println("Longest Common Prefix = "+prefix);
        sc.close();
    }
}
