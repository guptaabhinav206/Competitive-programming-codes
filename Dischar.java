import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = sc.nextInt();
		while(n-->0)
		{
			HashSet<Character> set = new HashSet<Character>();
			int len=0;
			String str = br.readLine();
			char ch[] = str.toCharArray();
			for(int i=0;i<ch.length;i++)
				set.add(ch[i]);	
			len = set.size();
			System.out.println(len);
		}
 
	}
 
}
