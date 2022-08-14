/*
2022.08.14. (일)
https://boj.kr/23756
"노브 돌리기" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int set = Integer.parseInt(br.readLine()), total = 0;
        for(int i = 0; i < N; i++) {
            int t = Integer.parseInt(br.readLine());
            total += Math.min(Math.min(Math.abs(set - t), Math.abs(360 - set + t)), Math.abs(set + 360 - t));
            set = t;
        }

        System.out.println(total);
    }
}
