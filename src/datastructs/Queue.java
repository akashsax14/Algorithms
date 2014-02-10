package datastructs;


import io.S;
import sortalgos.Quick;

public class Queue
{
    int a[],l,front=-1,rear=-1;

    public Queue()
    {
        l=0;
        a=new int[10];
        front=-1;
        rear=-1;
    }
    public Queue(int l)
    {
        a=new int[l];
        this.l=l;
    }
    protected void enqueue(int i)
    {
        if(rear+1==l)
            System.out.println("****Queue Full : Cannot Enqueue****");
        else
            a[++rear]=i;
    }
    protected int dequeue()
    {
        if(front+1>rear)
            System.out.println("****Queue Empty : Cannot Dequeue****");
        else
        {

            return a[++front];
        }
        return -1;
    }
    protected void move()
    {
        while(front !=-1)
        {
            for(int i=front;i<rear;i++)
            {
                a[i]=a[i+1];
            }
            front--;
            rear--;
        }
    }
    protected void print()
    {
        System.out.print("\t[ ");
        for(int i=0;i<l;i++)
        {
            if(i<=front || i>rear)
                System.out.print("_ ");
            else
                System.out.print(a[i]+" ");
        }
        System.out.print("]");
    }
    public void implementQueue()
    {
        int ch=0;
         try
         {
            System.out.print("Operations : 1-enqueue|2-dequeue|3-move|4-print|5-sort|6-quit|0-operations : ");
            while(ch!=6)
            {
                System.out.print("Select : ");
                ch= S.ini();
                switch(ch)
                {
                    case 0:
                        System.out.print("Operations : 1-enqueue|2-dequeue|3-move|4-print|5-sort|6-quit|0-operations : ");
                        break;
                    case 1:
                        if(rear+1==l)
                            System.out.println("\t****Queue Full : Cannot Enqueue****");
                        else
                        {
                            int v=0;
                            System.out.print("\tEnter value : ");
                            v=S.ini();
                            enqueue(v);
                            print();
                            System.out.println(" <-- " + v);
                        }
                        break;
                    case 2:
                        if(front+1>rear)
                            System.out.println("\t****Queue Empty : Cannot Dequeue****");
                        else
                        {
                            System.out.print("\t"+dequeue()+" <-- ");
                            print();
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("\t*****Moving Queue Ahead****");

                        System.out.print("[ ");
                        for(int i=0;i<l;i++)
                        {
                            if(i<=front || i>rear)
                                System.out.print("_ ");
                            else
                                System.out.print(a[i]+" ");
                        }move();
                        System.out.print("] --> ");print();
                        System.out.println();
                        break;
                    case 4:
                        print();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("\t****Sorting Queue****");
                        Quick q=new Quick(a, rear);
                        q.sort();
                        break;
                    case 6:
                        System.out.println("Exiting");
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
