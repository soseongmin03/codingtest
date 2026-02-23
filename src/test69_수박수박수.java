public class test69_수박수박수 {
    public String solution(int n) {
        String answer = "";
        for(int i=0; i<n; i++){
            if(i % 2 ==0) answer = answer + "수";
            else answer = answer + "박";
        }
        return answer;
    }
    public static void main(String[] args) {
        test69_수박수박수 sol = new test69_수박수박수();
        System.out.println(sol.solution(3));
    }
}
