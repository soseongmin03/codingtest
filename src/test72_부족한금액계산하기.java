public class test72_부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1; i<=count; i++){
            answer += (long) price *i;
        }
        return answer > money ? answer-money : 0;
    }
    public static void main(String[] args) {
        test72_부족한금액계산하기 sol = new test72_부족한금액계산하기();
        System.out.println(sol.solution(3,20,4));
    }
}
