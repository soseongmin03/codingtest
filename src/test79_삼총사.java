import java.util.Arrays;

public class test79_삼총사 {
    public int solution(int[] number) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                for(int q=j+1; q<number.length; q++){
                    sum = number[i] + number[j] + number[q];
                    if(sum == 0) answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] number = {-2,3,0,2,-5};
        test79_삼총사 sol = new test79_삼총사();
        System.out.println(sol.solution(number));
    }
}
