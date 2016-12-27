package algorithm.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort extends Thread{
	private Thread t;
	private String threadName;
	private List<Integer> intList;
	
	public InsertionSort(String threadName, List<Integer> intList){		
		this.threadName = threadName;
		this.intList = new ArrayList<Integer>(intList);
		
		System.out.println("Creating " + threadName);
	}
	
	public void run(){
		System.out.println("Running " + threadName);
		System.out.println(threadName + ": The list is: " + intList);
		
		int size = intList.size();
		Integer temp;
		
		for(int i = 1; i < size; i++){
			for(int j = i; j > 0; j--){
				if(intList.get(j) < intList.get(j-1)){
					
					temp = intList.get(j-1);
					intList.set(j-1, intList.get(j));
					intList.set(j, temp);
					
				} else break;
			}
		}
		
		System.out.println(threadName + ": The sorted list is: " + intList);
		System.out.println("Exiting " + threadName);
	}
	
	public void start(){
		System.out.println("Starting: " + threadName);
		
		if(t == null){
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
