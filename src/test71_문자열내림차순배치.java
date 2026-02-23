import java.util.Arrays;
import java.util.Collections;

public class test71_문자열내림차순배치 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str){
            answer += a;
        }
        return answer;
    }
    public static void main(String[] args) {
        test71_문자열내림차순배치 sol = new test71_문자열내림차순배치();
        System.out.println(sol.solution("Zbcdefg"));
    }
}
