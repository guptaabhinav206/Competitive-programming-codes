import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=29;
			int b=sc.nextInt();
			int count=0;
			for(int i=a;i<=b;i++)
			{
				int flag=0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				
				if(flag==0)
				{
					count=count+i;
					
				}
			}
			System.out.println(count);
			
		}
 
	}
 
}
