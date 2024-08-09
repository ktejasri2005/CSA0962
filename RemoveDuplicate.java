public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        int length = array.length;

        length = removeDuplicates(array, length);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicates(int[] array, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }

        temp[j++] = array[n - 1];
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }

        return j;
    }
}