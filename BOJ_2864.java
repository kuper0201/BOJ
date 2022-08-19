/*
2022.08.19. (금)
https://boj.kr/2864
"5와 6의 차이" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        long max = Integer.parseInt(s[0].replaceAll("5", "6")) + Integer.parseInt(s[1].replaceAll("5", "6"));
        long min = Integer.parseInt(s[0].replaceAll("6", "5")) + Integer.parseInt(s[1].replaceAll("6", "5"));

        System.out.println(min +" " +max);
    }
}
