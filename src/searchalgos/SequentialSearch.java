package searchalgos;

public class SequentialSearch
{
    int search(int a[], int search)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==search)return i+1;
        }
        return -1;
    }
}
