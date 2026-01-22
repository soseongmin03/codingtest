public class test47_n개의최소공배수 {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = LCM(answer, arr[i]); //두 수씩 최소공배수를 구하기
        }
        return answer;
    }
    public int LCM(int n, int b) {
        int max = Math.max(n,b);
        int m=1;
        for(int i=max; i>0; i--){
            if(n%i == 0 && b%i == 0){
                m=i;
                break;
            }
        }
        return n*(b/m);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        test47_n개의최소공배수 sol = new test47_n개의최소공배수();
        System.out.println(sol.solution(arr));
    }


}
