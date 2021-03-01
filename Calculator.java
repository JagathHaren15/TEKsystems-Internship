import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	float num1,num2;
	int choice;
	String ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Calculator!!");
	while(true)
	{
		System.out.print("\nEnter a number 1 : ");
		num1 = sc.nextFloat();
		System.out.print("Enter a number 2 : ");
		num2 = sc.nextFloat();
		
		System.out.println("Choose an option");
		System.out.println("1:Addition\t2:Subtraction\t3:Multiplication\t4:Division\t5:End Calculator");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1: System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
					break;
					
			case 2: System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
					break;
					
			case 3: System.out.println("Multiplication of "+num1+" and "+num2+" is "+num1*num2);
					break;
					
			case 4: 
					if(num2==0) 
					{
						System.out.println("Denominator can not be Zero");
						break;
					}
					System.out.println("Division of "+num1+" and "+num2+" is "+num1/num2);
					break;
					
			case 5: System.out.print("Thank you for using the Calculator!!");
					sc.close();
					System.exit(0);
					
			default: System.out.println("Invalid Choice");
		}
		System.out.println("Do you wish to continue?\n Yes or No");
		ch = sc.next();
		if(ch.equalsIgnoreCase("no"))
		{
			System.out.print("Thank you for using the Calculator!!");
			sc.close();
			System.exit(0);
		}
	}
	}

}
