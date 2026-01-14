import java.util.Scanner;

public class test26_행렬곱연산횟수의최솟값구하기 {
    static int n;
    static Matrix m[];
    static  int d[][];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = new Matrix[n+1];
        d = new int[n+1][n+1];
        for(int i = 0;i<d.length;i++){
            for(int j = 0;j<d.length;j++){
                d[i][j] = -1;
            }
        }
        for(int i=1;i<=n;i++){
            int y = s.nextInt();
            int x = s.nextInt();
            m[i] = new Matrix(y,x);
        }
        System.out.println(excute(1,n));
    }

    private static int excute(int s, int e) {
        int result = Integer.MAX_VALUE;
        if(d[s][e] != -1) return d[s][e];
        if(s == e) return 0; //행이 1개
        if((e-s) == 1) return m[s].y * m[s].x *m[e].x; // 행이2개
        for(int i=s; i<e; i++){
            int a = m[s].y * m[i].x * m[e].x;
            result = Math.min(result, excute(s,i) + excute(i+1,e) + a);
        }
        return d[s][e] = result;
    }

    static class Matrix{
        private int y;
        private int x;
        Matrix(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
}

