
public class TreeApp2 {

	public static void main(String[] args) {
		System.out.println("\n--------------------------------");
		System.out.println("Binary tree from createTree4()");
		System.out.println("--------------------------------");
		
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);

		tree.createTree5();
		tree.printTree(tree.getRoot(), 0);
		
		
		
		
		
		
	}

}
