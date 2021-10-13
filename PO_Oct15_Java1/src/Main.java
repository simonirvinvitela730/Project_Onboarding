import java.util.HashMap;

public class Main {
	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "blueberry");
		hm.put(2, "strawberry");
		hm.put(3,  "raspberry");
		hm.put(4, "blackberry");
		hm.put(5, "mullberry");
		
		while(hm.isEmpty() == false) {
			for (HashMap.Entry<Integer,String> entry : hm.entrySet()) {
			    int key = entry.getKey();
			    String value = entry.getValue();
			    System.out.println(key + ":" + " " + value);
			}
			hm.remove(1);
			hm.remove(2);
			hm.remove(3);
			hm.remove(4);
			hm.remove(5);
		}
		
	}
	
	
}
