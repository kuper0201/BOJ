/*
2022.09.06. (화)
https://boj.kr/2693
"N번째 큰 수" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int[] arr = new int[10];
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < 10; j++) arr[j] = Integer.parseInt(s[j]);

            Arrays.sort(arr);
            sb.append(arr[7] +"\n");
        }

        System.out.println(sb);
    }
}
