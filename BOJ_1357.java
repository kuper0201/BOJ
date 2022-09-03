/*
2022.09.03. (토)
https://boj.kr/1357
"뒤집힌 덧셈" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(new StringBuilder(s[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(s[1]).reverse().toString());

        sb.append(a + b);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}
