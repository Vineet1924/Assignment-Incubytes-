public class StringCalculator {
    public int add(String numbers) {
        // if string is empty
        if (numbers.isEmpty()) {
            return 0;
        }
        // Replace all non-digit characters with a comma (known delimiter)
        numbers = numbers.replaceAll("[^0-9-]", ",");
        // Split the string using the comma delimiter
        String[] numberArray = numbers.split(",");
        // Store total sum
        int sum = 0;
        // store negative numbers
        StringBuilder negativeNumbers = new StringBuilder();
        // Loop through each number and convert it to an integer
        for (String num : numberArray) {
            int n = Integer.parseInt(num);
            if (!num.isEmpty()) { // Check for empty strings
                if (n < 0) {
                    negativeNumbers.append(n).append(",");
                } else {
                    sum += n;
                }
            }
        }
        // contains negative number than throw exception
        if (negativeNumbers.length() > 0) {
            throw new IllegalArgumentException("Negative numbers are not allowd : " + negativeNumbers.toString());
        }
        return sum;
    }
}
