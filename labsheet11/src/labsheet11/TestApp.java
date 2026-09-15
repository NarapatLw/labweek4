package labsheet11;

public class TestApp {

	public static void main(String[] args) {
		
		int[] nums =  {11, 9, 23, 87, 38, 22, 92, 10};
		
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		sort.printSortData();
		
		System.out.println();
		Sorting sort1 = new Sorting(nums);
		sort.bubbleSort(true);
		sort.printSortData();
		
		//No.2
		int[] nums2 =  {25, 11, 45, 6, 87, 20, 78, 64} ;
		System.out.println(); 
		Sorting sort2 = new Sorting(nums2);
		sort2.selectionSort();
		sort2.printSortData();
		
		//No.4
		int[] nums4 =  {68, 10, 87, 75, 14, 36, 98, 76} ;
		System.out.println(); 
		Sorting sort4 = new Sorting(nums4);
		sort4.insertionSort();
		sort4.printSortData();
		
		//No.6
				int[] nums6 =  {87, 11, 26, 35, 49, 85, 21, 46} ;
				System.out.println(); 
				Sorting sort6 = new Sorting(nums6);
				sort6.quicksort();
				sort6.printSortData();
	}

}
