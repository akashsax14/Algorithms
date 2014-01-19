package sortalgos;


import mainsort.Sort;

public class HeapSort extends Sort
{
    int a[], l;
    int left,right,main;
    public HeapSort()
    {
        this.a = super.a;
        l=a.length-1;
    }

    public void sort()
    {
        heapify(); // 8 4 6 2 1 3 5
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
        for(int i=l; i>=0 ;i--)     // 5 2 4
            sink(i, l);
    }
    void sink(int i, int l)
    {
        left=2*i;
        if(left > l) return;
        right=2*i+1;
        main=right>l ? left : (a[left]>a[right] ? left : right);
        if(a[i]>=a[main]) return;
        swap(i, main);
        sink(main, l);
    }
}
