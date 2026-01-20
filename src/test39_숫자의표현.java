public class test39_숫자의표현 {
    private int solution(int n) {
        int count = 0, start_index = 0, end_index = 0, sum = 0;
        while(end_index <= n){
            if(sum < n){
                end_index++;
                sum += end_index;
            }else if(sum > n){
                sum -= start_index;
                start_index++;
            }else if(sum == n){
                count++;
                end_index++;
                sum+=end_index;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        test39_숫자의표현 sol = new test39_숫자의표현();
        System.out.println(sol.solution(15));
    }


}
