import java.util.Arrays;
import java.util.List;

import algorithm.search.LinearSearch;

public class MultithreadingApplicationTester {
	public static void main(String args[]){
		List<Integer> intList = Arrays.asList(1, 2, 4, 10, 7, 8, 5, 11, 6, 9, 3, 12);
		Integer searchedItem = 4;
		
		LinearSearch linearSearch = new LinearSearch("LinearSearch", intList, searchedItem);
		
		linearSearch.start();
	}
}
