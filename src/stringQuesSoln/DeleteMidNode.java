package stringQuesSoln;

public class DeleteMidNode {

	public static void main(String[] args){	
		LinkedList ll = new LinkedList();
		ll.add(5);
		ll.add(1);
		ll.add(3);
		ll.add(2);
		ll.add(6);
		ll.add(4);
		
		ll.traverse();
		System.out.println("--------------------");
		deleteNode(ll, 2);
		
		ll.traverse();
		System.out.println("--------------------");		
		ll.destroy();
	}

	
	// 13_Ch02_Q03 / Delete Middle Node: Implement an algorithm to delete a node in the middle 
	// (i.e. any node but the first and last node, not necessarily the exact middle node) of a singly linked list, 
	// given only access to that node.
	// Example
	//  Input: the node c from the linked list a-> b -> c -> d -> e -> f (you don't have referece to root element)
	//  Output: Nothing is returned, but the new linked list looks like a-> b -> d -> e -> f	
	private static void deleteNode(LinkedList ll, int ele) {
		ll.remove(ele);
	}

}
