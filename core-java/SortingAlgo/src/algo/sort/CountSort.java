package algo.sort;

import java.util.Arrays;

public class CountSort {
    private int[] count;
    private int max=Integer.MIN_VALUE;
    private int min=Integer.MAX_VALUE;
    public void sort(int[] arr){
        for(int ele:arr){
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }
        count=new int[max-min+1];
        Arrays.fill(count,0);
        countSort(arr);
    }

    private void countSort(int[] arr) {
        for(int ele:arr)
            count[ele-min]++;
        
        int idx=0;
        for(int i=0;i<=max-min;i++)
            while (count[i]-->0)
                arr[idx++]=i+min;
    }
}

