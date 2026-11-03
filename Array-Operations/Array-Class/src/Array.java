public class Array {
    int[] arr;
    int count;

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    boolean search(int target) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    void insert(int position, int newValue) {
        for (int i = count; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = newValue;
        count++;
    }
}