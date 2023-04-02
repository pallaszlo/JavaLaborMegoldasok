package lab5.fel1;

import lab4.fel1.studentmanager.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("ABC1234","Nagy Ella", "ella@gmail.com", "075555555", "GI");
        Student s2 = new Student("ABC123","Nagy Ella", "ella@gmail.com", "075555555", "GI");
        //s1 = s2;
        System.out.println(s1.equals(s2));
    }
}
