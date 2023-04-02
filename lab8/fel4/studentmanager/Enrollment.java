package lab8.fel4.studentmanager;


import java.util.Date;

public class Enrollment {
    private Student student;
    private Course course;
    private Date enrollmentDate;
    private double grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = new Date();
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "course=" + course +
                '}';
    }
}
