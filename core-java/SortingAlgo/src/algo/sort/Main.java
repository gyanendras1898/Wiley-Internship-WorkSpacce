package algo.sort;

public class Main {
	public static void main(String[] args) {
		int arr[]= {8,5,7,6};
		
		MergeSort mergeSort=new MergeSort();
		InsertionSort insertionSort=new InsertionSort();
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		QuickSort quickSort = new QuickSort();
		BucketSort bucketSort = new BucketSort();
		RadixSort radixSort = new RadixSort();
		CountSort countSort=new CountSort();
		
		System.out.println("Before Sort");
		for(int ele:arr)
			System.out.print(ele+" ");
		System.out.println();
		
//		mergeSort.sort(arr);	  System.out.println("Merge Sort");
//		insertionSort.sort(arr);  System.out.println("Insertion Sort");
		bubbleSort.sort(arr);	  System.out.println("Bubble Sort");
//		selectionSort.sort(arr);  System.out.println("Selection Sort");
//		quickSort.sort(arr);	  System.out.println("Quick Sort");
//		bucketSort.sort(arr);     System.out.println("Bucket Sort");
//		radixSort.sort(arr);      System.out.println("Radix Sort");
//		countSort.sort(arr);      System.out.println("Count Sort");
		
		for(int ele: arr)
			System.out.print(ele+" ");
	}

}
