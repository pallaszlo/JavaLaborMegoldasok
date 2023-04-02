package lab6.fel4;

import lab4.fel1.studentmanager.BirthDateComparator;
import lab4.fel1.studentmanager.Student;
import lab5.lab5_2022.AutoCompar.Auto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestStudent {
    public static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s);
            System.out.println("--------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> studs = new ArrayList<>();

        Student s1 = new Student("Kiss Balazs", "balazs@gmail.com", "075555555", "GI");
        s1.setGrade(7.25);
        s1.setBirthDate(LocalDate.parse("2003-01-08"));
        Student s2 = new Student("Nagy Ella", "ella@gmail.com", "075555555", "GI");
        s2.setGrade(5.66);
        s2.setBirthDate(LocalDate.parse("2003-05-18"));
        Student s3 = new Student("Egy Elek", "elek@gmail.com", "075555555", "GI");
        s3.setGrade(8.80);
        s3.setBirthDate(LocalDate.parse("2003-04-01"));
        Student s4 = new Student("Ket Barna", "barna@gmail.com", "075555555", "GI");
        s4.setGrade(6.00);
        s4.setBirthDate(LocalDate.parse("2003-09-15"));

        studs.add(s1);
        studs.add(s2);
        studs.add(s3);
        studs.add(s4);

        System.out.println("Rendezes elott\n");
        printStudents(studs);

        // Rendezes: comparable alapjan
        Collections.sort(studs);

        System.out.println("Rendezes utan\n");
        printStudents(studs);

        // Rendezes: forditott sorrend
        Collections.sort(studs, Collections.reverseOrder());
        printStudents(studs);

        // Rendezes: comparator alapjan
        //Collections.sort(studs, new BirthDateComparator());
        //printStudents(studs);

        //studs.sort(Comparator.comparing(Student::getBirthDate));
        //printStudents(studs);

        studs.sort(Comparator.comparing((Student s) -> s.getBirthDate()));
        printStudents(studs);

        studs.sort((Student stud1, Student stud2) -> (stud1.getName().compareTo(stud2.getName())));
        printStudents(studs);
    }
}
