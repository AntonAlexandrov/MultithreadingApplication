package algorithm.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort extends Thread{
	Thread t;
	String threadName;
	List<Integer> intList;
	
	public BubbleSort(String threadName, List<Integer> intList){
		this.threadName = threadName;
		this.intList = new ArrayList<Integer>(intList); //copy the given list, so we can sort the new one
		System.out.println("Creating " + threadName);
	}
	
	public void run(){
		System.out.println("Running: " + threadName);
		System.out.println(threadName + ": The list is: " + intList);
		
		int size = intList.size();
		boolean swap = false;
		Integer tmp;
		
		for(int i = 0; i < size; i++){
			for(int j = 1; j < size; j++){
				if(intList.get(j-1) > intList.get(j)){
					
					tmp = intList.get(j);
					intList.set(j, intList.get(j-1));
					intList.set(j-1, tmp);
					
					swap = true;
				}
			}			
			if(!swap){
				break;
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
