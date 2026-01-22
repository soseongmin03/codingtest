public class test42_피보나치수열 {
    public long solution(int n){
        long answer[] = new long[n+1];
        if(n<2) return n;
        answer[0] = 0;
        answer[1] = 1;
        for(int i = 2; i<answer.length; i++){
            answer[i] = (answer[i-2]+ answer[i-1]) % 1234567;
        }
        return answer[n];
    }

    public static void main(String[] args) {
        test42_피보나치수열 sol = new test42_피보나치수열();
        System.out.println(sol.solution(5));
    }
}
