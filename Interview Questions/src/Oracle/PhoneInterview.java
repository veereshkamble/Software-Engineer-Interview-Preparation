package Oracle;
import java.io.*;
import java.util.*;

public class PhoneInterview {

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

/*
1. Anagram example: abc == cba, aab == aba
2. Given 2 strings, s and p, find all anagrams of p in s.
Input:  s: "cbaebabacd" p: "abc"
Output: [0, 6] cba, bac

*/
    public int[] anagrams(String s, String p) {
        char[] stringS = s.toCharArray();
        char[] stringP = p.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < stringP.length; i++) {
            if (hashMap.containsKey(stringP[i])) {
                int count = hashMap.get(stringP[i]);
                count++;
                hashMap.put(stringP[i], count);
            } else {
                hashMap.put(stringP[i], 1);
            }
        }

        int k = 0;
        for(int i = 0; i < stringS.length; i++) {
            if(hashMap.containsKey(stringS[i]) && hashMap.get(stringS[i]) != 0) {
                int index = i;
                int m = i;
                m++;
                int j = 1;
                while(j < stringP.length) {
                    if(!hashMap.containsKey(stringS[m])) {
                        break;
                    }

                    m++;
                    j++;


                    if(j == stringP.length) {
                        result.add(index);
                        k++;
                    }
                }

            }

        }
        int[] resultArray = new int[result.size()];
        for(int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        PhoneInterview solution = new PhoneInterview();
        int[] result =  solution.anagrams("cbaebabacd", "abc");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


    

