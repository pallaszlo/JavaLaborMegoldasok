package lab8.fel4.studentmanager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestStudentManager {
    public static void main(String[] args) {
        ArrayList<Student> studs = new ArrayList<>();

        //Students
        Student s1 = new Student("Kiss Balazs", "balazs@gmail.com", "075555555", "GI");
        Student s2 = new Student("Nagy Ella", "ella@gmail.com", "075555555", "GI");
        Student s3 = new Student("Egy Elek", "elek@gmail.com", "075555555", "GI");
        Student s4 = new Student("Ket Barna", "barna@gmail.com", "075555555", "GI");

        //Courses
        Course math = new Course("ABC123", "Mathematics", 4, "Okos Peter");
        Course webTech = new Course("TRE567", "Web technologies", 4, "Okos Janos");
        Course db = new Course("DBE5897", "Databases", 6, "Okos Anna");
        Course javaProg = new Course("IOP453", "Java programming", 5, "Okos Lajos");
        Course webProg = new Course("Web programming", 5, "Okos Emma");

        s1.enrollInCourse(math);
        s1.setGradeForCourse(math, 5.00);
        s1.enrollInCourse(javaProg);
        s1.setGradeForCourse(javaProg, 7.00);
        s1.enrollInCourse(db);
        s1.setGradeForCourse(db, 8.00);

        printStudentEnrollments(s1);

        Iterator i = s1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

    private static void printStudentEnrollments(Student student) {
        System.out.println("Enrollments for " + student.getName() + ":");
        List<Enrollment> enrollments = student.getEnrollments();
        for (Enrollment enrollment : enrollments) {
            System.out.println("- " + enrollment.getCourse().getName() + " with grade " + enrollment.getGrade());
        }
        System.out.println();
    }
}
