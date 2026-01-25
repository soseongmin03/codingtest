import java.util.Arrays;

public class test49_영어끝말잇기 {
    public int[] solution(int n, String words[]){
        int answer[] = {0,0};
        int turn = 2;
        int count = 1;
        char s = words[0].charAt(words[0].length()-1); // 첫단어 마지막 알파벳
        for(int i=1; i<words.length; i++){
            for(int j=0; j<i; j++){
                if(words[i].equals(words[j])){ // 중복단어
                    answer[0] = turn;
                    answer[1] = count;
                    break;
                }
            }
            if(s != words[i].charAt(0)){ // 끝말잇기 실패
                answer[0] = turn;
                answer[1] = count;
                break;
            }
            if(turn == n){ // 한바퀴가 돌면 다시 1번부터
                turn = 1;
                count++;
            }else{
                turn++;
            }
            s = words[i].charAt(words[i].length()-1);
        }

        return answer;
    }
    public static void main(String[] args) {
        String words[] = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        test49_영어끝말잇기 sol = new test49_영어끝말잇기();
        System.out.println(Arrays.toString(sol.solution(3, words)));
    }
}
