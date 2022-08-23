/*
2022.08.23. (화)
https://boj.kr/2592
"대표값" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine());

            sum += N;
            map.put(N, map.getOrDefault(N, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> lst = new LinkedList<>(map.entrySet());
        lst.sort(Map.Entry.comparingByValue());

        System.out.println(sum / 10);
        System.out.println(lst.get(lst.size() - 1).getKey());
    }
}
