import java.util.Scanner;
public class QuadraticEquation
{
   private double a,b,c,discriminant,root1,root2;
   private double [] answer = new double[2];
   
   public QuadraticEquation(double a,double b,double c)
   {
	   this.a = a;
	   this.b = b;
	   this.c = c;
   }
   public QuadraticEquation()
   {
	   this(0.0,0.0,0.0);
   }
   public double getA()
   {
	   return a;
   }
   public double getB()
   {
	   return b;
   }
   public double getC()
   {
	   return c;
   }
 
   private double getDiscriminant()
   {
	   this.discriminant = ((Math.pow(b, 2)) - (4*a*c));
	   return discriminant;
   }
   private double getRoot1()
   {
	   root1 = ((b*(-1)) - ( Math.sqrt(discriminant)))/(2*a);
	   return root1;
   }
   private double getRoot2()
   {
	   root2 = ((b*(-1)) + ( Math.sqrt(discriminant)))/(2*a);
	   return root2;
   }
   private double[] fillArray(double[] list)
   {
	   for (int i = 0 ; i < list.length ; i++)
	   {
		   list[i] = 0;
	   }
	   return list;
   }
   public double[] getRoot()
   {
	   this.answer = fillArray(answer);
	   if (this.getDiscriminant() > 0)
	   {
		   answer[0]  = this.getRoot1();
		   answer[1]  = this.getRoot2();
	   }
	   else if (this.getDiscriminant() == 0)
	   {
		   answer[0] = this.getRoot1();
	   }
	   else
	   {
		   answer[0] = 0;
	   }
	   return answer;
   }
}
