/*
2022.08.24. (수)
https://boj.kr/16172
"나는 친구가 적다 (Large)" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().replaceAll("[0-9]", "");
        String s2 = br.readLine();

        boolean flag = false;
        int N1 = s1.length();
        int N2 = s2.length();
        int[] table = new int[N2];

        int idx = 0;
        for (int i = 1; i < N2; i++) {
            while (idx > 0 && s2.charAt(i) != s2.charAt(idx)) idx = table[idx - 1];
            if (s2.charAt(i) == s2.charAt(idx)) {
                idx++;
                table[i] = idx;
            }
        }

        idx = 0;

        for (int i = 0; i < N1; i++) {
            while (idx > 0 && s1.charAt(i) != s2.charAt(idx)) idx = table[idx - 1];
            if (s1.charAt(i) == s2.charAt(idx)) {
                if (idx == N2 - 1) {
                    idx = table[idx];
                    flag = true;
                } else idx++;
            }
        }

        if(flag) System.out.println("1");
        else System.out.println("0");
    }
}
