/*
2022.09.04. (일)
https://boj.kr/9316
"Hello Judge" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) sb.append("Hello World, Judge " +(i + 1) +"!\n");

        System.out.println(sb);
    }
}
