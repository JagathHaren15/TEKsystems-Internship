import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("File Handling!!");
		while(true) {
		System.out.println("\n1:Read contents of file \t2:Write contents to file\t3:Append to a file\t4:Exit");
		System.out.print("Enter choice:");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			 System.out.print("enter file name to read contents from:");
			 String fn1 = sc.next();
			 try {
					FileReader input = new FileReader(fn1);
						try {
							char[] buf = new char[128];
							int x = input.read(buf);
							
							while(x!=-1)
							{
								System.out.print(buf);
								x = input.read(buf);
							}
						}
						finally
						{
							input.close();
						}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			break;
		case 2:
			System.out.print("enter file name to write contents to:");
			 String fn2 = sc.next();
			 System.out.print("enter contents to write to file "+fn2+":");
			 String content = sc.next();
			try {
					FileWriter output = new FileWriter(fn2);
						output.write(content,0,content.length());
						output.close();
				System.out.println("contents added successfully to file "+fn2);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			break;	
		case 3:
			System.out.print("enter file name to append contents to:");
			 String fn3 = sc.next();
			 System.out.print("enter contents to append to file "+fn3+":");
			 String content2 = sc.next();
			try {
					FileWriter output2 = new FileWriter(fn3,true);
						output2.write(content2);
						output2.close();
				System.out.println("contents added successfully to file "+fn3);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}

			break;
		case 4:
			 System.out.println("Thank You!");
			 System.exit(0);
			break;
		default: System.out.println("Invalid choice!");
		
		}
	}

	}

}
