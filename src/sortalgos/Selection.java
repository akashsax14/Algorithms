package sortalgos;

import io.S;

public class Selection {
    int a[], l;
    public Selection()
    {
        this.a= S.ina();
        l=a.length;
    }
    public Selection(int x[])
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
        int k;
        for(int i=0;i<l;i++)
        {
            k=i;
            for(int j=i+1; j<l ; j++)
                if(a[j]<a[k])
                    swap(j,k);
        }
    }
    void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;}
}
