import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class test16 {
    //0일때 아래 1일때 오른쪽 2일때 위쪽 3일때 왼쪽 탐색을 위한 인덱스 지정
    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};
    static boolean visited[][];
    static int a[][];
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0;i<n; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0;j<m;j++){
                a[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(a[n-1][m-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        while(!queue.isEmpty()){
            int now[] = queue.poll(); //queue 에는 인자로 받은 현재 x,y좌표가 저장되어있다 now[0]에는 x값 now[y] 에는 y값이 저장됨
            visited[i][j] = true;
            for(int k = 0;k<4;k++){//상하좌우탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<n && y<m){ // 배열범위
                    if(a[x][y]!=0 && !visited[x][y]){ // 갈수 없거나 방문한곳
                        visited[x][y] = true;
                        a[x][y] = a[now[0]][now[1]] + 1; //깊이 표시
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
