package com.company;

public class Student {

    protected String name;
    private final char[] studentGrade = {'A', 'B', 'C', 'D', 'E', 'F'};
    private char grade;
    protected int group;
    private String secretNickName;

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public int getGroup() {
        return group;
    }

    public String getSecretNickName() {
        return secretNickName;
    }

    public void setSecretNickName(String mySecretNickName) {
        this.secretNickName = mySecretNickName;
    }

    public void upgrade() {
        for (char c : studentGrade) {
            if (c == grade && c > 'A') {
                grade--;
                return;
            }
        }
    }

    public void downgrade() {
        for (char c : studentGrade) {
            if (c == grade && c < 'F') {
                grade++;
                return;
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Michelle", 'A', 1);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Group: " + student.getGroup());
        student.setSecretNickName("Coco");
        System.out.println("Nick Name: " + student.getSecretNickName());
        student.upgrade();
        System.out.println("Upgraded to: " + student.getGrade());
        student.downgrade();
        System.out.println("Downgraded to: " + student.getGrade());
    }
}
