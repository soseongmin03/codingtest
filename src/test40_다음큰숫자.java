import java.awt.event.ActionListener;
import java.util.Arrays;

public class test40_다음큰숫자 {
    public int solution(int n){
        int answer = 0;
        String bin = Integer.toBinaryString(n);
        String one = bin.replace("0","");
        while(true){
            n++;
            String bin2 = Integer.toBinaryString(n);
            String one2 = bin2.replace("0","");
            if(one.equals(one2)) break;
        }
        answer = n;
        return answer;
    }

    public static void main(String[] args) {
        test40_다음큰숫자 sol = new test40_다음큰숫자();
        System.out.println(sol.solution(78));
    }
}
