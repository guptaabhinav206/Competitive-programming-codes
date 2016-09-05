import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NearlyLucky {

    public static void main(String[] args)throws IOException {
        // TODO Auto-generated method stub
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int count=0;
            String str=br.readLine();
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='4' || str.charAt(i)=='7')
                {
                    count++;
                }
            }
            if(count==7 || count==4)
                System.out.println("YES");
            else System.out.println("NO");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }

}
