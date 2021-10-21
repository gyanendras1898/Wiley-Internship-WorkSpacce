package algo.sort;
import java.util.LinkedList;

public class BucketSort {
	private LinkedList<Integer>[] bin;
    private int max=Integer.MIN_VALUE;
    private int min=Integer.MAX_VALUE;

    @SuppressWarnings("unchecked")
	public void sort(int[] arr){
        for(int ele: arr) {
            max = Math.max(max, ele);
            min = Math.min(min, ele);
        }
        this.bin=new LinkedList[max-min+1];

        for(int i=0;i<=max-min;i++)
            bin[i]=new LinkedList<>();
        bucketSort(arr);
    }

    private void bucketSort(int[] arr) {
        for(int ele: arr)
            bin[ele-min].add(ele);
        
        int idx=0;
        for(int i=0;i<=max-min;i++)
            while(!bin[i].isEmpty())
                arr[idx++]=bin[i].poll();
        
    }

}
