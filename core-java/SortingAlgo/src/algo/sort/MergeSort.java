package algo.sort;

public class MergeSort {
	private int[] arr;
	
	public void sort(int arr[]) {
		this.arr=arr;
		mergeSort(this.arr,0,this.arr.length-1);
	}
	
	 private void merge(int arr[],int start,int mid,int end){
	 	int i=start;
	 	int j=mid+1;
	 	int k=0;
	 	int B[]=new int[end-start+1];
	 	
	 	while(i<=mid && j<=end)
	 		B[k++]=(arr[i]<=arr[j])? arr[i++]: arr[j++];
	 	
	 	while (i<=mid)
	 		B[k++]=arr[i++];
	 	
	 	while (j<=end)
	 		B[k++]=arr[j++];
	 	
	 	 k=0;
	 	for(i=start;i<=end;i++)
	 		arr[i]=B[k++];
	 }
	
	 private void mergeSort(int arr[],int start, int end){
	 	if(start<end){
	 		int mid=start+(end-start)/2;
	 		mergeSort(arr,start,mid);
	 		mergeSort(arr,mid+1,end);
	 		merge(arr,start,mid,end);
	 	}
	 }

}
