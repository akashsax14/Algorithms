package datastructs;

import io.S;

//Stack Implementation using Linked List
public class StackLL
{
    LinkedList top = null;

    protected void push(int i)
    {
        top = new LinkedList(i, top);
    }
    protected int pop()
    {
        int i = top.data;
        top = top.next;
        return i;
    }
    protected int peek()
    {
        return top.data;
    }
    protected void print()
    {
        LinkedList temp = top;
        System.out.print("\t[ ");
        while(temp !=null)
        {
            int i = temp.data;
            System.out.print(i+" ");
            temp=temp.next;
        }
        System.out.print("]");
    }

    public void implementStackLL()
    {
        int ch=0;
        try
        {
            System.out.print("Operations : 1-push|2-pop|3-peek|4-print|5-quit|0-operations : ");
            while(ch!=5)
            {
                System.out.print("Select : ");
                ch= S.ini();
                switch(ch)
                {
                    case 0:
                        System.out.print("Operations : 1-push|2-pop|3-peek|4-print|5-quit|0-operations : ");
                        break;
                    case 1:
                        int v=0;
                        System.out.print("\tEnter value : ");
                        v=S.ini();
                        push(v);
                        print();
                        System.out.println(" <-- "+v);
                        break;
                    case 2:
                        if(top==null)
                            System.out.println("\t****StackLL Empty : Cannot Pop****");
                        else
                        {
                            int p = pop();
                            print();
                            System.out.println(" --> "+p);
                        }
                        break;
                    case 3:
                        if(top==null)
                            System.out.println("\t****StackLL Empty : Cannot Peek****");
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
