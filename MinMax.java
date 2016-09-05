import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
 
 class Main {
 
	public static void main(String[] args) throws IOException {
		
		PrintWriter pr=new PrintWriter(System.out,true);
	    InputReader in=new InputReader(System.in);
	    
	    int t = in.readInt();
	    
		while(t-->0)
		{
			int n = in.readInt();
			int i=0,a;
			long min=Integer.MAX_VALUE;
			
			for(int j=0;j<n;j++)
			{
				a=in.readInt();
				if(min>=a)
				{
					min=a;
				}
			}
			long ans = min*(n-1);
			pr.println(ans);
		}
		
	}
}
 class InputReader {
	    private InputStream stream;
	    private byte[] buf = new byte[102400];
	    private int curChar;
	    private int numChars;
	   
	    public InputReader(InputStream stream) {
	            this.stream = stream;
	    }
	    public final int read() {
	            if (numChars == -1)
	                    throw new InputMismatchException();
	            if (curChar >= numChars) {
	                    curChar = 0;
	                    try {
	                            numChars = stream.read(buf);
	                    } catch (IOException e) {
	                            throw new InputMismatchException();
	                    }
	                    if (numChars <= 0)
	                            return -1;
	            }
	            return buf[curChar++];
	    }
	    public final int readInt() {
	            int c = read();
	            while (isSpaceChar(c))
	                    c = read();
	            int sgn = 1;
	            if (c == '-') {
	                    sgn = -1;
	                    c = read();
	            }
	            int res = 0;
	            do {
	                    if (c < '0' || c > '9')
	                            throw new InputMismatchException();
	                    res *= 10;
	                    res += c - '0';
	                    c = read();
	            } while (!isSpaceChar(c));
	            return res * sgn;
	    }
	    public final long readLong() {
	            int c = read();
	            while (isSpaceChar(c))
	                    c = read();
	            int sgn = 1;
	            if (c == '-') {
	                    sgn = -1;
	                    c = read();
	            }
	            long res = 0;
	            do {
	                    if (c < '0' || c > '9')
	                            throw new InputMismatchException();
	                    res *= 10;
	                    res += c - '0';
	                    c = read();
	            } while (!isSpaceChar(c));
	            return res * sgn;
	    }
	    public final String readString() {
	            int c = read();
	            while (isSpaceChar(c))
	                    c = read();
	            StringBuilder res = new StringBuilder();
	            do {
	                    res.appendCodePoint(c);
	                    c = read();
	            } while (!isSpaceChar(c));
	            return res.toString();
	    }
	    public final  static boolean isSpaceChar(int c) {
	            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	    }
	    public final String next() {
	            return readString();
	    }
	}  
