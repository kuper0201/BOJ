import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if(s.contains("D2") || s.contains("d2")) System.out.println("D2");
        else System.out.println("unrated");
    }
}
