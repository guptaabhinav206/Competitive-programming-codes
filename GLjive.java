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

class Gljive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			n=sc.nextInt();
			if(sum+n<100 || 100-sum>=sum+n-100)
				sum=sum+n;
			else break;
		}
		System.out.println(sum);

	}

}


