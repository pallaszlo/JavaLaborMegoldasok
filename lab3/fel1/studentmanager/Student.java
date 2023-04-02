package lab3.fel1.studentmanager;

import java.util.Random;

public class Student {
    private String neptunCode;
    private String name;
    private String programme;
    private double grade;

    public Student(String neptunCode, String name, String programme) {
        this.neptunCode = neptunCode;
        this.name = name;
        this.programme = programme;
        this.grade = 0;
    }

    public Student(String name, String programme) {
        this.name = name;
        this.programme = programme;
        this.neptunCode = generateNeptunCode();
        this.grade = 0;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getProgramme() {
        return programme;
    }

    private String generateNeptunCode(){
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 5;
        for(int i = 0; i < length; i++) {

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

    @Override
    public String toString() {
        return "Student{" +
                "neptunCode='" + neptunCode + '\'' +
                ", name='" + name + '\'' +
                ", programme='" + programme + '\'' +
                ", grade=" + grade +
                '}';
    }
}
