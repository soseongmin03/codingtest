import java.util.*;

public class test8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Queue<Integer> card = new LinkedList<>();
        for(int i = 1; i<=n;i++){
            card.add(i);
        }
        while(card.size() > 1){
            card.poll();
            card.add(card.poll());
        }
        System.out.println(card.poll());
    }
}
