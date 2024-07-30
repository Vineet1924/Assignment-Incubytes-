public class StringCalculator {
    public int add(String numbers) {
        // if string is empty
        if (numbers.isEmpty()) {
            return 0;
        }
        // variable for matching delimiter
        String delimiter = ",|\\n";
        // split string seprated by the comma and store number into number array.
        String[] number = numbers.split(delimiter);
        // store total sum.
        int sum = 0;
        // loop each number and convert it to the integer.
        for (String num : number) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
