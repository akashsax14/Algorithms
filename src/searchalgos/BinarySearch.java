package searchalgos;

import sortalgos.Quick;

public class BinarySearch
{
    int search(int a[], int search)
    {

        int low=0, high=a.length-1;
        while(low <= high)
        {
            int middle = (low+high)/2;
            if(search > a[middle])low = middle+1;
            else if(search < a[middle])high=middle-1;
            else return middle;
        }
        return -1;

    }
}
