import javax.swing.text.Style;

public class test88_숫자문자열과영단어 {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        StringBuilder number = new StringBuilder();
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a >= '0' && a <= '9') number.append(a);
            else {
                for (int j = 0; j < words.length; j++) {
                    if (s.startsWith(words[j], i)) {
                        number.append(j);
                        i += words[j].length() - 1;
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(String.valueOf(number));

    }

    public static void main(String[] args) {
        test88_숫자문자열과영단어 sol = new test88_숫자문자열과영단어();
        System.out.println(sol.solution("one4seveneight"));
    }
}
