package stringQuesSoln;

public class ReturnKthToLast {
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
		returnkthToLast(ll, 2);
		
		ll.destroy();
	}
	
	// 12_Ch02_Q02 / Return kth to last: Implement an algorithm to find 
	// the kth to last element of a singly linked list.
	public static void returnkthToLast(LinkedList ll, int k){
		int idx = ll.size - k;
		// traverse ll still idx and print ele at index idx
		System.out.println(ll.list[idx]);
	}
}
