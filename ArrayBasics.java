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

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nSumme der Zahlen: " + sum);

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Größte Zahl im Array: " + max);

        int[] secondNumbers = new int[10];
        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = 11 + i;
        }

        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[i] + secondNumbers[i];
        }

        System.out.print("Ergebnis der elementweisen Addition: ");
        for (int number : result) {
            System.out.print(number + " ");
        }

    }
}
