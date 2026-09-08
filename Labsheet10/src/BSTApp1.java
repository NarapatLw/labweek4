
public class BSTApp1 {

	public static void main(String[] args) {
	
	BinarySearchTree tree = new BinarySearchTree();
	tree.sampleTree1();
	tree.printTree(tree.getRoot(), 0);
	
	tree.findMinimum(tree.getRoot());
	//no.3
	System.out.println();
	System.out.println("Minimum Node is  "+tree.findMinimum(tree.getRoot()).data);
	System.out.println("Maximum Node is  "+tree.findMaximum(tree.getRoot()).data);
	
	// no.5
	int target = 40 ;
	System.out.println("Is "+target+" in BST => "+ tree.findSpecificData(target));
	
	//no.7
	int delNode = 60;
	tree.searchDeleteNode(delNode);
	System.out.println("Delete Node is "+tree.getDeleteNode().data);
	
	//no.9
	System.out.println();
	tree.delete(delNode);
	tree.printTree(tree.getRoot(), 0);
	
	}
}
    