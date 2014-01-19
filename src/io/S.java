package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S
{
    public static int ini()
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

    public static String ins()
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

    public static int[] ina()
    {
        int i=0,a[]=new int[0];
        try{
            InputStreamReader is=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(is);
            System.out.print("Enter size of array : ");
            i=Integer.parseInt(br.readLine());
            a=new int[i];
            for(int j=0;j<i;j++)
            {
                System.out.print("Enter Element(" + (j + 1) + ") : ");
                a[j]=Integer.parseInt(br.readLine());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return a;
    }
}
