class Solution {
    public long solution(String numbers) {
        String one = numbers.replace("one", "1");
        String two = one.replace("two", "2");
        String three = two.replace("three", "3");
        String four = three.replace("four", "4");
        String five = four.replace("five", "5");
        String six = five.replace("six", "6");
        String seven = six.replace("seven", "7");
        String eight = seven.replace("eight", "8");
        String nine = eight.replace("nine", "9");
        String zero = nine.replace("zero", "0");
        return Long.parseLong(zero);
    }
}