package lab3.fel1.studentmanager;


public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("fdfgt", "Kiss Lajos", "GI");
        s1.setGrade(7.50);
        Student s2 = new Student("abcde", "Nagy Peter", "GI");
        s2.setGrade(8.75);
        Student s3 = new Student("rteus", "Egy Elek", "KGI");
        s3.setGrade(6.00);
        Student s4 = new Student("Ket Emma", "GI");
        s4.setGrade(9.00);

        Student[] studs = {s1, s2, s3, s4};

        /*
        for (Student s:studs) {
            System.out.println(s);
        }
         */

        listStudents(studs, "KGI");
        System.out.println(getBestStudent(studs));

    }

    public static void listStudents(Student[] students, String progr){
        for (Student student:students) {
            if (student.getProgramme().equals(progr)) {
                System.out.println(student);
            }
        }
    }

    public static Student  getBestStudent(Student[] students){
        Student bestStudent = null;
        if(students != null){
            bestStudent = students[0];
            for (Student s:students){
                if (s.getGrade() > bestStudent.getGrade()){
                    bestStudent = s;
                }
            }
        }
        return bestStudent;
    }
}
