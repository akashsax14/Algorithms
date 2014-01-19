package sortalgos;


import mainsort.Sort;

public class HeapSort extends Sort
{
    int a[], l;
    int left,right,max;
    public HeapSort()
    {
        this.a = super.a;
        l=a.length-1;
    }

    public void sort()
    {
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
}
