package algorithm.search;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch extends Thread{
	private Thread t;
	private String threadName;	
	private List<Integer> intList;
	private Integer searchedItem;
	
	public LinearSearch(String threadName, List<Integer> intList, Integer searchedItem){
		this.threadName = threadName;
		this.intList = new ArrayList<Integer>(intList);
		this.searchedItem = searchedItem;
		System.out.println("Creating " + threadName);
	}
	
	public void run(){
		System.out.println("Running " + threadName);		
		System.out.println(threadName + ": The list is: " + intList);
		
		boolean flag = false;
		for(int i = 0; i < intList.size(); i++){
			if(intList.get(i) == searchedItem){
				System.out.println(threadName + ": The searched item '" + searchedItem + "' is at index '" + i + "'");
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println(threadName + ": The searched item '" + searchedItem + "' was not found");
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
