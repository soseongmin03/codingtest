import java.util.Arrays;

public class test38_이진변환반복 {
    public int[] solution(String s) {
        int transformCount = 0;
        int zeroCount = 0;
        while (!s.equals("1")) {
            int originalLength = s.length();
            // 1. 모든 0 제거 (0의 개수 계산)
            s = s.replace("0", "");
            int newLength = s.length();
            zeroCount += (originalLength - newLength);

            // 2. 길이를 2진법 문자열로 변환
            s = Integer.toBinaryString(newLength);
            transformCount++;
        }
        return new int[]{transformCount, zeroCount};
    }
    public static void main(String[] args) {
        test38_이진변환반복 sol = new test38_이진변환반복();
        System.out.println(Arrays.toString(sol.solution("110010101001")));
    }
}
