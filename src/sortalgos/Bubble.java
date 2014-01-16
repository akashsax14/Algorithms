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
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
}
