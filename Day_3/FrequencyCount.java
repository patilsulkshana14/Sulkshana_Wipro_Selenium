package Day_3_Assignment;

public class FrequencyCount {
	public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10, 40};
        boolean[] isCounted = new boolean[numbers.length];

        System.out.println("Frequency of each element:");

        for (int i = 0; i < numbers.length; i++) {
            if (isCounted[i])
                continue;

            int frequency = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    frequency++;
                    isCounted[j] = true;
                }
            }

            System.out.println(numbers[i] + ": " + frequency);
        }
    }
}
