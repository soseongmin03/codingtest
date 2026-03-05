import java.util.*;


public class test91_명예의전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> board = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            board.add(score[i]);
            Collections.sort(board);
            if (board.size() > k) {
                board.remove(0);
            }
            answer[i] = board.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        test91_명예의전당 sol = new test91_명예의전당();
        System.out.println(Arrays.toString(sol.solution(3, score)));
    }
}
