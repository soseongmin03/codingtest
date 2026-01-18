import java.util.HashMap;
import java.util.Iterator;

public class test33_위장 {

    static public int solution(String clothes[][]){
        //옷을 종류별로 구분
        HashMap<String , Integer> map = new HashMap<>();
        for(String [] clothe : clothes){
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0)+1);
        }
        //입지않는 경우를 추가하여 경우의수 계산
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        while(it.hasNext()){
            answer *= it.next().intValue() + 1; // 특정옷을 입지않는 경우의 수 추가하기 위해 +1
        }
        //아무옷도 입지않는 경우의수 제외
        return answer-1;
    }
    public static void main(String[] args) {
        String clothes[][] = {{"yellowhat","headgear"},
                            {"bluesunglasses", "eyewear"},
                            {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
}
