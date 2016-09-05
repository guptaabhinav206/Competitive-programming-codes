import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class CapsLock {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String inp = in.readLine();
        char[] input = inp.toCharArray();

        boolean invert = true;
        boolean firstLower = Character.isLowerCase(input[0]);

        if(firstLower){
            for(int i = 1; i < input.length;i++){
                if(!Character.isUpperCase(input[i])){
                    invert = false;
                    break;
                }
            }

        }else{
            for(char a:input){
                if(!Character.isUpperCase(a)){
                    invert = false;
                    break;
                }
            }   
        }

        if(invert == true){
            StringBuffer solution = new StringBuffer();
            for(char c:input){
                if(Character.isUpperCase(c)){
                    solution.append(Character.toLowerCase(c));
                }else{
                    solution.append(Character.toUpperCase(c));
                }
            }
            out.println(solution);

        }else{
            out.println(inp);
        }

        in.close();
        out.flush();
        out.close();
    }

}
