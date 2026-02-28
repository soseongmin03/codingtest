import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test84_가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> Map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!Map.containsKey(c)) {
                answer[i] = -1;
            }
            else{
                answer[i] = i - Map.get(c);
            }
            Map.put(c, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        test84_가장가까운같은글자 sol = new test84_가장가까운같은글자();
        System.out.println(Arrays.toString(sol.solution("banana")));
    }
}
