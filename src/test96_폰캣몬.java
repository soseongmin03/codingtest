import java.util.Stack;

public class test96_폰캣몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = nums.length / 2;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (!st.contains(nums[i])) {
                st.add(nums[i]);
                answer++;
            }
            if (st.size() == cnt) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};
        test96_폰캣몬 sol = new test96_폰캣몬();
        System.out.println(sol.solution(nums));
    }
}
