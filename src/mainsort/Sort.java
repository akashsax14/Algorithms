package mainsort;

import sortalgos.Bubble;
import sortalgos.Merge;
import sortalgos.Quick;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sort
{
    protected int a[] = {45,32,1,67,5,2,9,0,6,7,4,78,99,12,16,22,63,8};
    protected void print()
    {
        for(int i:a)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        char choice = ' ';
        try
        {
            System.out.print("Enter : b-Bubble|q-Quick|m-merge : ");
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
                default:
                    System.out.println("Please select from the given option!");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class S
{
    static int ini()
    {
        int i=0;
        try{
            InputStreamReader is=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(is);
            i=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }

    static String ins()
    {
        String i="";
        try{
            InputStreamReader is=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(is);
            i=br.readLine();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }

}