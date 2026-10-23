import java.util.*;
public class IsomorphicString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("Isomorphic False : ");
            sc.close();
            return;
        }
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        boolean Isomorphic = true;
        for(int i=0;i<str1.length();i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if(map1[ch1]!=map2[ch2]){
                    Isomorphic = false;
                    break;
            }
            map1[ch1] = i+1;
            map2[ch2] = i+1;
        }
        System.out.println("Isomorphic = "+Isomorphic);
        sc.close();
    }
}