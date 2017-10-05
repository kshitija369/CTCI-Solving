package stringQuesSoln;

public class LinkedList {
	public int[] list = null;
	public int size = 0;
	
	public LinkedList(){
		create();
	}

	public void create(){
		list = new int[128];
	}

	public void destroy(){
		list = null;
	}

	public void add(int element){
		if(size < 128)
			list[size++] = element;
	}

	public void remove(int element){
		int tmp = size - 1; 
		int found = 0;
		for(int i = 0; i < tmp; i++){
			if(element == list[i]){
				found = 1;
			}
			if(found == 1){
				list[i] = list[i+1];
			}
		}
		if(found == 0 && list[size - 1] == element){
			found = 1;
		}
		if(found == 1){
			size--;
		}
	}

	public void traverse(){
		for(int i = 0; i < size; i++){
			System.out.println("arr[" + i + "]: " + list[i]);
		}
	}

	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;
	}

	public int[] search(int element){
		int[] idx = new int[size];
		int x = 0;
		for(int i = 0; i < size; i++){
			idx[i] = -1;
		}
		for(int i = 0; i < size; i++){
			if(element == list[i]){
				idx[x++] = i;
			}
		}
		return idx;
	}
	
	public int search_org(int element){
		int idx = -1;
		for(int i = 0; i < size; i++){
			if(element == list[i]){
				idx = i;
				return idx;
			}
		}
		return idx;
	}
}
