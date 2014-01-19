package datastructs;

import io.S;
import sortalgos.Quick;

public class Stack
{
    int a[],l,top=-1;

    public Stack()
    {
        l=0;
        top=-1;
    }
    public Stack(int l)
    {
        a=new int[l];
        this.l=l;
    }
    public void push(int i)
    {
        a[++top]=i;
    }
    public int pop()
    {
        int t=a[top];
        a[top]=0;
        top--;
        return t;
    }
    public int peek()
    {
        return a[top];
    }
    public void print()
    {
        System.out.print("[ ");
        for(int i=0;i<=top;i++)
            System.out.print(a[i] + " ");
        System.out.println("]");
    }
    public void implementStack()
    {
        int ch=0;
        System.out.print("Operations : 1-push|2-pop|3-peek|4-print|5-sort|6-quit|0-operations : ");
        while(ch!=6)
        {
            System.out.print("Select : ");
            ch=S.ini();
            switch(ch)
            {
                case 0:
                    System.out.print("Operations : 1-push|2-pop|3-peek|4-print|5-sort|6-quit|0-operations : ");
                    break;
                case 1:
                    if(top+1==l)
                        System.out.println("\t****Stack Full : Cannot Push****");
                    else
                    {
                        int v=0;
                        System.out.print("\tEnter value : ");
                        v=S.ini();
                        push(v);
                    }
                    break;
                case 2:
                    if(top==-1)
                        System.out.println("\t****Stack Empty : Cannot Pop****");
                    else
                        System.out.println(pop());
                    break;
                case 3:
                    if(top==-1)
                        System.out.println("\t****Stack Empty : Cannot Peek****");
                    else
                        System.out.println(peek());
                    break;
                case 4:
                    print();
                    break;
                case 5:
                    System.out.println("\t****Sorting array****");
                    Quick q=new Quick(a);
                    q.sort();
                    break;
                case 6:
                    System.out.println("\t****Exiting - Thank You****");
                    break;
                default:
                    ch=5;
                    System.out.println("\t****Exiting - Thank You****");
                    break;
            }
        }
    }
}
