import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> emails = new ArrayList();
		System.out.println("Email Validation!!");
		while(true)
		{
			System.out.print(" Enter an email ID to check for its validity :");
			emails.add(sc.next());
			
			System.out.print("Add another element into string array?\n Enter 1:yes or 0:no\n");
			System.out.print(" choice:");
			int x = sc.nextInt();
			
			if(x==0)
				break;
		}
		
		String regex = "^[a-zA-Z0-9+_.-]+(?:\\.[a-zA-Z0-9+_.-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(regex);
		 
		for(String e : emails)
		{
		    Matcher matcher = pattern.matcher(e);
		    System.out.println( e +" : "+ matcher.matches());
		}
		sc.close();
	}
}
