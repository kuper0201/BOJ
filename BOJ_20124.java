/*
2022.08.29. (월)
https://boj.kr/20124
"모르고리즘 회장님 추천 받습니다" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    static class Stu implements Comparable<Stu> {
        String name;
        int sol;

        public Stu(String name, int sol) {
            this.name = name;
            this.sol = sol;
        }

        @Override
        public int compareTo(Stu o) {
            if(this.sol == o.sol) return this.name.compareTo(o.name);
            return o.sol - this.sol;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stu[] s = new Stu[N];
        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            s[i] = new Stu(str[0], Integer.parseInt(str[1]));
        }

        Arrays.sort(s);

        System.out.println(s[0].name);
    }
}
