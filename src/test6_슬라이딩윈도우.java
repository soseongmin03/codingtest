import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test6_슬라이딩윈도우 {
    static int nowArr[] = new int[4]; // 현재 문자열의 문자 카운팅
    static int checkArr[] = new int[4]; // 조건
    static int check = 0; // 얼마나 일치하는지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()); // 문자열 전체 길이
        int p = Integer.parseInt(st.nextToken()); // 암호로 사용할 문자열의 길이
        int result = 0; // 가능한 문자열 갯수
        char a[] = new char[s]; // 문자열 전체 저장
        a = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<4;i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) check++;
        }
        for(int i = 0; i<p;i++){ //초기 0~p 까지의 문자열 유효성 검사
            Add(a[i]);
        }
        if(check == 4) result++;
        for(int i = p;i<s;i++){
            int j = i-p;
            Add(a[i]);
            Remove(a[j]);
            if(check == 4) result++;
        }
        System.out.println(result);
        br.close();
    }
    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(nowArr[0] == checkArr[0]) check--;
                nowArr[0]--;
                break;
            case 'C':

                if(nowArr[1] == checkArr[1]) check--;
                nowArr[1]--;
                break;
            case 'G':

                if(nowArr[2] == checkArr[2]) check--;
                nowArr[2]--;
                break;
            case 'T':
                if(nowArr[3] == checkArr[3]) check--;
                nowArr[3]--;
                break;
        }
    }
    private static void Add(char c) {
        switch (c){
            case 'A':
                nowArr[0]++;
                if(nowArr[0] == checkArr[0]) check++;
                break;
            case 'C':
                nowArr[1]++;
                if(nowArr[1] == checkArr[1]) check++;
                break;
            case 'G':
                nowArr[2]++;
                if(nowArr[2] == checkArr[2]) check++;
                break;
            case 'T':
                nowArr[3]++;
                if(nowArr[3] == checkArr[3]) check++;
                break;
        }
    }
}
