import java.util.*;

public class Collection {	
	
	public static void main(String args[]) {
		int[] numberSet1 = {1,2,3,4,5,6,7,8,9,10};
		int[] numberSet2 = {6,7,8,9,10,11,12,13,14,15};
		
		//create linked lists
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		
		//add numbers to the lists
		for(int i: numberSet1) 
			list1.add(i);
		
		for(int i: numberSet2) 
			list2.add(i);
		
		
		//shuffle lists
		Collections.shuffle(list1);
		Collections.shuffle(list2);
		
		//print lists
		System.out.println(list1.toString() + " \t Size of: \t " + list1.size());
		System.out.println(list2.toString() + " \t Size of: \t " + list2.size());
		
		//sort the lists before merging
		Collections.sort(list1);
		Collections.sort(list2);
		
		//combine the lists 
		List<Integer> list3 = new LinkedList<Integer>();
		
		//copy all of list one into list 3, then iterate through list 2 checking if list one contains the element
		list3.addAll(list1);
		for(int i: list2) {
			if (!list3.contains(i)) 
			list3.add(i);
		}
		
		//remove middle entry of list 3 
		//works for odd number size
		list3.remove(list3.size()/2);
		
		//reverse collections
		Collections.reverse(list3);

		//print lists
		System.out.println();
		System.out.println(list3.toString() + " \t Size of: \t " + list3.size());
		
		//defining new key value pair collection
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(0, "tom");
		map.put(3, "bob");
		map.put(1, "butch");
		map.put(4, "sally");
		map.put(5, "amanda");
		
		System.out.println(map.containsKey(0));
		
	}
}
