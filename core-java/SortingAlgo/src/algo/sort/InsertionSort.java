package algo.sort;

public class InsertionSort extends Sort {
	
	public void sort(int arr[]) {
		setArr(arr);
		insertionSort(arr);
	}
	
	private void insertionSort(int[] arr){
	for(int i=1;i<getLen();i++){
		int x=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>x){
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=x;
	}
}

}
