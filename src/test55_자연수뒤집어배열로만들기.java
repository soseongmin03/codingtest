import java.util.Arrays;

public class test55_자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        int i=num.length()-1;
        for(char c: num.toCharArray()){
            answer[i] = c - '0';
            if(i == 0) break;
            i--;
        }
        return answer;
    }
    public static void main(String[] args) {
        test55_자연수뒤집어배열로만들기 sol = new test55_자연수뒤집어배열로만들기();
        System.out.println(Arrays.toString(sol.solution(12345)));
    }
}
