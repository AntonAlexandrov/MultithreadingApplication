package algorithm.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch extends Thread{
	private Thread t;
	private String threadName;
	private List<Integer> intList;
	private Integer searchedItem;
	
	public BinarySearch(String threadName, List<Integer> intList, Integer searchedItem){
		this.threadName = threadName;
		this.intList = new ArrayList<Integer>(intList);
		this.searchedItem = searchedItem;
		System.out.println("Creating " + threadName);
	}
	
	public void run(){
		System.out.println("Running " + threadName);
		System.out.println("The list is: " + intList);
		
		Integer begin = 0;
		Integer end = intList.size() - 1;
		Integer middle = -1;
		
		while(begin <= end){
			middle = begin + (end - begin) / 2;
//			middle = end + begin / 2; 
			
			if(intList.get(middle) == searchedItem){
				System.out.println("The searched item '" + searchedItem + "' is at index '" + middle + "'");
				break;
			} else if(intList.get(middle) > searchedItem){
				end = middle - 1;
			} else /*if(intList.get(middle) < searchedItem)*/{
				begin = middle + 1;
			}
		}
		
		if(intList.get(middle) != searchedItem){
			System.out.println("The searched item '" + searchedItem + "' was not found");
		}
		
		System.out.println("Exiting " + threadName);		
	}
	
	public void start(){
		System.out.println("Starting " + threadName);
		
		if(t == null){
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
