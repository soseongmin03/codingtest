public class test50_예상대진표 {

    public int solution(int n, int a, int b) {
        int answer = 1;
        while((a+1)/2 != (b+1)/2 ){
            a = (a+1)/2; // (n+1)/2의 번호를 항상 배정받음
            b = (b+1)/2;
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        test50_예상대진표 sol = new test50_예상대진표();
        System.out.println(sol.solution(8,4,7));
    }


}
