public class test59_없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean find = false;
        for(int i=1; i<10; i++){
            for(int j=0; j<numbers.length; j++){
                if(numbers[j] == i) find = true;
            }
            if(!find){
                answer += i;
            }
            find = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,6,7,8,0};
        test59_없는숫자더하기 sol = new test59_없는숫자더하기();
        System.out.println(sol.solution(numbers));
    }


}
