public class test56_두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) return a;
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        for(int i = a; i<=b; i++){
            answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {
        test56_두정수사이의합 sol = new test56_두정수사이의합();
        System.out.println(sol.solution(5,3));
    }
}
