package algo.sort;

public class BubbleSort extends Sort {	
	
	public void sort(int arr[]) {
		super.setArr(arr);
		bubbleSort(arr);
	}
	
	private void bubbleSort(int[] arr){
		int flag;
	for(int i=0;i<getLen()-1;i++){
		flag=0;
		for(int j=0;j<getLen()-i-1;j++){
			if(arr[j]>arr[j+1]) {
				swap(j,j+1);
				flag=1;
			}
				
		}
		if(flag==0) break;
	}
}

}
