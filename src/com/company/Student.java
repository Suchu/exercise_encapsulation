package com.company;

public class Student {

    private final char[] studentGrade = {'A', 'B', 'C', 'D', 'E', 'F'};
    private final String secretNickName = "MySecretNickName";
    protected String name;
    protected int group;
    private char grade;

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public static void main(String[] args) {
        Student student = new Student("Michelle", 'A', 1);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Group: " + student.getGroup());
        student.upgrade();
        System.out.println("Upgraded to: " + student.getGrade());
        student.downgrade();
        System.out.println("Downgraded to: " + student.getGrade());
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
}
