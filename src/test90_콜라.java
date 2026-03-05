public class test90_콜라 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int add = n/a;
            answer += add*b;
            n -= add*a;
            n += add*b;
        }
        return answer;
    }
    public static void main(String[] args) {
        test90_콜라 sol = new test90_콜라();
        System.out.println(sol.solution(3,1,20));
    }
}
