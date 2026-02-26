import java.awt.*;

public class test80_3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        String str_number = Integer.toString(n,3);

        int reverse_number = Integer.parseInt(new StringBuilder(str_number).reverse().toString(), 3);

        String number_str = Integer.toString(reverse_number,10);

        answer = Integer.parseInt(number_str);
        return answer;
    }
    public static void main(String[] args) {
        test80_3진법뒤집기 sol= new test80_3진법뒤집기();
        System.out.println(sol.solution(45));
    }
}
