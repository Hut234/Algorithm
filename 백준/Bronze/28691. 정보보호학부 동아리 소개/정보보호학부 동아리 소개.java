import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        String word;
        if (s.equals("M")) {
            word = "MatKor";
        } else if (s.equals("W")) {
            word = "WiCys";
        } else if (s.equals("C")) {
            word = "CyKor";
        } else if (s.equals("A")) {
            word = "AlKor";
        } else {
            word = "$clear";
        }
        System.out.print(word);
    }
}