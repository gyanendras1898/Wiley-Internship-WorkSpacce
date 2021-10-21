package algo.sort;

abstract public class Sort {
	private int arr[];
	private int len;
	
	public void swap(int idx1, int idx2) {
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
	}

	public int[] getArr() {
		return arr;
	}

	public int getLen() {
		return len;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
		this.len=arr.length;
	}
}
