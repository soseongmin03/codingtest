public class test70_약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for(int p = left; p<=right; p++){
            for(int i = 1; i<=p; i++){
                if(p % i == 0) count++;
            }
            if(count % 2 == 0) answer += p;
            else answer -= p;
            count = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        test70_약수의개수와덧셈 sol = new test70_약수의개수와덧셈();
        System.out.println(sol.solution(13,17));
    }
}
