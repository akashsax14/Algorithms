package sortalgos;

import io.S;

public class Merge {
    int a[],h[],l=0;
    public Merge()
    {
        this.a= S.ina();
        l=a.length;
        h=new int[l];
    }
    public Merge(int x[])
    {
        a=x;
        l=a.length;
        h=new int[l];
    }
    public void print()
    {
        System.out.print("[ ");
        for(int i:a)
            System.out.print(i + " ");
        System.out.println("]");
    }


    public void sort()
    {
        mergesort(0,l-1);
    }
    void mergesort(int low, int high)
    {
        if(low<high)
        {
            int middle=(low+high)/2;
            mergesort(low,middle);
            mergesort(middle+1,high);
            merge(low, middle, high);
        }
    }
    void merge(int low, int middle, int high)
    {
        for(int i=low; i<=high;i++)
            h[i]=a[i];
        int i=low, j=middle+1, k=low;
        while(i<=middle && j<=high)
            a[k++] = h[i]<h[j] ? h[i++] : h[j++];

        while(i<=middle)
            a[k++] = h[i++];
    }
}