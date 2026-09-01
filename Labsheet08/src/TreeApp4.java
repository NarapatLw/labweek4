import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree6();
		
		
		Scanner input = new Scanner(System.in);
			System.out.println("Enter data to search");
			int seach_data = input.nextInt();
			
			tree.printTree(tree.getRoot(),0);
			System.out.println("------------------------");
			
			if(tree.getSearchNode() == null) {
			System.out.println("Cannot found Node(data = "+seach_data+")");
			
			}else {
				System.out.println("left Child: "+tree.getSearchNode().left.data);
				System.out.println("right Child: "+tree.getSearchNode().right.data);
				if (tree.getSearchNode().left == null && tree.getSearchNode().right==null) {
					System.out.println(search_data+"is left Node");
					
				}else {
					System.out.println(search_data+"is Not left Node");
				}
				
			}
			
			
	}

}
