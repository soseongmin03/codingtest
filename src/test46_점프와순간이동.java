public class test46_점프와순간이동 {
    public int solution(int n) {
        int answer = 0;
        while(n != 0){
            if(n%2 == 0){
                n = n / 2;
            }else{
                n -= 1;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        test46_점프와순간이동 sol = new test46_점프와순간이동();
        System.out.println(sol.solution(5000));
    }


}
