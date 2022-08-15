/*
2022.08.15. (월)
https://boj.kr/24510
"시간복잡도를 배운 도도" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()), max = -1;
        for(int i = 0; i < N; i++) {
            String s = br.readLine();

            s = s.replaceAll("while", "*");
            s = s.replaceAll("for", "*");

            int cnt = 0;
            for(int j = 0; j < s.length(); j++)
                if(s.charAt(j) == '*') cnt++;

            if(max < cnt) max = cnt;
        }

        System.out.println(max);
    }
}
