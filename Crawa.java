/**
*  This program is created by @author Abhinav gupta
*  contains all the copyrights
* 
*/
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
 
	private long X,Y;
	
	Main(long X,long Y)
	{
		this.X=X;
		this.Y=Y;		
	}
	
	static void solve(long X, long Y)
	{
		if(X==0)
		{
			if(Y%2==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else if(X>0)
		{
			if(X%2==1)
			{
				if(Y==0)
					System.out.println("YES");
				else if(Y>0)
				{
					if(Y<=X)
						System.out.println("YES");
					else
					{
						if(Y%2==0)
							System.out.println("YES");
						else
							System.out.println("NO");
					}
				}
		else
		{
			if(Math.abs(Y)<=X)
			{
				if(Math.abs(Y)==X)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
			else
			{
				if(Y%2==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
		}
		else
		{
			if(Y==0)
				System.out.println("NO");
			else if(Y>0)
			{
				if(Y>=X+2&&Y%2==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		else
		{
			if(Math.abs(Y)>=X&&Y%2==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		}
		}
		else if(X<0)
		{
			if(Math.abs(X)%2==1)
			{
				if((Math.abs(Y)>Math.abs(X))&&Y%2==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		else
		{
		if(Math.abs(Y)<=Math.abs(X))
			System.out.println("YES");
		else
		{
		if(Y%2==0)
			System.out.println("YES");
		else
			System.out.println("NO");
		}
		}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		try{
		int t=sc.nextInt();
		while(t-->0)
		{
			String str[]=br.readLine().split(" ");
			long X=Long.parseLong(str[0]);
			long Y=Long.parseLong(str[1]);
			Main obj=new Main(X,Y);
			if(X==0 && Y==0)
				System.out.println("YES");
			else
				solve(X,Y);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
 
}
 
