import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String to convert using Atbash Cypher:");
		String s1 = in.nextLine();
		System.out.println(Cipher(s1));
	}
	
	public static String Cipher(String s1) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < (s1.length()); i++) {
			char c = s1.charAt(i);
			
			if(alphabet.indexOf(Character.toLowerCase(c)) > -1) {
				int n = Math.subtractExact(25, s1.indexOf(c));
				if(Character.isUpperCase(c)) {
					sb.append(Character.toUpperCase(alphabet.charAt(n)));
				}else {
					sb.append(alphabet.charAt(n));
				}
			}else {
					sb.append(c);
				}
			}
		return sb.toString();
        
	}
}
