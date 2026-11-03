public class Main {
    public static void main(String[] args) {
        Array numbers = new Array();
        numbers.arr = new int[6];
        numbers.arr[0] = 10;
        numbers.arr[1] = 20;
        numbers.arr[2] = 30;
        numbers.arr[3] = 40;
        numbers.arr[4] = 50;
        numbers.count = 5;
        numbers.display();
        boolean result = numbers.search(30);
        if (result) {
            System.out.println("Number Found");
        } else {
            System.out.println("Number Not Found");
        }
        numbers.insert(2, 25);
        System.out.println("After Insertion:");
        numbers.display();
    }
}