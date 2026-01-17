public class test31_문자열압축 {
    static public int soluation(String s){
        int answer = s.length();
        for(int i=1 ; i<s.length()/2; i++){ //반복되는 문자열의 길이가 s.length의 절반을 넘을 수없음
            int pos = 0;
            int len = s.length();

            for( ; pos+i <= s.length();){ // 0~i까지의 문자열을 잘라서 unit에 저장
                String unit = s.substring(pos, pos+i);
                pos += i;

                int cnt = 0;
                for( ; pos+i <= s.length();){ // i~i+i까지의 문자열을 잘라 비교함 맞으면 cnt증가
                    if(unit.equals(s.substring(pos,pos+i))){
                        cnt++;
                        pos+=i;
                    }else{
                        break;
                    }
                }
                if(cnt > 0){ // cnt의 값에 따라 len의 값을 변경해줌
                    len -= i*cnt;
                    if(cnt < 9) len+=1;
                    else if(cnt < 99) len+=2;
                    else if(cnt < 999) len+=3;
                    else len+=4;
                }
            }
            answer = Math.min(answer, len); //상위 루프가 돌때마다 answer의 값을 갱신함
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(soluation("aabbaccc"));
    }
}
