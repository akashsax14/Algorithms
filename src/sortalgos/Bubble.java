package sortalgos;

import mainsort.Sort;

/**
 * Created by Mr. Saxena on 1/15/14.
 */
public class Bubble extends Sort
{
    int a[],l=0;
    Bubble()
    {
        a=array;
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
