package datastructs;


public class LinkedList
{
    int data;
    LinkedList next;

    public LinkedList()
    {
        data=0;
        next=null;
    }
    public LinkedList(int data, LinkedList next)
    {
        this.data=data;
        this.next=next;
    }
}
