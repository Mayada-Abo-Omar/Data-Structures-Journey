public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 75;
        arr[1] = 90;
        arr[2] = 65;
        arr[3] = 88;
        arr[4] = 70;
        arr[5] = 95;

        int count = 6;

        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Array Capacity: " + arr.length);
        System.out.println("Number of Elements: " + count);

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (arr[i] == 88) {
                found = true;
            }
        }
        if (found = true) {
            System.out.println("Grade Found");
        } else {
            System.out.println("Grade Not Found");
        }

        int index = -1;
        for (int i = 0; i < count; i++) {
            if (arr[i] == 70) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Element Not Found");
        }

        arr[2] = 80;

        int position = 3;
        int newValue = 92;

        for (int i = count; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = newValue;
        count++;

        position = 1;
        for (int i = position; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        count--;

        System.out.println("Final Array:");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}