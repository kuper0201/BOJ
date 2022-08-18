/*
2022.08.12. (금)
https://boj.kr/23813
"회전" 문제 풀이
*/
import java.io.*;
import java.math.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        BigInteger bi = new BigInteger(s);
        int N = s.length();

        for(int i = 0; i < N - 1; i++) {
            char c = s.charAt(N - 1);

            s = c + s.substring(0, N - 1);
            bi = bi.add(new BigInteger(s));
        }

        System.out.println(bi);
    }
}
