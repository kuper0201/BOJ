/*
2022.08.22. (월)
https://boj.kr/25373
"벼락치기" 문제 풀이
*/
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger res, bi = new BigInteger(br.readLine());

        if(compare(bi, BigInteger.valueOf(1))) res = BigInteger.valueOf(1);
        else if(compare(bi, BigInteger.valueOf(3))) res = BigInteger.valueOf(2);
        else if(compare(bi, BigInteger.valueOf(6))) res = BigInteger.valueOf(3);
        else if(compare(bi, BigInteger.valueOf(10))) res = BigInteger.valueOf(4);
        else if(compare(bi, BigInteger.valueOf(15))) res = BigInteger.valueOf(5);
        else if(compare(bi, BigInteger.valueOf(21))) res = BigInteger.valueOf(6);
        else if(compare(bi, BigInteger.valueOf(28))) res = BigInteger.valueOf(7);
        else {
            res = bi.subtract(BigInteger.valueOf(28)).divide(BigInteger.valueOf(7)).add(BigInteger.valueOf(7));
            if(!chk(bi, res)) res = res.add(BigInteger.ONE);
        }

        System.out.println(res);
    }

    static boolean chk(BigInteger bi, BigInteger bi2) {
        BigInteger tmp = BigInteger.ZERO;

        for(int i = 0; i < 7; i++) {
            tmp = tmp.add(bi2);
            bi2 = bi2.subtract(BigInteger.ONE);
        }

        return compare(bi, tmp);
    }
    static boolean compare(BigInteger bi1, BigInteger bi2) {
        if(bi1.compareTo(bi2) <= 0) return true;
        return false;
    }
}
