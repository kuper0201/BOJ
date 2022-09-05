/*
2022.09.05. (월)
https://boj.kr/9093
"단어 뒤집기" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < s.length; j++) {
                StringBuilder b = new StringBuilder();
                sb.append(b.append(s[j]).reverse().toString() +" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
