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
        HashSet<Character> hs=new HashSet<Character>();
        String str=br.readLine();
    //  Set<T> mySet = new HashSet<int>(Arrays.asList(someArray));
        int len=str.length();
        char[] ch=str.toCharArray();
        for(int i=0;i<len;i++)
        {
            hs.add(ch[i]);
        }
        //System.out.println(hs);
        if(hs.size()%2!=0)
        {
            System.out.println("IGNORE HIM!");
        }
        else if(hs.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        
    }

}
