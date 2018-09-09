package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

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

    public static boolean findTripletHashTable(int a1[], int a2[],
                                               int a3[], int n1,
                                               int n2, int n3, int sum) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0; i < n1; i++) {
            hashSet.add(a1[i]);
        }

        for(int j = 0; j < n2; j++) {
            for(int k = 0; k < n3; k++) {
                if (hashSet.contains(sum - (a2[j] + a2[k]))) {
                    return true;
                }
            }
        }
        return false;
    }

    // Driver code
    public static void main (String[] args)
    {
        int a1[] = { 1 , 2 , 3 , 4 , 5 };
        int a2[] = { 2 , 3 , 6 , 1 , 2 };
        int a3[] = { 3 , 2 , 4 , 5 , 6 };
        int sum = 9;

        int n1 = a1.length;
        int n2 = a2.length;
        int n3 = a3.length;

        if(findTriplet(a1, a2, a3, n1, n2, n3, sum))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
