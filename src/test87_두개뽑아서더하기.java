import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test87_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!num.contains(sum)) {
                    num.add(sum);
                }
            }
        }
        num.sort(Comparator.naturalOrder());
        int[] answer = new int[num.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num.get(i);
        }
        return answer;

    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        test87_두개뽑아서더하기 sol = new test87_두개뽑아서더하기();
        System.out.println(Arrays.toString(sol.solution(numbers)));
    }
}
