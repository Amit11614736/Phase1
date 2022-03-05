package Practice_Project;

import java.util.Scanner;

public class P1_Arithmetic_Calculator 
{

	public static void main(String[] args) {
		char optr;
		double a,b;
		Scanner x=new Scanner(System.in);
		System.out.println("\t\tChoose from following\n\n\t\t for Addition: +\n\t\t for subtraction: -\n \t\tfor multiplication: *\n\t\t for division: /");
		optr=x.next().charAt(0);
		System.out.println("\t\tEnter First num : ");
		a=x.nextDouble();
		System.out.println("\t\tEnter second num : ");
		b=x.nextDouble();
		switch(optr)
		{
		case '+':
			double add=a+b;
			System.out.println("\t\tAddition is: "+add);
			break;
		case '-':
			double sub =a-b;
			System.out.println("\t\tSub: "+sub);
			break;
		case '*':
			double mul=a*b;
			System.out.println("\t\tMultiply is: "+mul);
			break;
		case '/':
			double div=a/b;
			System.out.println("\t\tDivision : "+div);
			break;
		default:
			
			System.out.println("\t\tINVALID OPTION");
			break;
		}
		x.close();
	}

}
