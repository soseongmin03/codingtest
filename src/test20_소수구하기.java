import java.util.Scanner;

public class test20_소수구하기 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int a[] = new int[n+1];
        for(int i = 1; i<=n ; i++){
            a[i] = i;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(a[i]==0) continue;
            for(int j = i+i ; j<=n; j+=i){
                a[j] = 0;
            }
        }
        for(int i = m; i<=n; i++){
            if(a[i]!=0){
                System.out.println(a[i]);
            }
        }
    }
}
