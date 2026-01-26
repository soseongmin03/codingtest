import java.util.HashSet;
import java.util.Set;

public class test51_연속부분수열합의개수 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i<=elements.length; i++){
            for(int k = 0; k<elements.length; k++) {
                int sum = 0;
                for (int j = 0; j < i; j++) {
                    sum = sum + elements[(j+k) % elements.length];
                }
                set.add(sum); // set은 자동 중복방지
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int elements[] = {7,9,1,1,4};
        test51_연속부분수열합의개수 sol = new test51_연속부분수열합의개수();
        System.out.println(sol.solution(elements));
    }
}
