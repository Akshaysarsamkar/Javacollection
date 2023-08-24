import java.util.*;
public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>(); 
		
		//add the element in the linked list
		li.add(20);
		li.add(40);
		li.add(90);
		li.add(10); 
		System.out.println(li);
		
		//add element at the end
		li.addLast(67);
		System.out.println("After adding element at the end"+li);
		
		//add element at the first 
		li.addFirst(1);
	System.out.println("After adding element at the Beginning"+li);
		
		
	//get the element
		System.out.println("accessed element of 2 index is:"+li.get(2));
		
		//get last element 
		System.out.println("accessed last element is:"+li.getLast()); 
		
		
		//get first element
			System.out.println("accessed First element is:"+li.getFirst()); 
			
			//size of linked list
			int size = li.size();
			System.out.println("Size of Linked list:"+size);
			
			//remove the element
			li.remove(1);
				System.out.println("Remove the first index element then"+li); 
				
		 //remove first element
		 li.removeFirst();
			System.out.println("Remove the first  element then"+li);
			
			//remove last element
				 li.removeLast();
			System.out.println("Remove the Last  element then"+li);
			
	
	}
} 
