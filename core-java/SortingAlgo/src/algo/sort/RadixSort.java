package algo.sort;
import java.util.LinkedList;

public class RadixSort {
    @SuppressWarnings("unchecked")
	public LinkedList<Integer>[] rad=new LinkedList[10];

    public void sort(int arr[]){
        for(int i=0;i<10;i++)
            rad[i]=new LinkedList<>();
        readixSort(arr);
    }

    private void readixSort(int[] arr) {
        int max=findMax(arr);
        int idx,fact=1;

        while(max/fact>0){
            for(int ele: arr)
                rad[(ele/fact)%10].add(ele);

            idx=0;
            for(int i=0;i<10;i++)
                while(!rad[i].isEmpty())
                    arr[idx++]=rad[i].pollFirst();
            
            fact*=10;
        }
    }

    private int findMax(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int ele: arr)
            max=Math.max(max,ele);
        return max;
    }
}

