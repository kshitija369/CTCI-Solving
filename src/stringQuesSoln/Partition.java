package stringQuesSoln;

public class Partition {
	
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
		partition(ll, 5);
		
		ll.traverse();
		System.out.println("--------------------");		
	}


	// 14_Ch02_Q04 / Partition: Write a code to partition a linked list around a value x, 
	// such that all nodes less than x only need to be after the elements less than x (see example below). 
	// The partition element x can appear anywhere in the "right partition"; it does not need to appear 
	// between the left and right partitions.
	// Example
	// Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
	// Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
	private static void partition(LinkedList ll, int ele) {	
		int splitter = ele;
		int i = 0; int j = ll.size-1;
		while(true){
			while(ll.list[i] < splitter)
				i++;
			while(ll.list[j] > splitter)
				j--;
			if(i<j) 
				swap(ll,i,j);
			else
				return;
		}
	}

	private static void swap(LinkedList ll, int i, int j) {
		int temp = ll.list[i];
		ll.list[i] = ll.list[j];
		ll.list[j] = temp;	
	}	
}
