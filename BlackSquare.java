import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BlackSqaure {


    public static void main(String[] args)throws IOException {
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[4];
        String str=br.readLine();   
        long sum=0;
        StringTokenizer tokenizer=new StringTokenizer(str);
        for(int i=0;i<4;i++)
            arr[i]=Integer.parseInt(tokenizer.nextToken());
        str=br.readLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
               sum=sum+arr[0];
            
            }
            else if(str.charAt(i)=='2')
            {
                sum=sum+arr[1];
            }
            else if(str.charAt(i)=='3')
            {
                sum=sum+arr[2];
            }
            else if(str.charAt(i)=='4')
            {
                sum=sum+arr[3];
            }
            
        }
        System.out.println(sum);
        
    }

}
