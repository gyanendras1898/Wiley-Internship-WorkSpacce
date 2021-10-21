package algo.sort;

public class QuickSort extends Sort {
	
	public void sort(int[] arr) {
		setArr(arr);
		quickSort(arr,0,getLen()-1);
	}
	
	private int partition(int[] arr,int start, int end){
		int pivot=arr[start];
		int i=start+1;
		int j=end;
		while(j>=i){
			if(arr[j]>=pivot) j--;
			else{
				swap(i,j);
				i++;
			}
		}
		swap(start,j);
		return j;
	}
	private void quickSort(int[] arr,int start, int end){
		if(start<end){
			int partIdx=partition(arr,start,end);
			quickSort(arr,start,partIdx-1);
			quickSort(arr,partIdx+1,end);
		}
	}

}
