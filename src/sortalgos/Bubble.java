package sortalgos;

import mainsort.Sort;

public class Bubble extends Sort
{
    int a[],l=0;
    public Bubble()
    {
        this.a=super.a;
        l=a.length;
    }

    public void sort()
    {
        boolean flag=false;
        for(int i=0;i<l;i++)
        {
            flag=false;
            for(int j=l-1;j>=i+1;j--)
                if(a[j]<a[j-1])
                {
                    swap(j,j-1);
                    flag=true;
                }
            if(!flag) break;
        }
    }
    //void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;} present in parent class
}
