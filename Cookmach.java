import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count;
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			count=0;
			String str = br.readLine();
			String s[]=str.split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
	
			if(a==b)
			{
				System.out.println(0);
			}
			else if (b%a!=0)
			{
				a=a/2;
				while(b%a!=0)
				{
					a=a/2;
					count++;
				}
				while(a!=b)
				{
					a=a*2;count++;
				}
				System.out.println(count+1);
			}
			else if(b%a==0)
			{
				while(a!=b)
				{
					a=a*2;
					count++;
				}
				System.out.println(count);
			}
		}
	}
 
}
