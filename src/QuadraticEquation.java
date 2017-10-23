/*
 * This is a code that help to calculate the quadratic equation
 * by using the quadratic formula.The code would calculate
 * out the number of root based on determinant and calculate
 *the root respectively
 */
public class QuadraticEquation
{
	//this is all the variable used in program
   private double a,b,c,discriminant,root1,root2;
   //array to hold the answer
   private double [] answer = new double[2];
   
   //constructor
   public QuadraticEquation(double a,double b,double c)
   {
	   this.a = a;
	   this.b = b;
	   this.c = c;
   }
   //default constructor
   public QuadraticEquation()
   {
	   this(0.0,0.0,0.0);
   }
   
   //getters
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
   
   //calculate the discriminant
   private double getDiscriminant()
   {
	   this.discriminant = ((Math.pow(b, 2)) - (4*a*c));
	   return discriminant;
   }
   //calculate the first root
   private double getRoot1()
   {
	   root1 = ((b*(-1)) - ( Math.sqrt(discriminant)))/(2*a);
	   return root1;
   }
   //calculate the second root
   private double getRoot2()
   {
	   root2 = ((b*(-1)) + ( Math.sqrt(discriminant)))/(2*a);
	   return root2;
   }
   //helper method to fill the array with number
   private double[] fillArray(double[] list)
   {
	   for (int i = 0 ; i < list.length ; i++)
	   {
		   list[i] = 0;
	   }
	   return list;
   }
   
   //figure out how many root to calculate depend on determinant
   public double[] getRoot()
   {
	   //fill the array  with 0 first
	   this.answer = fillArray(answer);
	   //depent on the discriminant calculated and decide the answer
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
