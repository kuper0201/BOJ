/*
2022.08.25. (목)
https://boj.kr/1977
"완전제곱수" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        long min = -1;
        for(double i = M; i <= N; i++) {
            long sq = (long)Math.sqrt(i);

            if(sq * sq == i) {
                sum += i;
                if(min == -1) min = (long) i;
            }
        }

        if(min != -1) {
            System.out.println(sum);
            System.out.println(min);
        } else System.out.println("-1");
    }
}
