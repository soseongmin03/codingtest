import java.util.Arrays;

public class test65_제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length-1 == 0) {
            int n[] = {-1};
            return n;
        }
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]) min = arr[i];
        }
        int n=0;
        for(int i=0; i<arr.length; i++){
            if(min == arr[i]) continue;
            answer[n] = arr[i];
            n++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int num[] = {4,3,2,1};
        test65_제일작은수제거하기 sol = new test65_제일작은수제거하기();
        System.out.println(Arrays.toString(sol.solution(num)));
    }
}
