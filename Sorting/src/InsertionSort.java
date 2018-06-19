public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i=1; i<array.length; i++) {
            int current = array[i];
            int j = i-1;
            while(j>=0 && array[j] > current) {
                array[j+1] = array[j];
                j=j-1;
            }
            array[j+1] = current;
        }
    }

    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<array.length; i++) {
            sb.append(array[i]).append(",");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int[] array = new int[] {4,2,1,3,5,6,9,8,7};
        System.out.println("Before Sort");
        printArray(array);
        insertionSort(array);
        System.out.println("After Sort");
        printArray(array);
    }
}
