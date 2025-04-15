import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            students[i] = new Student(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(students);
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.name).append("\n");
        }

        System.out.print(sb);
    }

    static class Student implements Comparable<Student> {
        String name;
        int korean;
        int english;
        int math;

        Student(String name, String korean, String english, String math) {
            this.name = name;
            this.korean = Integer.parseInt(korean);
            this.english = Integer.parseInt(english);
            this.math = Integer.parseInt(math);
        }

        @Override
        public int compareTo(Student o) {
            if (this.korean == o.korean) {
                if (this.english == o.english) {
                    if (this.math == o.math) {
                        return this.name.compareTo(o.name);
                    }
                    return o.math - this.math;
                }
                return this.english - o.english;
            }
            return o.korean - this.korean;
        }
    }
}