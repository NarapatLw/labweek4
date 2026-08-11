import java.util.ArrayList;

public class ListReverse {

	public static void main(String[] args) {
		ArrayList<Integer> org = new ArrayList<Integer>();
		for (int i = 11;i<=20;i++) {
			org.add(i);
		}
		System.out.println("Original List: "+org);
		ArrayList<Integer> reverse = rev(org);
		System.out.println("Reverse List: "+ reverse);
		

	}
	public static ArrayList<Integer> rev(ArrayList<Integer> ori){
		ArrayList<Integer> revresult = new ArrayList<Integer>();
				for (int i = ori.size()-1;i>=0;i--) {
					revresult.add(ori.get(i));
				}
				return revresult;
		
		 
	}
}
