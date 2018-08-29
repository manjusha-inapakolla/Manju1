import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
  public static void main (String[] args) throws java.lang.Exception
  {
      int i=0,t1=1,t2=2,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<n)
      {
	System.out.print(t1 + "  ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
      }

  }
}
