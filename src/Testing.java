import java.util.Scanner;
/*
 * This is the code that help to test the QuadraticEquaition class
 * It ask user for a,b,c which is the variable in the equation
 * It will make the calculation and then print out the result
 */
public class Testing {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is the form of the quadratic equation:" + "ax²+bx+c = 0");
		//let user enter a,b,c
		System.out.print("Please enter the number a:");
	    double a = Double.parseDouble(input.nextLine());
	    System.out.print("Please enter the number b:");
	    double b = Double.parseDouble(input.nextLine());
	    System.out.print("Please enter the number c:");
	    double c = Double.parseDouble(input.nextLine());

	    //call the quadratic equation to get answer
	    QuadraticEquation  equation = new QuadraticEquation(a,b,c);
	    //print the equation using the getter
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
	    //get the answer and print it
	    double [] answer = equation.getRoot();
	    if(answer[0] == 0)
	    {
	    	System.out.println("There is no root."); 
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
