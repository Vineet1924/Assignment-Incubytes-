public class StringCalculator {
    public int add(String numbers) {
        // if string is empty
        if (numbers.isEmpty()) {
            return 0;
        }
        // Replace all non-digit characters with a comma (known delimiter)
        numbers = numbers.replaceAll("[^0-9]", ",");
        // Split the string using the comma delimiter
        String[] numberArray = numbers.split(",");
        // Store total sum
        int sum = 0;
        // Loop through each number and convert it to an integer
        for (String num : numberArray) {
            if (!num.isEmpty()) { // Check for empty strings
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }
}
