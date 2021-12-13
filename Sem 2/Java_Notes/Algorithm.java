import java.util.Scanner;
public class Algorithm {
public static void main (String [] args)
    {
// BUBBLE SORT ALGORITHM (INT)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of integers to sort: ");
        int amount = input.nextInt();
        

        int[] array = new int[amount];

        for (int i = 0; i < amount; i++)
        {
            System.out.println("("+(i+1)+")" + "Enter a number:");
            array[i] = input.nextInt();
        }
        // BUBBLE SORT METHOD
        for (int i = 0; i < (amount -1); i++)
        {
            for (int j = 0; j < amount - i - 1; j++)
            {
                if (array[j] > array[j+1]) // For descending order use <
                {
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        
            input.close();
        }

        System.out.println("Sorted list of numbers: ");
        for (int l = 0; l < amount; l++)
        {
            System.out.println(array[l]);
        }
    }
// QUICK SORT ALGORITHM (INT)
    {
        int array[] = {12,9,4,99,120,1,3,10,13};
        System.out.println("Quick Sort\n\n");
        System.out.println("Values before the sort: \n");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        //QUICK SORT METHOD CALL
        quick_srt(array, 0, array.length-1);
        
        System.out.print("\nValues after the sort: \n");

        for (int i = 0; i< array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
// BINARY SEARCH (INT)
    {
        //code
    }
// MAX VALUE IN ARRAY (INT)
    {
    
    }

} // End of main 

//---------------------- Should be in separate class without static modifier-------------------------------------------------------
// QUICK SORT METHOD
    public static void quick_srt(int array[], int low, int amt)
        {
            int lo = low;
            int hi = amt;

            if (lo >= amt)
            {
                return;
            }

            int mid = array[(lo+hi) / 2];

            while (lo < hi)
            {
                while (lo < hi && array[lo] < mid)
                {
                    lo++;
                }
                while (lo < hi && array[hi] > mid)
                {
                    hi--;
                }
                if (lo < hi)
                {
                    int T = array[lo];
                    array[lo] = array[hi];
                    array[hi] = T;
                }
            }
            if (hi < lo)
            {
                int T = hi;
                hi = lo;
                lo = T;
            }
            quick_srt(array, low, lo);
            quick_srt(array, lo == low ? lo + 1 : lo, amt);

        }
// FIND MAX/MIN FROM ARRAY METHOD
    public static int findMax(int[] array)
    {
        int currentMax = array[0];
        for (int i = 1; i <= array.length - 1; i++)
        {
            if (currentMax < array[i])  // For minimum value just flip to >
            {
                currentMax = array[i];
            }
        }
        return currentMax;
    }
// BINARY SEARCH METHOD
    public static int binarySearch()
    {
        //code
        return 0;
    }
    
    
}
