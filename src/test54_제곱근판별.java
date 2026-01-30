public class test54_제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        long num = (long)Math.sqrt(n);
        if(num*num == n){
            answer = (num+1) * (num+1);
        }else return -1;
        return answer;
    }
    public static void main(String[] args) {
        test54_제곱근판별 sol = new test54_제곱근판별();
        System.out.println(sol.solution(121));
    }
}
