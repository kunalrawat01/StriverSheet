import java.util.*;
public class CountPrimeNumberBetweenOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = sc.nextInt();
        int primecount = 0;
        for(int i=2;i<=n;i++){
            int count = 0;
              for(int j=1;j<=i;j++){
                        if(i%j==0){
                            count++;
                        }
              }
               if(count == 2){
                   primecount++;
            }
        }
        System.out.println("Total Prime Number = "+primecount);
        sc.close();
    }
}
