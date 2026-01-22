
import java.util.*;

public class test45_귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(map.values());
        Collections.sort(counts, Collections.reverseOrder());
        for (int count : counts) {
            k -= count;
            answer++;

            if (k <= 0) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int tengerine[] = {1,3,2,5,4,5,2,3};
        test45_귤고르기 sol = new test45_귤고르기();
        System.out.println(sol.solution(6, tengerine));
    }

}
