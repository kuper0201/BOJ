/*
2022.08.22. (월)
https://boj.kr/2540
"계란" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    static int N, sum = 0, cnt = 0, min = Integer.MAX_VALUE, ind = 0;
    static StringBuilder[] sb = new StringBuilder[4];
    static int[] buck;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] bucket = new int[4];

        N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        for (int i = 0; i < 4; i++) {
            bucket[i] = Integer.parseInt(s[i]);
            sum += bucket[i];
        }

        for (int i = 0; i < 4; i++) {
            buck = bucket.clone();
            minMove(i);
        }

        System.out.println(sb[ind]);
    }

    static void minMove(int fix) {
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return buck[o1] - buck[o2];
            }
        };

        sb[fix] = new StringBuilder();
        cnt = 0; sum = 0;

        ArrayList<Integer> idx = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (i != fix) {
                idx.add(i);
                sum += buck[i];
            }
        }

        print(fix);

        Collections.sort(idx, cmp);
        if (sum % 2 != 0) {
            if(buck[fix] == 0) return;
            buck[fix]--;
            buck[idx.get(2)]--;
            buck[idx.get(1)] += 2;
            print(fix);
        }

        Collections.sort(idx, cmp);
        if(buck[idx.get(0)] + buck[idx.get(1)] < buck[idx.get(2)]) {
            if(buck[idx.get(1)] == 0) {
                for(int i = 0; i < 2; i++) {
                    buck[idx.get(2)]--;
                    buck[fix]--;
                    buck[idx.get(1)] += 2;
                    Collections.sort(idx, cmp);
                    print(fix);
                }
            }

            Collections.sort(idx, cmp);
            while(buck[idx.get(0)] + buck[idx.get(1)] < buck[idx.get(2)]) {
                buck[idx.get(1)]--;
                buck[idx.get(2)]--;
                buck[idx.get(0)] += 2;
                Collections.sort(idx, cmp);
                print(fix);
            }
        }

        while(true) {
            if(buck[idx.get(0)] == 0 && buck[idx.get(1)] == 0 && buck[idx.get(2)] == 0) break;

            buck[idx.get(1)]--;
            buck[idx.get(2)]--;
            buck[fix] += 2;
            Collections.sort(idx, cmp);
            print(fix);
        }

        if(min > cnt) {
            min = cnt;
            ind = fix;
        }
    }

    static void print(int idx) {
        for (int i = 0; i < 4; i++) sb[idx].append(buck[i] + " ");
        sb[idx].append("\n");

        cnt++;
    }
}
