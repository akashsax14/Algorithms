package sortalgos;


import io.S;

public class HeapSort {
    int a[], l;
    int left,right,max;
    public HeapSort()
    {
        this.a = S.ina();
        l=a.length;
    }
    public HeapSort(int x[])
    {
        a=x;
        l=a.length;
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
        l--;
        heapify();
        sortdown();
    }
    void sortdown()
    {
        for(int i=1; i<=l;i++)
        {
            swap(0,l-i+1);
            sink(0,l-i);
        }
    }
    void heapify()
    {
        for(int i=l; i>=0 ;i--)
            sink(i, l);
    }
    void sink(int i, int l)
    {
        left=2*i;
        if(left > l) return;
        right=2*i+1;
        max=right>l ? left : (a[left]>a[right] ? left : right);
        if(a[i]>=a[max]) return;
        swap(i, max);
        sink(max, l);
    }
    void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;}
}
