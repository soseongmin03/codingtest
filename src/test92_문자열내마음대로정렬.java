import java.util.Arrays;
import java.util.Comparator;

public class test92_문자열내마음대로정렬 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if( o1.charAt(n) != o2.charAt(n)){
                    return Character.compare(o1.charAt(n),o2.charAt(n));
                }
                return o1.compareTo(o2);
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        test92_문자열내마음대로정렬 sol = new test92_문자열내마음대로정렬();
        System.out.println(Arrays.toString(sol.solution(strings, 1)));
    }
}
