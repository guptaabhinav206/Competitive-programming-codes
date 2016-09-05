import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
 class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
    	String str1,str2;
    	int t;
    	String str = br.readLine();
    	String s[]=str.split(" ");
    	t=Integer.parseInt(s[0]);
    	while(t-->0)
    	{
    	
    		int count=0;
    		
    		str1 = br.readLine();
    		str2 = br.readLine();
    		
    		for(int i=0;i<str1.length();i++)
    		{
    			if(str1.charAt(i)==str2.charAt(i) || str1.charAt(i)=='?' || str2.charAt(i)=='?')
    			{
    				count++;
    			}
    			
    		}
    		if(count==str1.length())
    		{
    			System.out.println("Yes");
    		}
    		else System.out.println("No");
    		
    	}
	}
 
}
