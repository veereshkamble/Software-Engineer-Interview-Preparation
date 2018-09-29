package SortingAndSearching;

public class SortColors {

    void sortColorsTwoPass(int A[], int n) {
        int num0 = 0, num1 = 0, num2 = 0;

        for(int i = 0; i < n; i++) {
            if (A[i] == 0) ++num0;
            else if (A[i] == 1) ++num1;
            else if (A[i] == 2) ++num2;
        }

        for(int i = 0; i < num0; ++i) A[i] = 0;
        for(int i = 0; i < num1; ++i) A[num0+i] = 1;
        for(int i = 0; i < num2; ++i) A[num0+num1+i] = 2;
    }

    public void sortColorsOnePass(int[] nums) {
        int n0 = -1, n1 = -1, n2 = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0)
            {
                nums[++n2] = 2; nums[++n1] = 1; nums[++n0] = 0;
            }
            else if (nums[i] == 1)
            {
                nums[++n2] = 2; nums[++n1] = 1;
            }
            else if (nums[i] == 2)
            {
                nums[++n2] = 2;
            }
        }
    }

    void sortColors(int A[], int n) {
        int j = 0, k = n - 1;
        for (int i = 0; i <= k; ++i){
            if (A[i] == 0 && i != j)
                swap(A[i--], A[j++]);
            else if (A[i] == 2 && i != k)
                swap(A[i--], A[k--]);
        }
    }

    // one pass in place solution
    void sortColors(int A[], int n) {
        int j = 0, k = n-1;
        for (int i=0; i <= k; i++) {
            if (A[i] == 0)
                swap(A[i], A[j++]);
            else if (A[i] == 2)
                swap(A[i--], A[k--]);
        }
    }
}
