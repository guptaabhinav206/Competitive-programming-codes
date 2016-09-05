import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.math.*;
import java.io.*;
class Farida {
	static long max(long a,long b)
	{
		if(a>b)
			return a;
		else return b;
	}
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		String s1=br.readLine();
		int t=0;
		if(s1!=null){
		 t=Integer.parseInt(s1);
		}
		else
			System.exit(0);
		long dp[]=new long[10001];long arr[]=new long[10001];
		int k=1;
		while(t-->0)
		{
			int p=0;
			for(int i=0;i<10001;i++)
				arr[i]=0;
			int n=0;
			try
			{
			String s2=br.readLine();
			
			 n=Integer.parseInt(s2);
			
			String s[]=br.readLine().split(" ");
			for(String temp:s)
			{
				arr[p++]=Integer.parseInt(temp);
			}
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
			dp[0]=arr[0];
			dp[1]=max(arr[0],arr[1]);
			for(int i=2;i<n;i++)
			{
				dp[i]=max(dp[i-1],arr[i]+dp[i-2]);
			}
			System.out.print("Case " +k+": "+dp[n-1]);
			k++;
		
			
		}
	
	}
}
 
