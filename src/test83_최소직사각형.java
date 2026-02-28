import java.util.Arrays;

public class test83_최소직사각형 {
    public int solution(int[][] sizes) {
        int wmax = 0, hmax = 0;
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            if (wmax < sizes[i][0]) wmax = sizes[i][0];
            if (hmax < sizes[i][1]) hmax = sizes[i][1];
        }
        return wmax * hmax;
    }

    public static void main(String[] args) {
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        test83_최소직사각형 sol = new test83_최소직사각형();
        System.out.println(sol.solution(sizes));
    }
}
