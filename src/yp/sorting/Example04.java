package yp.sorting;

import java.util.Arrays;

public class Example04 {
    public static void main(String[] args) {
           int arr[]={10,5,7,7,98};
           mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int arr[], int l, int r) {
        if(l>=r) return;
        int n=arr.length;
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r,n);

    }
   static void merge(int [] arr,int low,int mid,int high,int n){
       int[] a = new int[high - low + 1];
       int left = low, right = mid + 1, i = 0;

        while(left<=mid&&right<=high){
            if(arr[left]<arr[right]){
                a[i++]=arr[left++];

            }else{
                a[i++]=arr[right++];

            }
        }
        while(left<=mid){
            a[i++]=arr[left++];

        }
        while(right<=high){
            a[i++]=arr[right++];

        }
        for(int j=0;j<a.length;j++){
            arr[low+j]=a[j];
        }
    }
}
