import java.util.ArrayDeque;
import java.util.Deque;


public class StackReverse {

	
	
	public static void main(String[] args) {
		String ori = "Hello world";
		System.out.println("original => "+ori);
		System.out.println("reverse => "+reverseCharacter(ori));
		
		
	}public static String reverseCharacter(String ori) {
			Deque<Character> stack = new ArrayDeque<Character>();
			
				for (int i = 0;i<ori.length();i++) {
					stack.push(ori.charAt(i));
				}
			StringBuilder reverse = new StringBuilder();
			while(!stack.isEmpty()) {
			reverse.append(stack.pop());}
		
		return reverse.toString();
	}
}
