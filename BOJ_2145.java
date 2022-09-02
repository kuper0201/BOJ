/*
2022.09.02. (금)
https://boj.kr/2145
"숫자 놀이" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();
            if(s.equals("0")) break;

            while(true) {
                int sum = 0;
                for(int i = 0; i < s.length(); i++) sum += s.charAt(i) - '0';

                if(sum < 10) {
                    sb.append(sum +"\n");
                    break;
                }

                s = String.valueOf(sum);
            }
        }

        System.out.println(sb);
    }
}
