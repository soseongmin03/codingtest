import java.util.Arrays;

public class test94_추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0;i<photo.length; i++){
            for(int j=0;j<photo[i].length; j++){
                for(int q=0; q<name.length; q++){
                    if(photo[i][j].equals(name[q])){
                        answer[i] += yearning[q];
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};
        test94_추억점수 sol = new test94_추억점수();
        System.out.println(Arrays.toString(sol.solution(name, yearning, photo)));
    }
}
