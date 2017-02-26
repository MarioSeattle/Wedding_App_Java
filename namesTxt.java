import myClasses.Person.*;
import java.io.*;
import java.util.*;
public class namesTxt {
	
private static int numGuests =  500;
	
	public static void main(String[] args) {
		readTextFileUsingScanner ("/Users/Mgomez/documents/workspace/Mario_Marco/src/500names.txt");
		
	}
	
	public static void readTextFileUsingScanner(String file) {
	    try {
	             Scanner sc = new Scanner(new File(file));

	             for (int i = 0; i < numGuests; i++) {
	                   String str = sc.nextLine();
	                   System.out.println(str);
	              }
	              sc.close();
	      } catch (IOException e) {
	           // TODO Auto-generated catch block
	           e.printStackTrace();
	      }
	}
	

}
