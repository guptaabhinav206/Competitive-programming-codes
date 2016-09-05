import java.math.*;
    import java.util.*;
    import java.lang.*;
    import java.io.*;
 
    class Ideone
    {
 
    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner sc = new Scanner(System.in);
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t=sc.nextInt();
    BigInteger a,b,p,q,r;
     BigInteger arr[]=new BigInteger[1005];
 
	BigInteger w[]=new BigInteger[1005];
    int oe,m,k,ob,i,g,n;
    for(g=0;g<t;g++)
    {
 
    n=sc.nextInt();
    m=n;
 
 
 
    for(i=0;i<n;i++)
    {
    arr[i] = sc.nextBigInteger();
    }
 
    a = new BigInteger("0");
    b = new BigInteger("1");
 
  p = sc.nextBigInteger();
    q = sc.nextBigInteger();
     r = sc.nextBigInteger();
 
 String s;
    s = sc.next();
   // System.out.println(s);
 oe=1;ob=0;
    for(i=0;i<n;i++)
    {
   // System.out.println(s.charAt(i));
 
   if(s.charAt(i)=='R')
   {
       oe=oe+1;
       if(oe%2==0)
       {
       w[i]=((b.multiply(arr[--m])).add(a)).mod(r);
 
       }
       else
       {
 
       w[i]=((b.multiply(arr[ob++])).add(a)).mod(r);
 
       }
   }
    else
    if(s.charAt(i)=='A')
    {
 
    if(oe%2==0)
    {
    a=(a.add(p)).mod(r);	
    w[i]=((b.multiply(arr[--m])).add(a)).mod(r);
 
 
    }
 
    else
    {
    	a=(a.add(p)).mod(r);
    w[i]=((b.multiply(arr[ob++])).add(a)).mod(r);
 
 
    }
    }
    else
    if(s.charAt(i)=='M')
    {
     if(oe%2==0)
    {
 
        a=(a.multiply(q)).mod(r);
        b=(b.multiply(q)).mod(r);
      w[i]=((b.multiply(arr[--m])).add(a)).mod(r);
 
 
   // System.out.println("abc");
    }
    else
    {
        a=(a.multiply(q)).mod(r);
        b=(b.multiply(q)).mod(r);
    w[i]=((b.multiply(arr[ob++])).add(a)).mod(r);
 
    //System.out.println("abc");
    }
    }
     System.out.print(w[i]+" ");
 
    }
 
 
 //for(i=0;i<n;i++)
 //System.out.print(w[i]+" ");
    System.out.println();
    }
 
    }
    } 
