import java.io.BufferedReader;
import java.util.StringTokenizer;

public class test34_최댓값최솟값 {
    String solution(String s){
        String answer ="";
        int num[] = new int[1000];
        int max=0,min=0,i=0;
        StringTokenizer st = new StringTokenizer(s);
        for(i=0;;i++){
            num[i] = Integer.parseInt(st.nextToken());
            if(!st.hasMoreTokens()) break;
        }
        max = num[0];
        min = num[0];
        for(int j = 1; j<=i;j++){
            if(max < num[j]) max = num[j];
            if(min > num[j]) min = num[j];
        }
        return answer = min + " " + max;
    }
    public static void main(String[] args) {
        test34_최댓값최솟값 sol = new test34_최댓값최솟값();
        System.out.println(sol.solution("1 2 3 4"));
    }
}
