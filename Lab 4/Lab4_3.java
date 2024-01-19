public class Lab4_3{
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40};

        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        
        double average = (double) sum / numbers.length;

        
        System.out.println("Array elements: " + arrayToString(numbers));
        System.out.println("Average of array values: " + average);
    }

    
    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}