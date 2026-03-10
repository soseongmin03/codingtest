public class test97_기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int atk = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) atk++;
                else if (i % j == 0) atk += 2;
            }
            if(atk > limit) answer += power;
            else answer += atk;
        }
        return answer;
    }

    public static void main(String[] args) {
        test97_기사단원의무기 sol = new test97_기사단원의무기();
        System.out.println(sol.solution(10, 3, 2));
    }
}
