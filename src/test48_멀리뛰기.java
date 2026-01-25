public class test48_멀리뛰기 {
    public long solution(int n){
        if(n <= 2) return n;
        long d[] = new long[n+1];
        d[1] = 1;
        d[2] = 2;
        for(int i=3; i<d.length; i++){
            d[i] = (d[i-1] + d[i-2]) % 1234567;
        }
        return d[n];
    }
    public static void main(String[] args) {
        test48_멀리뛰기 sol = new test48_멀리뛰기();
        System.out.println(sol.solution(5));
    }
}
