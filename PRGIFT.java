/**
*  Header files by @author Abhinav gupta
* Use of comparator in sorting the objects of a class
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
import java.util.StringTokenizer;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		try{
		int t=sc.nextInt();
		while(t-->0){
			int count=0;
			str=br.readLine();
			String s[]=str.split(" ");
			int n=Integer.parseInt(s[0]);
			int k=Integer.parseInt(s[1]);
			int arr[]=new int[n];
			StringTokenizer tokenizer=new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++){
				
				arr[i]=Integer.parseInt(tokenizer.nextToken());
				if((arr[i]&1)!=1) 
					count++;
				
		}
			if(k==0){
				
				if(count!=n){
					System.out.println("YES");
				}
				else System.out.println("NO");
				}
			else{
				
				if(count>=k){
					System.out.println("YES");
				}
				else System.out.println("NO");
				
			}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
 
}
