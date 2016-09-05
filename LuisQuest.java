import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.math.BigInteger;
import java.math.*;
class LuisQuest {
 
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int n,i=0;
		double k,ans;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
	//	System.out.println(n);
		while(n-->0)
		{
			i++;
			String s[]=br.readLine().split(" ");
			int p0=Integer.parseInt(s[0]);
			int p1=Integer.parseInt(s[1]);
			int t=Integer.parseInt(s[2]);
			int p=Integer.parseInt(s[3]);
			k = (Math.log(p1) - Math.log(p0))/t;
			ans = (Math.log(p) - Math.log(p0))/k;
			System.out.printf("Scenario #%d: %.2f",i,ans);
			System.out.println();
		}
	}
 
}
