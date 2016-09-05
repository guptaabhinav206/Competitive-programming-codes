import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
 class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		long m=0;
		while(t-->0){
			String str[] = br.readLine().split(" ");
			
			long red = Long.parseLong(str[0]);
			long green = Long.parseLong(str[1]);
			long blue = Long.parseLong(str[2]);
			long k = Long.parseLong(br.readLine().trim());
			m=0;
			if(k<=red&&k<=green&&k<=blue)
				m=3*(k-1)+1;
				else if(k<=red&&k<=green&&k>blue)
				m=blue+2*(k-1)+1;
				else if(k<=red&&k>green&&k<=blue)
				m=green+2*(k-1)+1;
				else if(k>red&&k<=green&&k<=blue)
				m=red+2*(k-1)+1;
				else if(k<=red&&k>green&&k>blue)
				m=k+green+blue;
				else if(k>red&&k<=green&&k>blue)
				m=k+red+blue;
				else if(k>red&&k>green&&k<=blue)
				m=k+red+green;
				System.out.println(m);
		}
	}
 
} 
