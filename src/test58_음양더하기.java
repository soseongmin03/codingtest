public class test58_음양더하기 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer += (absolutes[i] * -1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int absolutes[] = {4,7,12};
        boolean signs[] = {true,false,true};
        test58_음양더하기 sol = new test58_음양더하기();
        System.out.println(sol.solution(absolutes,signs));
    }
}
