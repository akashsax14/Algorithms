package sortalgos;


import io.S;

import java.util.Random;

public class SortImplement
{
    public static void main(String args[])
    {
        int ba[]=new int[1000000];
        long startTime, stopTime, elapsedTime;
        Random r=new Random();
        System.out.print("Original Array : [ ");
        for(int i=0;i<1000000;i++)
        {
            ba[i] = r.nextInt(100000000);
            //System.out.print(ba[i] + " ");
        }
        System.out.println("]");
        char choice;
        try
        {
            System.out.print("Enter : b-Bubble|q-Quick|m-Merge|i-Insertion|s-Selection|h-Heap : ");
            choice = S.ins().charAt(0);

            switch(choice)
            {
                case 'b':
                    System.out.println("Bubble Sort");
                    Bubble b=new Bubble(ba);
                        startTime = System.currentTimeMillis();
                    b.sort();
                        stopTime = System.currentTimeMillis();
                        elapsedTime = stopTime - startTime;
                        System.out.println(elapsedTime+" milli seconds");
                    //b.print();
                    break;
                case 'm':
                    System.out.println("Merge Sort");
                    Merge m=new Merge(ba);
                        startTime = System.currentTimeMillis();
                    m.sort();
                        stopTime = System.currentTimeMillis();
                        elapsedTime = stopTime - startTime;
                        System.out.println(elapsedTime+" milli seconds");
                    //m.print();
                    break;
                case 'q':
                    System.out.println("Quick Sort");
                    Quick q=new Quick(ba);
                        startTime = System.currentTimeMillis();
                    q.sort();
                        stopTime = System.currentTimeMillis();
                        elapsedTime = stopTime - startTime;
                        System.out.println(elapsedTime+" milli seconds");
                    //q.print();
                    break;
                case 'i':
                    System.out.println("Insertion Sort");
                    Insertion i=new Insertion(ba);
                        startTime = System.currentTimeMillis();
                    i.sort();
                        stopTime = System.currentTimeMillis();
                        elapsedTime = stopTime - startTime;
                        System.out.println(elapsedTime+" milli seconds");
                    //i.print();
                    break;
                case 's':
                    System.out.println("Selection Sort");
                    Selection s=new Selection(ba);
                        startTime = System.currentTimeMillis();
                    s.sort();
                        stopTime = System.currentTimeMillis();
                        elapsedTime = stopTime - startTime;
                        System.out.println(elapsedTime+" milli seconds");
                    //s.print();
                    break;
                case 'h':
                    System.out.println("Heap Sort");
                    HeapSort h=new HeapSort(ba);
                        startTime = System.currentTimeMillis();
                    h.sort();
                        stopTime = System.currentTimeMillis();
                        elapsedTime = stopTime - startTime;
                        System.out.println(elapsedTime+" milli seconds");
                    //h.print();
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
