public class MergeSort implements Strategy {
    private int[] data;
    private int[] temp;
    private int length;

    @Override
    public void sort(int[] data) {
        this.data = data;
        length = data.length;
        this.temp = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(right, middle);
            mergeSort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    private void merge(int left, int middle, int right) {
        // copy from data array to temp(dummy) array
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int i = left;
        int j = middle + 1;
        int k = left;
        // Assign data to the data array starting with the smallest value
        while (i <= middle && j <= right) {
            if (temp[i] <= temp[j]) {
                data[k] = temp[i];
                i++;
            } else {
                data[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            data[k] = temp[i];
            k++;
            i++;
        }

    }

}
