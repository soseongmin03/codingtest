public class test53_하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        if(x == 1 && x == 10000) return answer;
        String num = String.valueOf(x);
        int sum = 0;
        for(char c : num.toCharArray()){
            sum += c - '0';
        }
        if(x % sum == 0) return answer;
        else answer = false;
        return answer;
    }

    public static void main(String[] args) {
        test53_하샤드수 sol = new test53_하샤드수();
        System.out.println(sol.solution(10));
    }
}
