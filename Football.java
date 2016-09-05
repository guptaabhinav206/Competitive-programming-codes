import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Football {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int max=0;
        int count=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
                if(count>max)
                    max=count;
            }
            else
                count=0;
        }
        //System.out.println(max+1);
        if((max+1)>=7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    

}
