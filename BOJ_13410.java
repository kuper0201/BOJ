/*
2022.08.24. (수)
https://boj.kr/13410
"거꾸로 구구단" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= N; i++) {
            StringBuilder t = new StringBuilder();
            t.append(M * i).reverse();

            int num = Integer.parseInt(t.toString());
            if(num > max) max = num;
        }

        System.out.println(max);
    }
}
