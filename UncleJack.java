import java.math.BigInteger;
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger base = new BigInteger("0");
        int power;
    
        while(true){
            base = sc.nextBigInteger();
    		power = sc.nextInt();
    		if(power == 0 && base.compareTo(BigInteger.ZERO) == 0)
    			break;
    		base = base.pow(power);
    		System.out.println(base);
    	}
    }
} 
