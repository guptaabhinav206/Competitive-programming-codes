import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++){
			
			for(int j=i+1;j<n;j++){
				
				if((arr[i]&arr[j])>temp){
					temp=arr[i]&arr[j];
				}
				
				
			}
			
			
		}
		System.out.println(temp);
		
	}
}
 
