/*
2022.08.13. (토)
https://boj.kr/12813
"이진수 연산" 문제 풀이
*/
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s1 = br.readLine();
        String s2 = br.readLine();

        BigInteger a = new BigInteger(s1, 2);
        BigInteger b = new BigInteger(s2, 2);

        sb.append(zeroFill(a.and(b).toString(2)) +"\n");
        sb.append(zeroFill(a.or(b).toString(2)) +"\n");
        sb.append(zeroFill(a.xor(b).toString(2)) +"\n");
        sb.append(zeroFill(not(s1)) +"\n");
        sb.append(zeroFill(not(s2)) +"\n");

        System.out.println(sb);
    }

    static String not(String s) {
        StringBuilder res = new StringBuilder();

        int N = s.length();
        for(int i = 0; i < N; i++) {
            if(s.charAt(i) == '1') res.append("0");
            else res.append("1");
        }

        return res.toString();
    }

    static String zeroFill(String s) {
        return String.format("%100000s", s).replaceAll(" ", "0");
    }
}
