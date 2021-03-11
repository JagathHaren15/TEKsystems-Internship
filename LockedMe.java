import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LockedMe {

	public static File path = new File("C:\\Users\\DELL\\Desktop\\java tut\\phase1 Project\\src");
	public static List<String> fileList= new ArrayList();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\tWelcome to LockedMe.com!!\n");
		System.out.println("Developers Details:\nName - Jagath Haren");
		 int choice =1;
		while(true)
		{
			System.out.println("\nChoose an option");
			System.out.println("1: Display the current file names in ascending order.");
			System.out.println("2: Other file options.\n3: Exit.");

			System.out.print("Enter your choice : ");
			while (!sc.hasNextInt()) {
	            sc.next();
	            System.out.println("Invalid Choice. Try Again!!");
	            System.out.print("Enter your choice : ");
	        }
				choice = sc.nextInt();

			switch(choice)
			{
				case 1: System.out.println("\nThe file present in the current directory are :");
						DisplayFileNames();
						break;
						
				case 2:	fileOptions(sc);
						break;
						
				case 3: System.out.print("\nThank you for using the LockedMe.com Application!!");
						sc.close();
						System.exit(0);
						
			
				default: System.out.println("Invalid Choice");
				
			}
			
		}
			
	}

	private static void fileOptions(Scanner a) {
		
		while(true)
		{
			System.out.println("\nChoose an option");
			System.out.println("1: Add a file to the existing directory list.");
			System.out.println("2: Delete a file from the existing directory list.");
			System.out.println("3: Search a file from the main directory.");
			System.out.println("4: Navigate back to the main context.");
			
			System.out.print("Enter your choice : ");
			while (!a.hasNextInt()) {
	            a.next();
	            System.out.println("Invalid Choice. Try Again!!");
	            System.out.print("Enter your choice : ");
	        }

			int choice = a.nextInt();
			
			switch(choice)
			{
				case 1: System.out.print("Enter file name to add in the directory (with extension):\t");
				 		String fn1 = a.next();
				 		addFile(fn1,path);
						break;
						
				case 2:	System.out.print("Enter the file name to delete from the directory (Case Sensitive):\t");
		 				String fn2 = a.next();
		 				deleteFile(fn2,path);
						break;
						
				case 3: System.out.print("Enter the file name to search from the main directory (Case Sensitive):\t");
		 				String fn3 = a.next();
		 				searchFile(fn3,path);
						break;
						
				case 4:	System.out.println("Back to Main!");
						return;
						
				default: System.out.println("Invalid Choice");
			}
		}
	}

	private static void deleteFile(String fn2,File path) {
		
		File tFile=new File(path,fn2);
		try {
			if(tFile.exists() && tFile.getCanonicalPath().endsWith(tFile.getName())){
				 try
			        { 
			            tFile.delete();
			            System.out.println("File Deleted!!");
			        }  
			       catch(Exception e) 
			        { 
			    	   e.printStackTrace();
			        } 
			}
			else {
				System.out.println("File Does Not Exist to delete!!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void addFile(String fn1, File path) {
		
		File tFile=new File(path,fn1);
		if(!tFile.exists()){
			try {
				tFile.createNewFile();
				System.out.println("File Created!!");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File already Exists!!");
		}
	}

	private static void searchFile(String fn3, File path) {

	        File[] list = path.listFiles();
	        if(list!=null)
	        for (File f : list)
	        {
	            if (f.isDirectory())
	            {
	                searchFile(fn3,f);
	            }
	            else if (fn3.equalsIgnoreCase(f.getName()))
	            {
	                System.out.println("File Found in path : "+f.getParentFile());
	                return;
	            }
	        }	
	        System.out.println("File not found in the directory");
	}

	private static void DisplayFileNames() {
		
		displayFolders(path);	
		printAscendingFiles();
	}
	
	private static void displayFolders(File path) {
		
		File[] files = path.listFiles();

        for(File f : files)
        {
            if(f.isDirectory())
                displayFolders(f);
            if(f.isFile())
            {
            	fileList.add(f.getName());
            }
        }
	}

	private static void printAscendingFiles() {
		
		Collections.sort(fileList, String.CASE_INSENSITIVE_ORDER);
		for(String s : fileList)
        {
            System.out.println(s);
        }
		fileList.clear();
	}

}
