/*
2022.09.01. (목)
https://boj.kr/2083
"럭비 클럽" 문제 풀이
*/
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true) {
			String[] s = br.readLine().split(" ");
			if(s[0].equals("#")) break;
			if(Integer.parseInt(s[1]) > 17 || Integer.parseInt(s[2]) >= 80) sb.append(s[0] +" Senior\n");
			else sb.append(s[0] +" Junior\n");
		}

		System.out.println(sb);
	}
}
