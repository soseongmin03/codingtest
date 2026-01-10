import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0;i<m;i++){
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());
            int end = n-1;
            int start = 0;
            int mid = (end+start)/2;

            while(start<=end){
                mid = (end+start)/2;
                if(a[mid] > target){
                    end = mid - 1;
                } else if (a[mid] < target) {
                    start = mid + 1;
                }else{
                    find = true;
                    break;
                }
            }

            if(find){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }

}
