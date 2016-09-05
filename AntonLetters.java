import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;

public class AntonLetters {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Character> hs=new HashSet<Character>();
        try
        {
        String s=br.readLine();
  
            for(int i=1;i<s.length()-1;i++)
            {
              if(s.charAt(i)>='a' && s.charAt(i)<='z')
                                                      hs.add(s.charAt(i));
            }
            System.out.println(hs.size());
        }
        
        catch(Exception e)
        {
          e.printStackTrace();    
        }
    }
}
