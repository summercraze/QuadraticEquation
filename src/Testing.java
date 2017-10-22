
import java.util.Scanner;

public class Testing {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number a:");
	    double a = Double.parseDouble(input.nextLine());
	    System.out.print("Please enter the number b:");
	    double b = Double.parseDouble(input.nextLine());
	    System.out.print("Please enter the number c:");
	    double c = Double.parseDouble(input.nextLine());
	    QuadraticEquation  equation = new QuadraticEquation(a,b,c);
	    if(b > 0)
	    {
	    	System.out.println("The equation is :" + 
	    		    "\n" + equation.getA() + "x²" + "+" + equation.getB() + "x" + equation.getC() + " = 0" );
	    }
	    else
	    {
	    	System.out.println("The equation is :" + 
	    		    "\n" + equation.getA() + "x²" + equation.getB() + "x" + equation.getC() + " = 0" );
	    }
	    
	    double [] answer = equation.getRoot();
	    if(answer[0] == 0)
	    {
	    	System.out.println("There is no root"); 
	    }
	    else if (answer[0] == answer[1])
	    {
	    	System.out.println("There is one root. \nThe root is :" + answer[0]); 
	    	
	    }
	    else
	    {
	    	System.out.println("There are two roots. \nThe first root is :" + answer[0] 
	    			+ "\nThe second root is :" + answer[1]); 
	    }

	}
}
