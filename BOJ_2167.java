/*
2022.09.08. (목)
https://boj.kr/2167
"2차원 배열의 합" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++) {
            s = br.readLine().split(" ");
            for(int j = 0; j < N; j++) arr[i][j] = Integer.parseInt(s[j]);
        }

        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
            s = br.readLine().split(" ");
            int sx = Integer.parseInt(s[0]) - 1;
            int sy = Integer.parseInt(s[1]) - 1;
            int ex = Integer.parseInt(s[2]) - 1;
            int ey = Integer.parseInt(s[3]) - 1;

            int sum = 0;
            for(int j = sx; j <= ex; j++)
                for(int k = sy; k <= ey; k++)
                    sum += arr[j][k];

            sb.append(sum +"\n");
        }

        System.out.println(sb);
    }
}
