import java.util.Scanner;

class Main {

	private static String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        int firstValue = -1, secondValue = -1, thirdValue = -1;

        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(first)) firstValue = i;
            if (colors[i].equals(second)) secondValue = i;
            if (colors[i].equals(third)) thirdValue = i;
        }

        long baseValue = firstValue * 10L + secondValue;
        long multiplier = (long) Math.pow(10, thirdValue);

        System.out.println(baseValue * multiplier);
    }
}