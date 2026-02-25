import java.util.Arrays;

public class test77_최대공약수와최소공배수 {
    public long[] solution(int n, int m) {
        long[] answer = {0,0};
        int mul = m*n;
        while(m != 0){
           int temp = m;
           m = n%m;
           n = temp;
        }
        answer[0] = n;
        answer[1] = (mul) / n;
        return answer;
    }

    public static void main(String[] args) {
        test77_최대공약수와최소공배수 sol = new test77_최대공약수와최소공배수();
        System.out.println(Arrays.toString(sol.solution(5, 2)));
    }
}
