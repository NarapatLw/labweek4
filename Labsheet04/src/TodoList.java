
public class TodoList {

	public static void main(String[] args) {
		 DoublyLinkedList TodoList = new DoublyLinkedList(); //creat empty list
		
		 //add data in list
		 TodoList.insert("Finish Homework");
		 TodoList.insert("Laundry");
		 TodoList.insert("Group Meeting");
		 System.out.println("To-Do list ="+TodoList.traversal());
		 
		 TodoList.insert(0,"Submit report");
		 System.out.println("To-Do list ="+TodoList.traversal());
		 
		 TodoList.insert(2,"Buy Food");
		 System.out.println("To-Do list ="+TodoList.traversal());
		 
		 TodoList.insert("Go to Gym");
		 System.out.println("To-Do list ="+TodoList.traversal());
		 
		 TodoList.remove();
		 System.out.println("To-Do list ="+TodoList.traversal());
		 
		 TodoList.remove(3);
		 System.out.println("To-Do list ="+TodoList.traversal());
		 
		 TodoList.remove(0);
		 System.out.println("To-Do list ="+TodoList.traversal());
		
		 System.out.println("\nBackward Traversal ="+TodoList.backwardTraversal());
	}

}
