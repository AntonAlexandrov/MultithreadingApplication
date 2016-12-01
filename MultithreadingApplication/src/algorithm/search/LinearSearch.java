package algorithm.search;

import java.util.Arrays;
import java.util.List;

public class LinearSearch extends Thread{
	private Thread t;
	private String threadName;
	
	private List<Integer> intList = Arrays.asList(1, 2, 4, 10, 7, 8, 5, 11, 6, 9, 3, 12);
	private Integer searchedItem = 4; /*the item we will be searching for*/
	
	public LinearSearch(String threadName){
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}
	
	public void run(){
		System.out.println("Running " + threadName);
		
		System.out.println("The list is: " + intList);
		
		boolean flag = false;
		for(int i = 0; i < intList.size(); i++){
			if(intList.get(i) == searchedItem){
				System.out.println("The searched item '" + searchedItem + "' is at index '" + i + "'");
				flag = true;
			}
		}
		if(!flag){
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
