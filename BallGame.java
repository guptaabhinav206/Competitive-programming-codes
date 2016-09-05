import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R245_Div2_B
{   
    FastReader in;
    PrintWriter out;
    
    public static void main(String[] args)  {
        new R245_Div2_B().run();
    }
    
    void run()
    {       
        in = new FastReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    
    void solve()
    {
        int n = in.nextInt();
        int maxcolors = in.nextInt();
        int x = in.nextInt();
        
        int[] c = new int[n];

        for (int i = 0; i < n; i++) 
            c[i] = in.nextInt();
        
        int max = 0;
        for (int i = 0; i < n-1; i++)
        {
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) al.add(c[j]);
            
            if (al.get(i) == al.get(i+1) && al.get(i) == x)
            {
                al.remove(i+1); al.remove(i);
                for (int j = 0; j < al.size()-2; j++)
                    if (al.get(j) == al.get(j+1) && al.get(j+1) == al.get(j+2))
                    {
                        int col = al.get(j);
                        while (j < al.size() && al.get(j) == col)
                        {
                            al.remove(j);
                        }
                        j = -1;
                    }           
                
            }
            max = Math.max(max,  n-al.size());
            //System.out.println (i + " " + max);
        }       
        out.println(max);       
    }

    //-----------------------------------------------------
    void runWithFiles() {
        in = new FastReader(new File("input.txt"));
        try {
            out = new PrintWriter(new File("output.txt"));
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        solve();
        out.close();
    }
    
    class FastReader
    {
        BufferedReader br;
        StringTokenizer tokenizer;
        
        public FastReader(InputStream stream)
        {
            br = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }
        public FastReader(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
                tokenizer = null;
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        
        private String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                try {
                    tokenizer = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            return tokenizer.nextToken();
        }
        public String nextLine() {
            try {
                return br.readLine();
            }
            catch(Exception e) {
                throw(new RuntimeException());
            }
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }       
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}
