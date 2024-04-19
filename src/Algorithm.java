public class Algorithm {

    public static int[] selectAlgorithm(int[] array) {
        int swap = 0;
        int less = 0;
        for (int i = 0; i < array.length; i++) {
            less = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[less]) {
                    less = j;
                }
            }
            swap = array[i];
            array[i] = array[less];
            array[less] = swap;
        }
        return array;
    }

    public static int findLessElement(int[] array) {
        int less = 0;
        for (int x = 0; x < array.length; x++) {
            if (x == 0) {
                less = array[x];
            } else if (array[x] < less) {
                less = array[x];
            } else {
                continue;
            }
        }
        return less;
    }

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
