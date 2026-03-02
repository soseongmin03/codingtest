import java.util.ArrayList;
import java.util.Arrays;

public class test89_k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] num = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(num);
            answer[i] = num[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands ={{2,5,3},{4,4,1},{1,7,3}};
        test89_k번째수 sol = new test89_k번째수();
        System.out.println(Arrays.toString(sol.solution(array, commands)));
    }
}
