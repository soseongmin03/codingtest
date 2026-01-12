import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class test21_이분그래프판별 {
    static ArrayList<Integer> a[];
    static  int check[];
    static boolean visited[];
    static boolean isEven;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for(int t=0; t<testcase; t++){
            String s[] = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int e = Integer.parseInt(s[1]);
            a = new ArrayList[v+1];
            visited = new boolean[v+1];
            check = new int[v+1];
            isEven = true;
            for(int i=1; i<=v ; i++){
                a[i] = new ArrayList<Integer>();
            }
            //에지데이터저장
            for(int i=0;i<e;i++){
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                a[start].add(end);
                a[end].add(start);
            }
            //모든노드에서dfs실행
            for(int i=1; i<=v ; i++){
                if(isEven) DFS(i);
                else break;
            }
            if(isEven) System.out.println("yes");
            else System.out.println("no");
        }
    }

    private static void DFS(int node) {
        visited[node] = true;
        for(int i : a[node]){
            if(!visited[i]){
                // 바로 직전에 있는 노드와 다른집합으로 분리
                check[i] = (check[node] + 1) % 2;
                DFS(i);
            }else{
                if(check[node] == check[i]) isEven=false;
            }
        }
    }
}
