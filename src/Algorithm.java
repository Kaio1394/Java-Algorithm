public class Algorithm {
    public static int binarySearch(int[] array, int value) {
        return binarySearchRecursive(array, value, 0, array.length - 1);
    }

    private static int binarySearchRecursive(int[] array, int value, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (array[mid] == value) {
            return mid;
        } else if (value > array[mid]) {
            return binarySearchRecursive(array, value, mid + 1, end);
        } else {
            return binarySearchRecursive(array, value, start, mid - 1);
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
