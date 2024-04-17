public class ArrayBasics {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.print("Array-Inhalt: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
