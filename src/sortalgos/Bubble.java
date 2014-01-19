package sortalgos;

import io.S;

public class Bubble {
    int a[],l=0;
    public Bubble()
    {
        this.a= S.ina();
        l=a.length;
    }
    public Bubble(int x[])
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
    void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;}
}
