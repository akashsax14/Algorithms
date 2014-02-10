package datastructs;

import io.S;

public class DataStructuresImplement
{
    public static void main(String args[])
    {
        char choice;
        try
        {
            System.out.print("Test Data Structure : s-Stack|q-Queue|h-Heap|p-PriorityQueue|l-StackLL : ");
            choice = S.ins().charAt(0);

            switch(choice)
            {
                case 's':
                    int l=0;
                    System.out.println("********Stack Implementation********");
                    System.out.print("Enter size of stack : ");
                    l= S.ini();
                    if(l>0)
                    {
                        Stack s=new Stack(l);
                        s.implementStack();
                    }
                    break;
                case 'q':
                    l=0;
                    System.out.println("********Queue Implementation********");
                    System.out.print("Enter size of queue : ");
                    l= S.ini();
                    if(l>0)
                    {
                        Queue q=new Queue(l);
                        q.implementQueue();
                    }
                    break;
                case 'h':
                    l=0;
                    System.out.println("********Heap Implementation********");
                    System.out.print("Enter size of binary heap : ");
                    l= S.ini();
                    if(l>0)
                    {
                        Heap h=new Heap(l);
                        h.implementHeap();
                    }
                    break;
                case 'p':
                    l=0;
                    System.out.println("********Priority Queue Implementation********");
                    System.out.print("Enter size of priority queue : ");
                    l= S.ini();
                    if(l>0)
                    {
                        PriorityQueue pq=new PriorityQueue(l);
                        pq.implementPriorityQueue();
                    }
                    break;
                case 'l':
                    System.out.println("********StackLinkedList Implementation********");
                    StackLL sll=new StackLL();
                    sll.implementStackLL();
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e+" : "+e.getStackTrace()[2].getLineNumber());
        }
    }
}
