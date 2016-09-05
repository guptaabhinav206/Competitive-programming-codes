import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
 class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long count,num1,num2;
		int t=Integer.parseInt(br.readLine());
		char s1[] = new char[1000005];
		char s2[] = new char[1000005];
		while(t-->0)
		{
			count=0;num1=0;num2=0;
			String str1 = br.readLine();
			String str2 = br.readLine();
			boolean flag=false,temp=false;
			s1=str1.toCharArray();
			s2=str2.toCharArray();
			long l1 = s1.length;
			for(int i=0;i<l1;i++)
			{
				if(s1[i]=='#')
				{
					flag=true;
					break;
				}
				else if(s2[i]=='#')
				{
					flag=false;
					break;
				}
			}
			for(int i=0;i<l1;i++)
			{
				if(s1[i]=='#' && s2[i]=='#')
				{
					temp=true;
					break;
				}
				else if(s1[i]=='#' && flag==false)
				{
					flag=true;
					count++;
				}
				else if(s2[i]=='#' && flag==true)
				{
					flag=false;
					count++;
				}
			}
			if(temp==true)
				System.out.println("No");
			else
			{
				System.out.println("Yes");
				System.out.println(count);
			}
		}
	}
}
 
