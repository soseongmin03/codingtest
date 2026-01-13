import java.util.Scanner;

public class test23_퇴사준비하기 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d[] = new int[n+2];
        int t[] = new int[n+1];
        int p[] = new int[n+1];
        for(int i=1; i<=n ; i++){
            t[i] = s.nextInt();
            p[i] = s.nextInt();
        }
        for(int i=n; i>0; i--){
            if(i+t[i] > n+1){
                d[i] = d[i+1];
            }else{
                d[i] = Math.max(d[i+1], d[i+t[i]] + p[i]);
            }
        }
        System.out.println(d[1]);
    }
}
