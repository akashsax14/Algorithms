package sortalgos;

import mainsort.Sort;

public class Quick extends Sort
{
    int a[],l;

    public Quick()
    {
        this.a=super.a;
        l=a.length;
    }

    public void sort()
    {
        quicksort(0,l-1);
    }
    void quicksort(int low, int high)
    {
        int i=low, j=high;
        int pivot = a[(low+high)/2];

        while(i<=j)
        {
            while(a[i]<pivot)i++;
            while(a[j]>pivot)j--;
            if(i<=j){swap(i,j);i++;j--;}
        }

        if(low<j)quicksort(low,j);
        if(i<high)quicksort(i,high);
    }
    //void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;} present in parent class
}
