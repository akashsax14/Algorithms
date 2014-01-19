package mainsort;

import io.S;
import sortalgos.*;

public class Sort
{
    protected int a[] = {45,32,1,67,5,2,9,0,6,7,4,78,99,12,16,22,63,8};
    protected void print()
    {
        System.out.print("[ ");
        for(int i:a)
            System.out.print(i + " ");
        System.out.println("]");
    }
    protected void swap(int i, int j){int t=a[i];a[i]=a[j];a[j]=t;}
    public static void main(String args[])
    {
        char choice;
        try
        {
            System.out.print("Enter : b-Bubble|q-Quick|m-Merge|i-Insertion|s-Selection|h-Heap : ");
            choice = S.ins().charAt(0);

            switch(choice)
            {
                case 'b':
                    System.out.println("Bubble Sort");
                    Bubble b=new Bubble();
                    b.sort();
                    b.print();
                    break;
                case 'm':
                    System.out.println("Merge Sort");
                    Merge m=new Merge();
                    m.sort();
                    m.print();
                    break;
                case 'q':
                    System.out.println("Quick Sort");
                    Quick q=new Quick();
                    q.sort();
                    q.print();
                    break;
                case 'i':
                    System.out.println("Insertion Sort");
                    Insertion i=new Insertion();
                    i.sort();
                    i.print();
                    break;
                case 's':
                    System.out.println("Selection Sort");
                    Selection s=new Selection();
                    s.sort();
                    s.print();
                    break;
                case 'h':
                    System.out.println("Heap Sort");
                    HeapSort h=new HeapSort();
                    h.sort();
                    h.print();
                    break;
                default:
                    System.out.println("Please select from the given option!");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e+" : "+e.getStackTrace()[2].getLineNumber());
        }
    }
}

