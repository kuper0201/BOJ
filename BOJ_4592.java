/*
2022.08.27. (토)
https://boj.kr/4592
"중복을 없애자" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String[] s = br.readLine().split(" ");
            if(s[0].equals("0")) break;

            for(int i = 1; i <= Integer.parseInt(s[0]); i++)
                if(i == 1 || !s[i - 1].equals(s[i])) sb.append(s[i] +" ");

            sb.append("$ \n");
        }

        System.out.println(sb);
    }
}
