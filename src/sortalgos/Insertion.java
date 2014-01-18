package sortalgos;


import mainsort.Sort;

public class Insertion extends Sort
{
    int a[], l;
    public Insertion()
    {
        this.a=super.a;
        l=a.length;
    }
    public void sort()
    {
        for(int i=1;i<l;i++)
            for(int j=i; j>=1 && a[j]<a[j-1]; j--)
                swap(j,j-1);
    }
    //void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;} present in parent class
}
