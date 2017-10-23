
import java.util.Scanner;

public class Testing {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is the form of the quadratic equation:" + "ax�+bx+c = 0");
		//enter a,b,c
		System.out.print("Please enter the number a:");
	    double a = Double.parseDouble(input.nextLine());
	    System.out.print("Please enter the number b:");
	    double b = Double.parseDouble(input.nextLine());
	    System.out.print("Please enter the number c:");
	    double c = Double.parseDouble(input.nextLine());
	    //enter the number to a,b,c to the quadratic equation to get the answer
	    QuadraticEquation  equation = new QuadraticEquation(a,b,c);
	    //print the equation
	    if(b > 0)
	    {
	    	System.out.println("The equation is :" + 
	    		    "\n" + equation.getA() + "x�" + "+" + equation.getB() + "x" + equation.getC() + " = 0" );
	    }
	    else
	    {
	    	System.out.println("The equation is :" + 
	    		    "\n" + equation.getA() + "x�" + equation.getB() + "x" + equation.getC() + " = 0" );
	    }
	    //get the answer and print it
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
	    			+ "\nThe second root is : " + answer[1]); 
	    }

	}
}
