
import java.util.*;

public class test27_DFSBFS구현하기 {
    static boolean visited[];
    static ArrayList<Integer> a[];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int start = s.nextInt();

        a = new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            a[i] = new ArrayList<Integer>();
        }
        for(int i=0;i<m;i++){
            int st = s.nextInt();
            int ed = s.nextInt();
            a[st].add(ed);
            a[ed].add(st);
        }
        for(int i=1;i<=n;i++){ // 인접노드 오름차순 정렬
            Collections.sort(a[i]);
        }
        visited = new boolean[n+1];
        DFS(start);
        System.out.println();
        visited = new boolean[n+1];
        BFS(start);
        System.out.println();
    }

    private static void DFS(int node) {
        System.out.print(node+ " ");
        visited[node] = true;
        for(int i: a[node]){
            if(!visited[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while(!queue.isEmpty()){
            int now_node = queue.poll();
            System.out.print(now_node+" ");
            for(int i : a[now_node]){
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
