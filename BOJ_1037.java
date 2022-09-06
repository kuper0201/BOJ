/*
2022.09.06. (화)
https://boj.kr/1037
"약수" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] s = br.readLine().split(" ");
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(s[i]);

        Arrays.sort(arr);

        System.out.println(arr[0] * arr[arr.length - 1]);
    }
}
