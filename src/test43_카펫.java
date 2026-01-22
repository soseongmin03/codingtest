import java.util.Arrays;

public class test43_카펫 {
    public int[] solution(int brown , int yellow){
        int[] answer = new int[2];
        int total = brown + yellow;
        int width=0,height=0;
        //가로,세로길이 구하기
        for(int i = 3; i<=Math.sqrt(total); i++){
            if(total % i == 0) {
                height = i;
                width = total/height;
                if((width-2) * (height-2) == yellow) break;
            }
        }
        answer[0] = width;
        answer[1] = height;
        return answer;
    }

    public static void main(String[] args) {
        test43_카펫 sol = new test43_카펫();
        System.out.println(Arrays.toString(sol.solution(24, 24)));
    }
}
