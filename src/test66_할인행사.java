import java.util.HashMap;
import java.util.Map;

public class test66_할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wanted = new HashMap<>();
        for(int i=0; i<want.length; i++){
            wanted.put(want[i],number[i]);
        }
        for(int i=0; i<10;i++){
            String newone = discount[i];
            if(wanted.containsKey(newone)){
                wanted.put(newone,wanted.get(newone)-1);
            }
        }
        int left = 0;
        int right = 10;
        while(right <= discount.length){
            boolean flag = false;
            for(int i=0; i<want.length; i++){
                if(wanted.containsKey(want[i]) && wanted.get(want[i])!=0) flag = true;
            }
            if(!flag) answer++;
            //왼쪽 제거
            String leftFood=discount[left];
            if (wanted.containsKey(leftFood)) {
                wanted.put(leftFood , wanted.get(leftFood)+1);
            }

            //오른쪽 추가
            if (right < discount.length) {
                String rightFood=discount[right];
                if (wanted.containsKey(rightFood)) {
                    wanted.put(rightFood , wanted.get(rightFood)-1);
                }
            }
            // 인덱스 증가
            left++;
            right++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String discount[] = {"chicken", "apple", "apple", "banana", "rice",
                "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        String  want[] = {"banana", "apple", "rice", "pork", "pot"};
        int number[] = {3,2,2,2,1};
        test66_할인행사 sol = new test66_할인행사();
        System.out.println(sol.solution(want,number,discount));
    }
}
