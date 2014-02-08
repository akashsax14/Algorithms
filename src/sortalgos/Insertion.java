package sortalgos;


import io.S;

public class Insertion {
    int a[], l;
    public Insertion()
    {
        this.a= S.ina();
        l=a.length;
    }
    public Insertion(int x[])
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
        for(int i=1;i<l;i++)
            for(int j=i; j>=1 && a[j]<a[j-1]; j--)
                swap(j,j-1);
    }
    void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;}
}
