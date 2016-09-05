import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
 
class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str3 = br.readLine(); 
		String s2[] = str3.split(" ");
		int t = Integer.parseInt(s2[0]);
		while(t-->0)
		{
			String str2 = br.readLine();
			String s[] = str2.split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			int arr[]=new int[m];
			String str = br.readLine();
			String s1[]=str.split(" ");
			for(int i=0;i<m;i++)
			{
				arr[i]=Integer.parseInt(s1[i]);
			}
			Arrays.sort(arr);
			int i=0,j=m-1;
			int temp=arr[m-1];
			int count=0;
			while(i<j)
	        {
	            if(arr[i]>1)
	            {
	                arr[i]--;
	            }
	 
	            else
	                i++;
	            count++;
	            j--;
	        }
			System.out.println(count);
			
		}
	}
} 
