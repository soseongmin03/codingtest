import java.util.Arrays;

public class test95_비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i< answer.length; i++){
            String bin1 = Integer.toBinaryString(arr1[i]);
            String bin2 = Integer.toBinaryString(arr2[i]);
            bin1 = String.format("%" + n + "s", bin1).replace(' ', '0');
            bin2 = String.format("%" + n + "s", bin2).replace(' ', '0');
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<bin1.length(); j++){
                if(bin1.charAt(j) == '1' || bin2.charAt(j) == '1'){
                    sb.append('#');
                }else{
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        test95_비밀지도 sol = new test95_비밀지도();
        System.out.println(Arrays.toString(sol.solution(5, arr1, arr2)));
    }
}
