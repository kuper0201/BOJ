/*
2022.08.21. (일)
https://boj.kr/25205
"경로당펑크 2077" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Character> set = new HashSet<>();
        set.add('r'); set.add('s'); set.add('e'); set.add('f'); set.add('a'); set.add('q'); set.add('t');
        set.add('d'); set.add('w'); set.add('c'); set.add('z'); set.add('x'); set.add('v'); set.add('g');

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        if(set.contains(s.charAt(N - 1))) System.out.println("1");
        else System.out.println("0");
    }
}
