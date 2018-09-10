package ArraysAndStrings;

public class PrintMissingElement
{
    // A O(n) function to print missing elements in an array
    void printMissing(int arr[], int n)
    {
        int LIMIT = 100;

        boolean seen[] = new boolean[LIMIT];

        // Initialize all number from 0 to 99 as NOT seen
        for (int i = 0; i < LIMIT; i++)
            seen[i] = false;

        // Mark present elements in range [0-99] as seen
        for (int i = 0; i < n; i++)
        {
            if (arr[i] < LIMIT)
                seen[arr[i]] = true;
        }

        // Print missing element
        int i = 0;
        while (i < LIMIT)
        {
            // If i is missing
            if (seen[i] == false)
            {
                // Find if there are more missing elements after i
                int j = i + 1;
                while (j < LIMIT && seen[j] == false)
                    j++;

                // Print missing single or range
                int p = j-1;
                System.out.println(i+1==j ? i : i + "-" + p);

                // Update u
                i = j;
            }
            else
                i++;
        }
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        PrintMissingElement missing = new PrintMissingElement();
        int arr[] = {88, 105, 3, 2, 200, 0, 10};
        int n = arr.length;
        missing.printMissing(arr, n);
    }
}

