public class StringCalculator {
    public int add(String numbers) {
        // if string is empty
        if (numbers.isEmpty()) {
            return 0;
        }
        // split string seprated by the comma and store number into number array.
        String[] number = numbers.split(",");
        // store total sum.
        int sum = 0;
        // loop each number and convert it to the integer.
        for (String num : number) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
