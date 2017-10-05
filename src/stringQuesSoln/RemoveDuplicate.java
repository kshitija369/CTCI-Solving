package stringQuesSoln;
import stringQuesSoln.LinkedList;

public class RemoveDuplicate {
	
	public static void main(String[] args){	
		LinkedList ll = new LinkedList();
		ll.add(5);
		ll.add(1);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		ll.add(6);
		ll.add(3);
		ll.add(4);
		
		ll.traverse();
		System.out.println("--------------------");
		removeDup(ll);
		ll.traverse();		
		System.out.println("--------------------");
		ll.destroy();
	}
	
	// 11_Ch02_Q01 / Remove Duplicate: Write a code to remove duplicates from an unsorted 
	// linked list without using a temporary buffer.
	public static void removeDup(LinkedList ll){
		int[] idx = null;
		for(int i = 0; i < ll.size; i++){
			int currEle = ll.list[i];
			idx = ll.search(currEle);
			for(int j = 1; idx[j] != -1; j++){
				ll.remove(ll.list[j]);
			}
		}
	}
}
