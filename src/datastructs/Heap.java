package datastructs;


import io.S;

public class Heap
{
    int a[], l, n;
    public Heap()
    {
        a=new int[10];
        l=10;
        n=0;
    }

    public Heap(int size)
    {
        a=new int[size+1];
        l=size+1;
        n=0;
    }

    protected void add(int e)
    {
        a[++n]=e;
        swim(n);
    }
    protected int delete()
    {
        int max=a[1];
        a[1]=a[n--];
        a[n+1]=0;
        sink(1);
        return max;
    }
    protected int peek()
    {
        return a[1];
    }
    protected void swim(int k) // The newly entered element swims up to the proper position
    {
        while(k>1 && a[k/2]<a[k])
        {
            swap(k/2,k);
            k=k/2;
        }
    }
    protected void sink(int k) // To sink the element at root node after deletion of root node element
    {
        while(2*k<=n)
        {
            int j=2*k;
            if(j<n && a[j]<a[j+1])j++;
            if(a[k]>a[j])break;
            swap(k,j);
            k=j;
        }
    }
    protected void print()
    {
        System.out.print("\t[ ");
        for(int i=1;i<=n;i++)
            System.out.print(a[i] + " ");
        System.out.print("]");
    }
    protected void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;}

    public void implementHeap()
    {
        int ch=0;
        try
        {
            System.out.print("Operations : 1-add|2-delete|3-max|4-print|5-quit|0-operations : ");
            while(ch!=5)
            {
                System.out.print("Select : ");
                ch= S.ini();
                switch(ch)
                {
                    case 0:
                        System.out.print("Operations : 1-add|2-delete|3-max|4-print|5-quit|0-operations : ");
                        break;
                    case 1:
                        if(n+1==l)
                            System.out.println("\t****Heap Full : Cannot Add****");
                        else
                        {
                            int v=0;
                            System.out.print("\tEnter value : ");
                            v=S.ini();
                            add(v);
                            print();
                            System.out.println(" <-- "+v);
                        }
                        break;
                    case 2:
                        if(n==0)
                            System.out.println("\t****Heap Empty : Cannot Delete****");
                        else
                        {
                            int p = delete();
                            print();
                            System.out.println(" --> "+p);
                        }
                        break;
                    case 3:
                        if(n==0)
                            System.out.println("\t****Heap Empty : Cannot Peek****");
                        else
                            System.out.println("\t"+peek());
                        break;
                    case 4:
                        print();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("\t****Exiting - Thank You****");
                        break;
                    default:
                        ch=5;
                        System.out.println("\t****Exiting - Thank You****");
                        break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
