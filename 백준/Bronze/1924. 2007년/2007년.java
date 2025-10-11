import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        int answer = y - 1;
        for (int i = 0; i < x - 1; i++) {
            answer += daysInMonth[i];
        }
        
        System.out.print(dayOfWeek[answer % 7]);
    }
}