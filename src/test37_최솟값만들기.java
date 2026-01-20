import java.util.Arrays;

public class test37_최솟값만들기 {
    int solution(int[] a, int[] b) {
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int j = b.length-1;
        for(int i=0;i<a.length;i++){
            int index = a[i] * b[j];
            answer += index;
            j--;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a[] = new int[]{54, 22, 12, 32, 54, 45, 21, 15, 64, 31};
        int b[] = new int[]{5,2,23,1,55,31,22,66,44,12};
        test37_최솟값만들기 sol = new test37_최솟값만들기();
        System.out.println(sol.solution(a,b));
    }

}
