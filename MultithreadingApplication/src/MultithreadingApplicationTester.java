import java.util.Arrays;
import java.util.List;

import algorithm.search.BinarySearch;
import algorithm.search.LinearSearch;
import algorithm.sort.BubbleSort;
import algorithm.sort.InsertionSort;
import algorithm.sort.SelectionSort;

public class MultithreadingApplicationTester {
	public static void main(String args[]){
		List<Integer> searchList = Arrays.asList(1, 2, 4, 10, 17, 18, 25, 31, 36, 49, 53);
		Integer searchedItem = 4;
		
		List<Integer> sortList = Arrays.asList(62, 2, 4, 10, 7, 9, 4, 31, 22, 3, 3, 1);
		
		
		LinearSearch linearSearch = new LinearSearch("LinearSearch", searchList, searchedItem);
		BubbleSort bubbleSort = new BubbleSort("BubbleSort", sortList);
		BinarySearch binarySearch = new BinarySearch("BinarySearch", searchList, searchedItem);
		InsertionSort insertionSort = new InsertionSort("InsertionSort", sortList);
		SelectionSort selectionSort = new SelectionSort("SelectionSort", sortList);
		
		linearSearch.start();
		bubbleSort.start();
		binarySearch.start();
		insertionSort.start();
		selectionSort.start();
	}
}
