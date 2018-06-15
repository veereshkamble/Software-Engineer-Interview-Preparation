public class BubbleSort {

    public static void bubbleSort(int[] array) {

        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<array.length; i++) {
            sb.append(array[i]).append(",");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int[] array = new int[]{9,10,19,7,4,5,8,11,23};
        System.out.println("Before Sort");
        printArray(array);
        bubbleSort(array);
        System.out.println("After Sort");
        printArray(array);
    }
}
