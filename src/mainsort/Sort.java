package mainsort;

import sortalgos.Bubble;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mr. Saxena on 1/15/14.
 */
public class Sort
{
    int array[] = {45,32,1,67,5,2,9,0,6,7,4,78,99,12,16,22,63,8};

    public static void main(String args[])
    {
        try
        {
            char choice = '';
            System.out.println("Enter : b-Bubble|q-Quick|m-merge : ");
            choice = S.ins().charAt(0);

            switch(choice)
            {
                case 'b':
                    System.out.println("Bubble Sort");
                    Bubble b=new Bubble();
                    b.sort();


            }
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

    static int ins()
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