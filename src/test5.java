import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int p1=0, p2=n-1, count = 0;
        long ele[] = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<n;i++){
            ele[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ele);
        while(p1<n){
            if(p1+p2 < m){
                p1++;
            } else if (p1+p2 > m) {
                p2--;
            } else if (p1+p2 == m) {
                count++;
                p1++;
                p2++;
            }
        }
        System.out.println(count);
    }
}
