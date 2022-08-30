/*
2022.08.30. (화)
https://boj.kr/1587
"대표값2" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            int N = Integer.parseInt(br.readLine());
            arr[i] = N;
            sum += N;
        }
        
        Arrays.sort(arr);
        
        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }
}
