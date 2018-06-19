public class SelectionSOrt {

    public static void selectionSort(int[] array) {
        for (int i=0; i<array.length-1  ; i++) {
            int minIndex = i;
            for (int j=i+1; j<array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<array.length; i++)
            sb.append(array[i]).append(",");
        System.out.println(sb.toString());
    }

    public static void main(String[] args){
        int[] array = new int[] {7, 5, 9, 2, 4, 1, 3, 6, 8};
        System.out.println("Before Sort");
        printArray(array);
        selectionSort(array);
        System.out.println("After Sort");
        printArray(array);
    }
}
