import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class NextRound {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		String str=br.readLine();
		int arr[]=new int[51];
		try
		{
		//	int j=0;
		String s[]=str.split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);;
		//String string[]=br.readLine().split(" ");
		for(int i=0;i<n;i++)
			arr[i]= Integer.parseInt(tokenizer.nextToken());
		int temp=arr[k];
		int ans=0,count=0;
		if(temp!=0){
		for(int i=k-1;i<n;i++)
		{
			if(arr[i]==arr[i+1])
				count++;
			else break;
		}
		System.out.println(count+k);
		}
		else {
			
			for(int i=0;i<k;i++)
			{
				if(arr[i]!=0)
					count++;
			}
			System.out.println(count);
			
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
