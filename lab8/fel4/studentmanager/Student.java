package lab8.fel4.studentmanager;

import java.util.*;

public class Student extends Person implements Comparable<Student>, Iterable<Enrollment> {
    private String neptunCode;
    private String programme;
    private double grade;
    private List<Enrollment> enrollments;


    public Student(String name, String email, String phone, String neptunCode, String programme) {
        super(name, email, phone);
        this.neptunCode = neptunCode;
        this.programme = programme;
        this.grade = 0;
        this.enrollments = new ArrayList<>();
    }

    public Student(String name, String email, String phone, String programme) {
        super(name, email, phone);
        this.programme = programme;
        this.neptunCode = generateNeptunCode();
        this.grade = 0;
        this.enrollments = new ArrayList<>();
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public double getGrade() {
        return grade;
    }

    public void setGradeForCourse(Course course, double grade) {
        Enrollment enr = findEnrollment(course);
        if (enr != null) {
            enr.setGrade(grade);
        } else {
            System.out.println("Course does nor exists!");
        }

    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double calcGrade() {
        //ToDo
        return 0;
    }

    public Enrollment findEnrollment(Course course) {
        for (Enrollment enr : enrollments) {
            if (enr.getCourse().equals(course)) {
                return enr;
            }
        }
        return null;
    }

    public boolean isCourseTaken(Course c) {
        for (Enrollment enr : enrollments) {
            if (enr.getCourse().equals(c)) {
                return true;
            }
        }
        return false;
    }


    public void deleteCourse(Course c) {
        //ToDo
    }


    public void enrollInCourse(Course course) {
        if (!isCourseTaken(course)) {
            enrollments.add(new Enrollment(this, course));
        } else {
            System.out.println(course.getName() + " course is already taken!");
        }
    }

    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            courses.add(enrollment.getCourse());
        }
        return courses;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(neptunCode, student.neptunCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neptunCode);
    }

    private String generateNeptunCode() {
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 5;
        for (int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(lowerAlphabet.length());

            // get character specified by index
            // from the string
            char randomChar = lowerAlphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        return sb.toString();
    }

    public int getSumOfCredits() {
        int sum = 0;
        for (Enrollment e : enrollments) {
            sum = sum + e.getCourse().getCredit();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" +
                "Neptun code: " + this.getNeptunCode() + "\n" +
                "Study program: " + this.getProgramme() + "\n" +
                "Grade: " + this.getGrade() + "\n" +
                "Birth date: " + this.getBirthDate() + "\n" +
                "Courses: " + this.getCourses();

        //return String.format("Name: %s\nNeptun code: %s\nStudy program: %s\nGrade: %s", this.getName(), this.getNeptunCode(), this.getProgramme(), this.getGrade()); // String.format használata
        //return super.toString(); // Ős osztály toString metódusa
    }

    @Override
    public int compareTo(Student o) {
        //return (Double.valueOf(this.grade)).compareTo(o.grade);
        return Double.compare(this.grade, o.grade);
    }

    @Override
    public Iterator<Enrollment> iterator() {
        return new EnrollmentIterator();
    }

    protected class EnrollmentIterator implements Iterator<Enrollment> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < enrollments.size();
        }

        @Override
        public Enrollment next() {
            Enrollment nextElement = enrollments.get(index);
            index++;
            return nextElement;
        }
    }
}
