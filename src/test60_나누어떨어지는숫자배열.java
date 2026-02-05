import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test60_나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answer.add(arr[i]);
            }
        }
        if(answer.isEmpty()) return new int[]{-1};
        Collections.sort(answer);
        int answers[] = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            answers[i] = answer.get(i);
        }
        return answers;
    }
    public static void main(String[] args) {
        int arr[] = {5,9,7,10};
        test60_나누어떨어지는숫자배열 sol = new test60_나누어떨어지는숫자배열();
        System.out.println(Arrays.toString(sol.solution(arr, 5)));
    }


}
