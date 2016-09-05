import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.math.*;
import java.io.*;

public class TooLong {

    public static void main(String[] args)throws IOException {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1;
        int n=0;
        try
        {
        s1=br.readLine();
        n=Integer.parseInt(s1);
        while(n-->0)
        {
            String s=br.readLine();
            if(s.length()>10)
            {
                char last=s.charAt(s.length()-1);
                char first=s.charAt(0);
                int temp=s.length()-2;
                String ans=first+""+temp+last;
                System.out.println(ans);
            }
            else System.out.println(s);
        }
        }
        catch(IOException e)
        {
            
        }
    }

}
