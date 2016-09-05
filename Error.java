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
 
 class Error {
 
	public static void main(String[] args)throws IOException
	{
		String s1=new String();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t;
		t= Integer.parseInt(br.readLine());
		while(t-->0)
		{
			s1=br.readLine();
			if(s1.contains("010") || s1.contains("101"))
			{
				System.out.println("Good");
			}
		/*	else if(s1.contains("010") && s1.contains("101"))
			{
				System.out.println("Good");
			}*/
			else System.out.println("Bad");
		}
	}
}
