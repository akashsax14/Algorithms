package sortalgos;

import mainsort.Sort;

public class Selection extends Sort
{
    int a[], l;
    public Selection()
    {
        this.a=super.a;
        l=a.length;
    }
    public void sort()
    {
        int k;
        for(int i=0;i<l;i++)
        {
            k=i;
            for(int j=i+1; j<l ; j++)
                if(a[j]<a[k])
                    swap(j,k);
        }
    }
    //void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;} present in parent class
}
