public class test62_콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        int i;
        Long number = (long) num;
        if(num == 1)return 0;
        for(i=1; i!=500; i++){
            if(number%2 == 0){
                number /= 2;
            }else{
                number = (number*3) + 1;
            }
            if(number == 1){
                answer = i;
                break;
            }
        }
        if(i == 500) return -1;
        return answer;
    }
    public static void main(String[] args) {
        test62_콜라츠추측 sol = new test62_콜라츠추측();
        System.out.println(sol.solution(6));
    }
}
