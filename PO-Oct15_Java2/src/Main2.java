import java.util.Scanner;

public class Main2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1 = in.nextLine();
		System.out.println("Enter second string: ");
		String s2 = in.nextLine();
		System.out.println(checkRotation(s1, s2));
	}
	
	public static boolean checkRotation(String s1, String s2) {  
	        if (s1.length() != s2.length()) {  
	            return false;  
	        }  
	        String s3 = s1 + s1;  
	        if (s3.contains(s2)) {  
	            return true;  
	        }
	        else  {
	            return false;  
	        }  
	    }
}
