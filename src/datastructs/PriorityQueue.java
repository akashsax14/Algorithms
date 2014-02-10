package datastructs;

import io.S;

public class PriorityQueue extends Heap
{
    public PriorityQueue()
    {
        super();
    }
    public PriorityQueue(int n)
    {
        super(n);
    }

    void implementPriorityQueue()
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
                            System.out.println("\t****PQ Full : Cannot Add****");
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
                            System.out.println("\t****PQ Empty : Cannot Delete****");
                        else
                        {
                            int p = delete();
                            print();
                            System.out.println(" --> "+p);
                        }
                        break;
                    case 3:
                        if(n==0)
                            System.out.println("\t****PQ Empty : Cannot Peek****");
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
