import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
class Main
{
	static private class Scan
	{
		private byte[] buf=new byte[1024];
		private int index;
		private InputStream in;
		private int total;
		public Scan()
		{
			in=System.in;
		}
		public int scan()throws IOException
		{
			if(total<0)
			throw new InputMismatchException();
			if(index>=total)
			{
				index=0;
				total=in.read(buf);
				if(total<=0)
				return -1;
			}
			return buf[index++];
		}
		public int scanInt()throws IOException
		{
			int integer=0;
			int n=scan();
			while(isWhiteSpace(n))
			n=scan();
			int neg=1;
			if(n=='-')
			{
				neg=-1;
				n=scan();
			}
			while(!isWhiteSpace(n))
			{
				if(n>='0'&&n<='9')
				{
					integer*=10;
					integer+=n-'0';
					n=scan();
				}
				else throw new InputMismatchException();
			}
			return neg*integer;
		}
		public long scanLong()throws IOException
		{
			long integer=0;
			int n=scan();
			while(isWhiteSpace(n))
			n=scan();
			int neg=1;
			if(n=='-')
			{
				neg=-1;
				n=scan();
			}
			while(!isWhiteSpace(n))
			{
				if(n>='0'&&n<='9')
				{
					integer*=10;
					integer+=(long)(n-'0');
					n=scan();
				}
				else throw new InputMismatchException();
			}
			return neg*integer;
		}
		public double scanDouble()throws IOException
		{
			double doub=0;
			int n=scan();
			while(isWhiteSpace(n))
			n=scan();
			int neg=1;
			if(n=='-')
			{
				neg=-1;
				n=scan();
			}
			while(!isWhiteSpace(n)&&n!='.')
			{
				if(n>='0'&&n<='9')
				{
					doub*=10;
					doub+=n-'0';
					n=scan();
				}
				else throw new InputMismatchException();
			}
			if(n=='.')
			{
				n=scan();
				double temp=1;
				while(!isWhiteSpace(n))
				{
					if(n>='0'&&n<='9')
					{
						temp/=10;
						doub+=(n-'0')*temp;
						n=scan();
					}
					else throw new InputMismatchException();
				}
			}
			return doub*neg;
		}
		public String scanString()throws IOException
		{
			StringBuilder sb=new StringBuilder();
			int n=scan();
			while(isWhiteSpace(n))
			n=scan();
			while(!isWhiteSpace(n))
			{
				sb.append((char)n);
				n=scan();
			}
			return sb.toString();
		}
		private boolean isWhiteSpace(int n)
		{
			if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
			return true;
			return false;
		}
	}
 
	static private class Print
	{
		private final BufferedWriter bw;
		public Print()
		{
			this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
		}
		public void print(Object object)throws IOException
		{
			bw.append(""+object);
		}
		public void println(Object object)throws IOException
		{
			print(object);
			bw.append("\n");
		}
		public void close()throws IOException
		{
			bw.close();
		}
	}
	static long calcu(int x,int y,int n)
	{
		Queue<Long> Q=new LinkedList<Long>();
		for(int i=1;i<=x;i++)
			Q.offer((long)y);
		long sum=y*x;
		for(int i=x+1;i<n;i++)
		{
			Q.offer(sum);
			long temp=Q.poll();
			sum*=2;
			sum-=temp;
		}
		return sum;
	}
	public static void main(String[] args)throws IOException
	{
		Scan scan=new Scan();
		Print print=new Print();
		int tc=scan.scanInt();
		while(tc-->0)
		{
			int x=scan.scanInt();
			int y=scan.scanInt();
			int n=scan.scanInt();
			if(n<=x)
				print.println(y);
			else
				print.println(calcu(x,y,n));
		}
		print.close();
	}
}
