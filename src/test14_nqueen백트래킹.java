import java.util.Scanner;

public class test14_nqueen백트래킹 {
    static int[] a;
    static int n;
    static int cnt = 0;



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        a = new int[n];
        backtracking(0);
        System.out.println(cnt);
    }

    private static void backtracking(int row) {
        if(row == n){
            cnt++;
            return;
        }
        for(int i = 0; i<n; i++){ // 모든 경우의 수 탐색
            a[row] = i;
            if(check(row)){ // 가지치기 검사
                backtracking(row+1);
            }
        }
    }

    private static boolean check(int row) {
        for(int i = 0 ; i<row ; i++){
            if(a[i] == a[row]) return false; // 일직선상
            if(Math.abs(row-i) == Math.abs(a[row]-a[i])) return false;
        }
        return true;
    }
}
