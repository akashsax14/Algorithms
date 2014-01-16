package mainsort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mr. Saxena on 1/15/14.
 */
public class Sort
{
    public static void main(String args[])
    {
        int i=S.ini();
        System.out.println(10);
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
}