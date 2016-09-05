import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    static Main main;
    
    public static void main(String[] args)throws IOException {
        // TODO Auto-generated method stub

        main=new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();
        String str2=br.readLine();
        if(str1.compareToIgnoreCase(str2)==0)
        {
            System.out.println("0");
        }
        else if(str1.compareToIgnoreCase(str2)<0)
        {
            System.out.println("-1");
        }
        else if(str1.compareToIgnoreCase(str2)>0)
        {
            System.out.println("1");
        }
    }
}
