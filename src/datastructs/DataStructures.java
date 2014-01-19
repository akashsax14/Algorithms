package datastructs;

import io.S;

public class DataStructures
{
    public static void main(String args[])
    {
        char choice;
        try
        {
            System.out.print("Test Data Structure : s-Stack : ");
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

                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e+" : "+e.getStackTrace()[2].getLineNumber());
        }
    }
}
