public class test93_카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cd1 = 0;
        int cd2 = 0;
        boolean correct = true;
        for (int i = 0; i < goal.length; i++) {
            if (cd1 < cards1.length && goal[i].equals(cards1[cd1])) {
                cd1++;
                continue;
            } else if (cd2 < cards2.length && goal[i].equals(cards2[cd2])) {
                cd2++;
                continue;
            } else {
                correct = false;
                break;
            }
        }
        if (correct) return "Yes";
        else return "No";
    }

    public static void main(String[] args) {
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        test93_카드뭉치 sol = new test93_카드뭉치();
        System.out.println(sol.solution(card1, card2, goal));
    }
}
