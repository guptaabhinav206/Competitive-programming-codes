import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Twins {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int n=Integer.parseInt(br.readLine());
			int arr[]=new int[n];
			int brr[]=new int[n];
			int sum=0;
			String str=br.readLine();
			StringTokenizer tokenizer=new StringTokenizer(str);
			for(int i=0;i<n;i++)
			{
				arr[i]=Integer.parseInt(tokenizer.nextToken());
				sum+=arr[i];
			}
			Arrays.sort(arr);
			for(int i=0;i<n;i++)
			{
				brr[i]=arr[n-i-1];
			}
			int min=brr[0],count=1;
			for(int i=1;i<n;i++)
			{
				if(min<=sum/2)
				{
					min=min+brr[i];
					count++;
				}
			}
			
			System.out.println(count);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
