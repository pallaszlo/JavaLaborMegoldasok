package lab6.fel4;

import lab4.fel1.studentmanager.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class TestStudentWithSet {
    public static void main(String[] args) {
        ArrayList<Student> studs = new ArrayList<>();

        Student s1 = new Student("Kiss Balazs", "balazs@gmail.com", "075555555", "ABC123","GI");
        Student s2 = new Student("Kiss Balazs", "balazs@gmail.com", "075555555", "ABC123","GI");
        Student s3 = new Student("Egy Elek", "elek@gmail.com", "075555555", "NMJ567","GI");

        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (Student s : students) {
            System.out.println(s);
            System.out.println(s.hashCode());
            System.out.println("-------------------------------------------");
        }
    }
}
