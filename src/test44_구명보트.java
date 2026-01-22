import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class test44_구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        while(start <= end){
            if(people[end] + people[start] <= limit){
                answer++;
                end--;
                start++;
            }else{
                answer++;
                end--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int people[] = {70, 50, 50, 80};
        test44_구명보트 sol = new test44_구명보트();
        System.out.println(sol.solution(people, 100));
    }


}
