package cal;
import java.util.*;
public class Calculator {
	
	int add(int a,int b) {
		
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	long mul(int a,int b) {
		return a*b;
	}
	float div(int a,int b) {
		return (float)a/b;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		System.out.println("Simple Calculator\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\nEnter your choice");
		int n=sc.nextInt();
		while(n!=5) {
			
			switch(n) {
			case 1: {
					System.out.println("Enter Number");
					int a=sc.nextInt();
					System.out.println("Enter Number");
					int b=sc.nextInt();
					System.out.println("Addition is: "+c.add(a,b));
				}
				break;
			case 2: {
					System.out.println("Enter Number");
					int a=sc.nextInt();
					System.out.println("Enter Number");
					int b=sc.nextInt();
					System.out.println("Subtraction is: "+c.sub(a,b));
				}
				break;
			case 3: {
					System.out.println("Enter Number");
					int a=sc.nextInt();
					System.out.println("Enter Number");
					int b=sc.nextInt();
					System.out.println("Subtraction is: "+c.mul(a,b));
				}
				break;
			case 4: {
					System.out.println("Enter Number");
					int a=sc.nextInt();
					System.out.println("Enter Number");
					int b=sc.nextInt();
					System.out.println("Subtraction is: "+c.div(a,b));
				}
				break;
			default:
				System.out.println("Invalid Input");
				
				
					
			}
			System.out.println("Simple Calculator\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter your choice");
			n=sc.nextInt();
		}
		
		System.out.println("Thank you");
	}

}
