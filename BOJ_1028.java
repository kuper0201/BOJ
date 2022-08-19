/*
2022.08.19. (금)
https://boj.kr/1028
"다이아몬드 광산" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        int[][] map = new int[M][N];
        int[][] ltou = new int[M][N];
        int[][] ltod = new int[M][N];
        int[][] rtou = new int[M][N];
        int[][] rtod = new int[M][N];

        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            for(int j = 0; j < N; j++) map[i][j] = str.charAt(j) - '0';
        }

        for(int i = 0; i < M; i++) {
            for(int j = N - 1; j >= 0; j--) {
                if(i == 0 || j == N - 1) ltou[i][j] = map[i][j];
                else if(map[i][j] == 1) ltou[i][j] = ltou[i - 1][j + 1] + 1;
            }
            for(int j = 0; j < N; j++) {
                if(i == 0 || j == 0) ltod[i][j] = map[i][j];
                else if(map[i][j] == 1) ltod[i][j] = ltod[i - 1][j - 1] + 1;
            }
        }

        for(int i = M - 1; i >= 0; i--) {
            for(int j = N - 1; j >= 0; j--) {
                if(i == M - 1 || j == N - 1) rtou[i][j] = map[i][j];
                else if(map[i][j] == 1) rtou[i][j] = rtou[i + 1][j + 1] + 1;
            }
            for(int j = 0; j < N; j++) {
                if(i == M - 1 || j == 0) rtod[i][j] = map[i][j];
                else if(map[i][j] == 1) rtod[i][j] = rtod[i + 1][j - 1] + 1;
            }
        }

        int max = 0;
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                int side = Math.min(ltou[i][j], rtou[i][j]);

                if(max <= side) {
                    for (int sz = side; sz >= 1; sz--) {
                        int t = j + 2 * (sz - 1);

                        if (t >= N) continue;
                        if (sz < max) break;
                        if (Math.min(ltod[i][t], rtod[i][t]) >= sz) {
                            max = Math.max(max, sz);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}
