package sortalgos;


import mainsort.Sort;

public class Quick3 extends Sort
{
    int a[], l;
    public Quick3()
    {
        this.a=super.a;
        l=a.length;
    }
    public void sort()
    {
        quicksort3(0,l-1);
    }
    void quicksort3(int low, int high)
    {

    }
}
