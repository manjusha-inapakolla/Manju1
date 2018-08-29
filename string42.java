import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
  public static void main (String[] args) throws java.lang.Exception
  {
       String s1,s2;
       Scanner sc=new Scanner(System.in);
       s1=sc.next();
       s2=sc.next();
       if(s1.length()>s2.length())
       {
	 System.out.print(s1);
       }
       else if(s2.length()>s1.length())
       {
	 System.out.print(s2);
       }
       else 
       {
	 System.out.print(s2);
       }
  }
}
