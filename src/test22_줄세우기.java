import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test22_줄세우기 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i = 0; i<=n ; i++){
            a.add(new ArrayList<>());
        }
        int indegree[] = new int[n+1];
        for(int i = 0; i<m ; i++){
            int w = s.nextInt();
            int e = s.nextInt();
            a.get(w).add(e);
            indegree[e]++;
        }
        //위상정렬
        Queue<Integer> queue = new LinkedList<>();
        for(int i =1; i<=n; i++){
            if(indegree[i]== 0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.println(now);
            for(int next : a.get(now)){
                indegree[next]--;
                if(indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
    }
}
