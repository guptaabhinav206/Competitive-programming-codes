import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
 
class Main {
 
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		  
		
		while(t-->0)
		{
			String s1 = br.readLine();
			String s2 = br.readLine();
	
			Map<Character,Integer> map = new TreeMap<Character,Integer>();
			
			for(int i = 0; i < s1.length(); i++){
			   char c = s1.charAt(i);
			   Integer val = map.get(new Character(c));
			   if(val != null){
			     map.put(c, new Integer(val + 1));
			   }else{
			     map.put(c,1);
			   }
			}
			for(int i = 0; i < s2.length(); i++){
				   char c = s2.charAt(i);
				   Integer val = map.get(new Character(c));
				   if(val != null){
				     map.put(c, new Integer(val + 1));
				   }else{
				     map.put(c,1);
				   }
			}
			
			Map.Entry<Character, Integer> maxEntry=null;
			for (Map.Entry<Character, Integer> entry : map.entrySet())
			{
			    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
			    {
			        maxEntry = entry;
			    }
			}
 
			
		 System.out.println(maxEntry.getKey()); 
			
		}
		
	}
	}
