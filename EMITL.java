import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
			
			String str = br.readLine();
			int count[]=new int[26];
			
			for(int i=0;i<str.length();i++){
				
				count[str.charAt(i)-65]++;
			}
			
			if(str.length()!=9){
			
			if(count['L'-65]<2 || count['T'-65]<2 || count['I'-65]<2 || count['M'-65]<2 || count['E'-65]<2){
				System.out.println("NO");
			}
			else 
				System.out.println("YES");
			}
			
			else if(str.length()==9){
				if(count['L'-65]!=2 || count['T'-65]!=2 || count['I'-65]!=2 || count['M'-65]<2 || count['E'-65]!=1){
					System.out.println("NO");
				}
				else 
					System.out.println("YES");
				}	
			}
		}
	}
 
