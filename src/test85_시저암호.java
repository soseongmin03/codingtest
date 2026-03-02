public class test85_시저암호 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char a : s.toCharArray()) {
            if (a == ' ') {
                answer.append(a);
                continue;
            }
            for (int i = 0; i < n; i++) {
                a = (char) (a + 1);
                if (a == 'z' + 1) a = 'a';
                if (a == 'Z' + 1) a = 'A';
            }
            answer.append(a);
        }
        return String.valueOf(answer);

    }

    public static void main(String[] args) {
        test85_시저암호 sol = new test85_시저암호();
        System.out.println(sol.solution(" Z B", 2));
    }
}
