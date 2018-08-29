import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
  public static void main (String[] args) throws java.lang.Exception
  {
     int a,b,t;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     b=s.nextInt();
     t=a;
     a=b;
     b=t;
     System.out.println(a+" "+b);
  }
}
