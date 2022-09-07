/*
2022.09.07. (수)
https://boj.kr/9506
"약수들의 합" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == -1) break;

            StringBuilder num = new StringBuilder();
            num.append(N +" = 1");
            int sum = 1;
            for(int i = 2; i < N; i++) {
                if(N % i == 0) {
                    sum += i;
                    num.append(" + " +i);
                }
            }

            if(sum != N) sb.append(N +" is NOT perfect.\n");
            else sb.append(num +"\n");
        }

        System.out.println(sb);
    }
}
