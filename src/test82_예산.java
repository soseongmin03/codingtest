import java.util.Arrays;

public class test82_예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (budget < d[i]) break;
            budget -= d[i];
            answer++;
            if (budget == 0) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        test82_예산 sol = new test82_예산();
        System.out.println(sol.solution(d, 9));
    }
}
