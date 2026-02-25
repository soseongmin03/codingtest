import java.util.ArrayList;
import java.util.Arrays;

public class test76_같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(i==0) {
                ar.add(arr[0]);
                continue;
            }
            if(arr[i-1] != arr[i]) {
                ar.add(arr[i]);
            }
        }
        answer = new int[ar.size()];
        for(int i=0; i<ar.size(); i++){
            answer[i] = ar.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        test76_같은숫자는싫어 sol = new test76_같은숫자는싫어();
        System.out.println(Arrays.toString(sol.solution(arr)));
    }
}
