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
 
class Hubullu {
 
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s;
	int t=Integer.parseInt(br.readLine());
	long n;
	int p;
	while(t-->0)
	{
		String s1[]=br.readLine().split(" ");
		n=Long.parseLong(s1[0]);
		p=Integer.parseInt(s1[1]);
		if(p==0)
			System.out.println("Airborne wins.");
		else System.out.println("Pagfloyd wins.");
	}
 
}
}
