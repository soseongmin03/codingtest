import java.util.*;

public class test52_정수내림차순배치 {
    public Long solution(long n) {
        StringBuilder answer = new StringBuilder();
        List<Character> num = new ArrayList<>();
        for(char c : String.valueOf(n).toCharArray()){
            num.add(c);
        }
        Collections.sort(num);
        Collections.reverse(num);
        for(int i=0 ; i<num.size(); i++){
            answer.append(num.get(i));
        }
        return Long.parseLong(String.valueOf(answer));
    }

    public static void main(String[] args) {
        test52_정수내림차순배치 sol = new test52_정수내림차순배치();
        System.out.println(sol.solution(118372));
    }
}
