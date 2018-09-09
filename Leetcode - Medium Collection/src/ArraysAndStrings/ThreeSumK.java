package ArraysAndStrings;

// Java program to find three element
// from different three arrays such
// that that a + b + c is equal to
// given sum
public class ThreeSumK
{

    // Function to check if there is
    // an element from each array such
    // that sum of the three elements
    // is equal to given sum.
    static boolean findTriplet(int a1[], int a2[],
                               int a3[], int n1,
                               int n2, int n3, int sum)
    {
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < n2; j++)
                for (int k = 0; k < n3; k++)
                    if (a1[i] + a2[j] + a3[k] == sum)
                        return true;

        return false;
    }

    
}
