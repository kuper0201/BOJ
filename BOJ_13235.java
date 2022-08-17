/*
2022.08.17. (수)
https://boj.kr/13235
"팰린드롬" 문제 풀이
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String r = new StringBuilder(s).reverse().toString();

        if(s.equals(r)) System.out.println("true");
        else System.out.println("false");
    }
}
