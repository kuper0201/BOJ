/*
2022.08.20. (토)
https://boj.kr/25305
"커트라인" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);
        Integer[] arr = new Integer[M];

        String[] sc = br.readLine().split(" ");
        for(int i = 0; i < M; i++) arr[i] = Integer.parseInt(sc[i]);

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[N - 1]);
    }
}
