/*
2022.08.11. (목)
https://boj.kr/2776
"암기왕" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            HashSet<Integer> set = new HashSet<>();

            int O = Integer.parseInt(br.readLine());
            String[] s1 = br.readLine().split(" ");
            for(int j = 0; j < O; j++) set.add(Integer.parseInt(s1[j]));

            int P = Integer.parseInt(br.readLine());
            String[] s2 = br.readLine().split(" ");
            for(int j = 0; j < P; j++) {
                if(set.contains(Integer.parseInt(s2[j]))) sb.append("1\n");
                else sb.append("0\n");
            }
        }

        System.out.println(sb);
    }
}
