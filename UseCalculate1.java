interface Printable
    {
	void print();

    }

interface Calculate
    {
	int Calculate(int a);
	
   }

class Square implements Printable ,Calculate
    {
      int b;
	public int Calculate(int a)  
         {
		
                b=a*a;
		return b;
         }
        public void print()
         {
            System.out.println("The Square of a is: "+b);
         }
	
    }
class Cube implements Printable , Calculate
   {
    int c;
	public int Calculate(int a) 
            {
                
		 c=a*a*a;
		return c;
	    }
        public void print()
         {
            System.out.println("The Cube of a is: "+c);
         }
		
   }
public class UseCalculate1
       {
	public static void main(String[] args)
         {
		Square s=new Square();
		s.Calculate(3);
                s.print();
		Cube c=new Cube();
		c.Calculate(3);
                c.print();
	}
       }