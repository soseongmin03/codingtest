import java.util.Scanner;

public class test24_2xn타일채우기 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long d[] = new long[1001];
        d[1] = 1;
        d[2] = 2;

        for(int i=3;i<=n;i++){
            d[i] = (d[i-1] + d[i-2]) % 10007;
        }
        System.out.println(d[n]);
    }
}
