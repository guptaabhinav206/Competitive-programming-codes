import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CHODE solver = new CHODE();
        int testCount = in.nextInt();
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }
}
 
class CHODE {
 
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String freqSeq = in.next();
        String cypher = in.nextLine();
 
        int c[] = new int[26];
        int p[] = new int[26];
        char mem[] = new char[26];
 
        int l = cypher.length();
        boolean isChar[] = new boolean[l];
        char lower[] = new char[l];
 
        for (int i = 0; i < l; i++) {
            char ch = cypher.charAt(i);
            isChar[i] = Character.isLetter(ch);
            if (isChar[i]) {
                lower[i] = Character.toLowerCase(ch);
                c[lower[i] - 'a']++;
            }
        }
 
        for (int i = 0; i < 26; i++) {
            int min = c[0];
            int pos = 0;
            for (int j = 1; j < 26; j++) {
                if (c[j] < min) {
                    min = c[j];
                    pos = j;
                }
            }
            c[pos] = Integer.MAX_VALUE;
            p[pos] = i;
            mem[pos] = freqSeq.charAt(pos);
        }
 
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < l; i++) {
            char ch = cypher.charAt(i);
            if (isChar[i]) {
                int pos = p[lower[i] - 'a'];
                char nx = mem[pos];
                ch = Character.isUpperCase(ch) ? Character.toUpperCase(nx) : nx;
            }
            sBuilder.append(ch);
        }
        out.println(sBuilder);
    }
}
 
class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }
 
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
 
    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            return "";
        }
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
    public long nextLong() {
        return Long.parseLong(next());
    }
} 
