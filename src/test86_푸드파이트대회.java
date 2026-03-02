public class test86_푸드파이트대회 {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer.append(i);
            }
        }
        answer.append('0');
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer.append(i);
            }
        }
        return String.valueOf(answer);

    }

    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        test86_푸드파이트대회 sol = new test86_푸드파이트대회();
        System.out.println(sol.solution(food));
    }
}
