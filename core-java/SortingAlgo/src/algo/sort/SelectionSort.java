package algo.sort;

public class SelectionSort extends Sort{
	
	public void sort(int[] arr) {
		super.setArr(arr);
		selectionSort(arr);
	}
	
	private void selectionSort(int[] arr){
	int k;
	for(int i=0;i<getLen()-1;i++){
		for(int j=k=i;j<getLen();j++){
			if(arr[j]<arr[k]) k=j;
		}
		swap(i,k);
	}
}

}
