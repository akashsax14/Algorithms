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

}
