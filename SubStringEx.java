import java.io.*;
import java.util.*;
public class SubStringEx
{
  public static void main(String args[])
   {
     String str="Welcome";
     Scanner sc=new Scanner(System.in);
     System.out.println("Please Enter String value");
     String s=sc.next();
     String s1=s.substring(3,8);
     //String str=s.subSequence(2,5);
     System.out.println("Substring of Enter text is:"+s1);
     System.out.println("Subsequense of Enter text is:"+str.subSequence(2,5));
     
   }
}