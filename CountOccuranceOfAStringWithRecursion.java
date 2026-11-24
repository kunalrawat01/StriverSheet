import java.util.*;
public class CountOccuranceOfAStringWithRecursion {
    public static void Count(String str,int index,int[] freq){
            if(index == str.length()){
                return ;
            }
            freq[str.charAt(index) - 'a']++;
            Count(str,index+1,freq);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String : ");
        String str = sc.nextLine().toLowerCase();
        int[] freq = new int[26];
        Count(str,0,freq);
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i)) == i){
                 System.out.println("Occurance of A String : "+str.charAt(i)+" = "+freq[str.charAt(i) - 'a']);
            }
        }
        sc.close();
    }
}
