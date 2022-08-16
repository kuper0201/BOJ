/*
2022.08.16. (화)
https://boj.kr/22966
"가장 쉬운 문제를 찾는 문제" 문제 풀이
*/
import java.io.*;
import java.util.*;

class Q implements Comparable<Q> {
    String name;
    int dif;

    public Q(String name, int dif) {
        this.name = name;
        this.dif = dif;
    }

    @Override
    public int compareTo(Q o) {
        return this.dif - o.dif;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Q[] list = new Q[N];
        for(int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            list[i] = new Q(s[0], Integer.parseInt(s[1]));
        }

        Arrays.sort(list);

        System.out.println(list[0].name);
    }
}
