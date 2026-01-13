import java.io.*;
import java.util.StringTokenizer;

public class test25_연속된정수의합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        int l[] = new int[n];
        l[0] = a[0];
        int result = l[0];
        int r[] = new int[n];
        r[n-1] = a[n-1];
        for(int i=1; i<n; i++){
            l[i] = Math.max(a[i], l[i-1] + a[i]);
            result = Math.max(result, l[i]);
        }
        for(int i=n-2; i>=0; i--){
            r[i] = Math.max(a[i], r[i+1] + a[i]);
        }
        for(int i=1; i<n-1;i++){
            int temp = l[i-1] + r[i+1];
            result = Math.max(result, temp);
        }
        System.out.println(result);
    }
}
