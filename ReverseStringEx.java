import java.io.*;
import java.util.*;
public class ReverseStringEx
{
  public static void main(String args[])
   {
     String Str=" ";
     char ch;
     String inUpper=" ";
     Scanner sc=new Scanner(System.in);
     System.out.println("Please Enter String value");
     String str=sc.next();
      for(int i=0; i<str.length();i++)
        {
          ch=str.charAt(i);
          Str=ch+Str;
          inUpper=str.toUpperCase(); 
          
        }
     System.out.println("Reverse String is : "+Str);
     System.out.println("Reverse String is : "+inUpper);
   }
}